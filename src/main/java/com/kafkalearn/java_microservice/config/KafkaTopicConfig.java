package com.kafkalearn.java_microservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkalearnTopic() {
        return TopicBuilder.name("kafkalearn").build();
    }

}
