package com.apesconsole.silulator.clickhousekafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class IotDataAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IotDataAppApplication.class, args);
    }
    
    //@Autowired
   //private TestService testService;

	@Override
	public void run(String... args) throws Exception {
		//testService.generateAndInsertData(0);
	}
}
