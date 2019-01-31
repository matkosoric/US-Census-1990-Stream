package com.matko.soric.kafka.to.postgres.and.mongo;

import com.matko.soric.model.CensusRecord;
import com.mongodb.spark.MongoSpark;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;
import com.mongodb.spark.sql.*;

import java.util.*;

public class KafkaToPostgresAndMongo {

    public static void main(String[] args) throws Exception {

        Logger.getLogger("org").setLevel(Level.OFF);
        Logger.getLogger("akka").setLevel(Level.OFF);

        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "postgres");
        connectionProperties.put("password", "matko");

        SparkSession spark = SparkSession
                .builder()
                .master("local[*]")
                .appName("Spark Kafka to Postgres and Mongo")
                .config("spark.mongodb.output.uri", "mongodb://127.0.0.1:27017/")
                .config("spark.mongodb.output.database", "us-census")
                .config("spark.mongodb.output.collection", "year1990")
                .config("spark.mongodb.output.maxBatchSize", "1024")

                .getOrCreate();

        JavaSparkContext ctx = JavaSparkContext.fromSparkContext(SparkContext.getOrCreate());
        JavaStreamingContext jsc = new JavaStreamingContext(ctx, new Duration(10000));

        Map<String, Object> kafkaParams = new HashMap<>();
        kafkaParams.put("bootstrap.servers", "localhost:9092");
        kafkaParams.put("key.deserializer", IntegerDeserializer.class);
        kafkaParams.put("value.deserializer", StringDeserializer.class);
        kafkaParams.put("group.id", "us-census");
        kafkaParams.put("auto.offset.reset", "earliest");
        kafkaParams.put("enable.auto.commit", false);

        Collection<String> topics = Arrays.asList("us-census-male", "us-census-female");

        JavaInputDStream<ConsumerRecord<String, String>> stream =
                KafkaUtils.createDirectStream(
                        jsc,
                        LocationStrategies.PreferConsistent(),
                        ConsumerStrategies.<String, String>Subscribe(topics, kafkaParams)
                );

        JavaDStream<CensusRecord> censusRecordJavaDStream = stream.map(new Function<ConsumerRecord<String,String>, CensusRecord>() {
            @Override
            public CensusRecord call(ConsumerRecord<String, String> kafkaRecord) throws Exception {

                Integer[] parameters=new Integer[kafkaRecord.value().split(",").length];
                int i=0;
                for(String str : kafkaRecord.value().split(",")){
                    parameters[i]=Integer.parseInt(str);
                    i++;
                }

                CensusRecord currentCensusRecord = new CensusRecord(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5], parameters[6],
                                                                    parameters[7], parameters[8], parameters[9], parameters[10], parameters[11], parameters[12], parameters[13],
                                                                    parameters[14], parameters[15], parameters[16], parameters[17], parameters[8], parameters[19], parameters[20],
                                                                    parameters[21], parameters[22], parameters[23], parameters[24], parameters[25], parameters[26], parameters[27],
                                                                    parameters[28],parameters[29], parameters[30], parameters[31], parameters[32], parameters[33], parameters[34],
                                                                    parameters[35],parameters[36], parameters[37], parameters[38], parameters[39], parameters[40], parameters[41],
                                                                    parameters[42], parameters[43], parameters[44], parameters[45], parameters[46], parameters[47], parameters[48],
                                                                    parameters[49], parameters[50], parameters[51], parameters[52], parameters[53], parameters[54], parameters[55],
                                                                    parameters[56], parameters[57], parameters[58], parameters[59], parameters[60], parameters[61], parameters[62],
                                                                    parameters[63], parameters[64], parameters[65], parameters[66], parameters[67], parameters[68]);


                return currentCensusRecord;
            }
        });

        censusRecordJavaDStream.map(e -> {
            Row row = RowFactory.create(e.getAllValues());
            return row;
        }).foreachRDD(rdd -> {

            Dataset<Row> censusDataSet = spark.createDataFrame(rdd, CensusRecord.getStructType());
            MongoSpark.save(censusDataSet);

            rdd.filter(row -> row.getLong(56) == 0);

            censusDataSet
                    .write()
                    .mode(SaveMode.Append)
                    .jdbc("jdbc:postgresql:postgres", "census.census", connectionProperties);


        });

        censusRecordJavaDStream.print(10);

        jsc.start();
        jsc.awaitTermination();
        jsc.close();


    }

}
