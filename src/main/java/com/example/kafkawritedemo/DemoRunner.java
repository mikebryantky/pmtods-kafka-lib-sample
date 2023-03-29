package com.example.kafkawritedemo;

import com.bofa.pmtodskafkalib.KafkaSendService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

/**
 * This class just sends random messages
 * every five seconds to the <i>KafkaSendService</i>
 * service.
 *
 * <b>This class will not be used in production.</b>
 * <p>
 * This class does use <i>ObjectMapper</i> as an example
 * of converting an object to JSON string.
 */
@Component
public class DemoRunner implements CommandLineRunner {
    private final KafkaSendService kafkaSendService;
    private final ObjectMapper objectMapper;

    public DemoRunner(KafkaSendService kafkaSendService,
                      ObjectMapper objectMapper) {
        this.kafkaSendService = kafkaSendService;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started application...");
    }

    @Scheduled(initialDelay = 5000, fixedRate = 5000)
    public void sendRandomMessage() {
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setFirstName(randomString());
        customer.setLastName(randomString());
        customer.setTransactionDate(LocalDateTime.now());

        try {
            // Convert the Customer object to a JSON String
            String customerJson = objectMapper.writeValueAsString(customer);

            System.out.println("Sending: " + customerJson);
            // Send the JSON String to the KafkaSendService class.
            kafkaSendService.sendMessage(customerJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int length = 10;

        return new Random().ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
