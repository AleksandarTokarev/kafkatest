package com.aleksandartokarev.kafkatest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class KafkaListenerExample {

    Logger LOG = LoggerFactory.getLogger(KafkaListenerExample.class);

    @KafkaListener(topics = "#{@redisDynamicTopic.whichTopicToUse()}")
    void listener(String data) {
        LOG.info(data);
    }

}