package com.kafkalearn.java_microservice.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "kafkalearn", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received : " + data);
    }

}
