import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingData {

    public static void main(String[] args) {

        String location = new String("src/main/resources/USCensus1990.data.txt");


        try (Stream<String> stream = Files.lines(Paths.get(location))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
