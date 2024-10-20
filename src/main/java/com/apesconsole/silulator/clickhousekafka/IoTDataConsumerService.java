package com.apesconsole.silulator.clickhousekafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class IoTDataConsumerService {

    @KafkaListener(topics = "kafka_push_example", groupId = "iot-group")
    public void consume(ConsumerRecord<String, String> record) {
        String key = record.key();
        String value = record.value();
        System.out.println("Consumed message with key: " + key + ", value: " + value);
        // Add further processing logic here, e.g., storing to a database or triggering other services
    }
}