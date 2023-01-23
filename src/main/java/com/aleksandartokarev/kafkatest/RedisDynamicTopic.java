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
        Thread.sleep(5000);
        ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:5000/api/v1/topic", String.class);
        return result.getBody();
    }

}
