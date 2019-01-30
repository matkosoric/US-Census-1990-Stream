package com.matko.soric;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;


public class PostgresTest {


    public static void main(String[] args) throws Exception {

        SparkSession spark = SparkSession
                .builder()
                .master("local[*]")
                .appName("Java Spark SQL basic example")
                .getOrCreate();


        Dataset<Row> jdbcDF = spark.read()
                .format("jdbc")
                .option("url", "jdbc:postgresql:postgres")
                .option("dbtable", "public.textbooks")
                .option("user", "postgres")
                .option("password", "matko")
                .load();

        jdbcDF.show();

    }

}
