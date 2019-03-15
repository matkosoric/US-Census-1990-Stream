# Streaming US Census data

This is my data streaming demonstration with census information collected in United States in 1990.
Initial data is in csv file.
Kafka producer reads it, adds a timestamp in epoch time to enable Grafana monitoring, and sends it to a local instance of Kafka, creating two different topics (us-census-male and us-census-female), depending on the gender code.
Spark Streaming application is subscribed to both topics, and configured to send data to Postgres, MongoDB, and ElasticSearch.
To demonstrate ETL and data enrichment, some columns (like gender, age, marital status, etc.) are transformed from codes to original values, and passed along to MongoDB and ElasticSearch.
MongoDB and ElasticSearch contain records from both topics, male and female.
PostgreSQL gets only raw data from a male topic.
Grafana is connected to ElasticSearch and Postgres for monitoring.

###### Streaming
![Streaming - Matko Soric](https://raw.githubusercontent.com/matkosoric/US-Census-1990-Stream/master/src/main/resources/streaming.gif?raw=true "Streaming - Matko Sorić")

  
### Dataset

I downloaded the dataset from UCI Machine Learning Repository.
Data contains only codes, so each column is a numeric type.
Uncompressed csv file has about 360 MB.  
[US Census Data (1990)](https://archive.ics.uci.edu/ml/machine-learning-databases/census1990-mld/)

Code mappings are here:  
[Mappings](https://archive.ics.uci.edu/ml/machine-learning-databases/census1990-mld/USCensus1990raw.attributes.txt)


### Tools

[Spark Spreaming 2.4.0](https://spark.apache.org/docs/2.4.0/streaming-programming-guide.html)  
[Kafka 2.1](https://kafka.apache.org/downloads)  
[PostgreSQL 10.6](https://www.postgresql.org/docs/10/release-10-6.html)  
[MongoDB 4.0.5](https://docs.mongodb.com/manual/release-notes/4.0/)  
[ElasticSearch 6.6.3](https://www.elastic.co/guide/en/elasticsearch/reference/current/release-notes-6.6.1.html)
[Grafana 5.4.3](http://docs.grafana.org/guides/whats-new-in-v5-4/)


### Results



##### Mongo screenshot
![MongoDB - Matko Soric](https://raw.githubusercontent.com/matkosoric/US-Census-1990-Stream/master/src/main/resources/mongo_compass.png?raw=true "MongoDB - Matko Sorić")

