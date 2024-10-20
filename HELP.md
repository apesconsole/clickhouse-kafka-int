https://chistadata.com/streaming-clickhouse-data-to-kafka/
### create the cluster 
```
.\clickhouse-kafka-int\docker-compose up -d
```
### log into clickhouse cli
```
docker exec -it clickhouse-kafka-int-clickhouse_kafka-1 clickhouse-client

CREATE TABLE kafka_push
(ID UInt64,
Name String) 
ENGINE = Kafka
SETTINGS kafka_broker_list = 'apesconsole:9092',
         kafka_topic_list = 'iot_device_data_topic',
         kafka_group_name = 'consumer_group_push',
         kafka_format = 'JSONEachRow';
		 
CREATE TABLE kafka_storage
(ID UInt64,
Name String) 
ENGINE = MergeTree()
ORDER BY (ID, Name);

CREATE MATERIALIZED VIEW kafka_push_materialized TO kafka_push AS SELECT ID, Name
FROM kafka_storage;

```
### Start the Spring application - Kafka Consumer
```
localhost:9092 - Kafka Broker
```
### create data and check the java consumer
```
INSERT INTO kafka_storage VALUES (1,1);
```