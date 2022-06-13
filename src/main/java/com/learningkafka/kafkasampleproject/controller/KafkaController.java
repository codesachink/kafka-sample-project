package com.learningkafka.kafkasampleproject.controller;

import com.learningkafka.kafkasampleproject.service.impl.KafkaProducerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    KafkaProducerImpl kafkaProducer;

    @GetMapping(value = "/producer")
    public String produceMessage(@RequestParam("message") String message) {
        kafkaProducer.send(message);

        return "Message sent to the Kafka Topic topic-sachin_kumar Successfully";
    }

}