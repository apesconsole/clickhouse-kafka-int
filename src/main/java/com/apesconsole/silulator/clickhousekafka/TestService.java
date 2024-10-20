package com.apesconsole.silulator.clickhousekafka;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Service
public class TestService {
/*
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	private void dropMaterializedView() {
        String dropViewSql = "DROP TABLE IF EXISTS mv_iot_data";
        jdbcTemplate.execute(dropViewSql);
        log.info("Dropped materialized view: ");
    }

    public void updateMaterializedView(String deviceId, String status) {
    	dropMaterializedView();
        StringBuilder queryBuilder = new StringBuilder("CREATE MATERIALIZED VIEW mv_iot_data TO kafka_output_que AS SELECT * FROM iot_device_data WHERE ");

        if (deviceId != null) {
            queryBuilder.append(" device_id like '%").append(deviceId).append("%'");
        }
        if (status != null) {
            queryBuilder.append(" AND status = '").append(status).append("'");
        }
        queryBuilder.append(" FORMAT JSONEachRow");
        
        String dynamicQuery = queryBuilder.toString();
        long start = System.currentTimeMillis();
        jdbcTemplate.execute(dynamicQuery);
        long end = System.currentTimeMillis();
        log.info("Filter Applied. Time Taken = " + (end - start));
    }
    
    private static final String sql = "INSERT INTO iot_device_data (device_id, temperature, humidity, timestamp, status) VALUES (?, ?, ?, ?, ?)";
    
    public void insertData(int i) {
    	log.info("Generate Data - Start");
    	String deviceId = "device-" + (i + 1);
        float temperature = 15 + RANDOM.nextFloat() * 20; // Random temperature between 15 and 35
        float humidity = 30 + RANDOM.nextFloat() * 40; // Random humidity between 30 and 70
        LocalDateTime timestamp = LocalDateTime.now().minusSeconds(RANDOM.nextInt(3600)); // Random time within the last hour
        String status = STATUS_VALUES[RANDOM.nextInt(STATUS_VALUES.length)];
        log.info("deviceId=" + deviceId + "&temperature=" + temperature + "&humidity=" + humidity + "&timestamp=" + "&status=" + status);
        // Insert the record into the ClickHouse database
        jdbcTemplate.update(sql, deviceId, temperature, humidity, timestamp, status);
    }
    
    private static final String[] STATUS_VALUES = {"active", "inactive", "maintenance", "faulty"};
    private static final Random RANDOM = new Random();
    
    public void generateAndInsertData(int recordCount) {
    	log.info("Generate Data - Start");
        long start = System.currentTimeMillis();
        IntStream.range(0, recordCount).forEach(i -> {
        	insertData(i);
        });
        long end = System.currentTimeMillis();
        log.info(recordCount + " IoT records generated and inserted into ClickHouse. Time Taken = " + (end - start));
    }
    */
}
