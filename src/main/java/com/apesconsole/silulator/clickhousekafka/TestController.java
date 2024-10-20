package com.apesconsole.silulator.clickhousekafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
/*
    @Autowired
    private TestService testService;

    @GetMapping("/filter")
    public String filter(@RequestParam(required = false) String deviceId,
                         @RequestParam(required = false) String status) {
    	testService.updateMaterializedView(deviceId, status);
        return "Filter applied, data is being pushed to Kafka.";
    }
    
    @GetMapping("/create")
    public String create() {
    	testService.insertData(1);
        return "Generated 1 Record";
    }
*/    
}
