package com.aleksandartokarev.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RedisDynamicTopic {


    @Autowired
    private RestTemplate restTemplate;
    public String whichTopicToUse() throws InterruptedException {
        // Simulating artifical delay - call to external service
        Thread.sleep(5000);
        return "test.topic";
        // Here instead of returning a fixed topic name - we can call a REST Service,
        // call DynamoDB, call Redis for coordination, etc
//        ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:5000/api/v1/topic", String.class);
//        return result.getBody();
    }

}
