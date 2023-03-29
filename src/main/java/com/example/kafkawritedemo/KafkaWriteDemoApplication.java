package com.example.kafkawritedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {
        "com.example.kafkawritedemo",
        "com.bofa.pmtodskafkalib"}
)
public class KafkaWriteDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWriteDemoApplication.class, args);
    }

}
