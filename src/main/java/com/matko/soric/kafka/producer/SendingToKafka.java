package com.matko.soric.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class SendingToKafka {

    private final static String TOPIC_MALE = "us-census-male";
    private final static String TOPIC_FEMALE = "us-census-female";

    private static final Logger LOGGER = Logger.getLogger(SendingToKafka.class.getName());


    public static void main(String[] args)throws IOException {

        String location = "src/main/resources/sample.csv";
//        String location = "src/main/resources/census-data/";

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 20_000);
        props.put("linger.ms", 2);
        props.put("buffer.memory", 35_000_000);

        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

        Producer<Integer, String> producer = new KafkaProducer<Integer, String>(props);

        try (Stream<Path> paths = Files.walk(Paths.get(location))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach( file -> {
                                try (Stream<String> stream = Files.lines( file)) {
                                    stream.skip(1).forEach(line -> {
                                                if (Integer.parseInt(line.split(",")[56]) == 0) {
                                                    sendToKafka (line, TOPIC_MALE, producer);
                                                } else {
                                                    sendToKafka (line, TOPIC_FEMALE, producer);
                                                }
                                            }
                                    );
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                    );
        }



    }

    private static void sendToKafka (String line, String topic, Producer producer) {

        LOGGER.log(Level.INFO, topic +":  " +  line );

        ProducerRecord producerRecord = new ProducerRecord<Integer, String>(topic,
                Integer.parseInt(line.split(",")[0]), line);
        try {
            producer.send(producerRecord).get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
