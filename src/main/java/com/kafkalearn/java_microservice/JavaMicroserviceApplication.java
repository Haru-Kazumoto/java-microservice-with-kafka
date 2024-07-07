package com.kafkalearn.java_microservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class JavaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMicroserviceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner sendMessage(KafkaTemplate<String, String> kafkaTemplate) {
//		return args -> {
//			for (int i = 0; i < 10; i++) {
//				kafkaTemplate.send("kafkalearn", String.format("Hello kafka from java spring boot %d", i));
//			}
//		};
//	}

}
