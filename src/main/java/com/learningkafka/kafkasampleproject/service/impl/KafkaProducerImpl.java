package com.learningkafka.kafkasampleproject.service.impl;

import com.learningkafka.kafkasampleproject.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerImpl implements KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "topic-sachin_kumar";

    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }
}