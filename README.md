# Kafka Write Demo
This application sends a random JSON text string to a Kafka Topic.

## Prerequisites
1. Docker Desktop
2. Java JDK 11
3. Maven

## Running the Demo
1. From the home directory, run the command: \
   `docker-compose up`
2. Once the Docker containers start, run the command: \
   `mvnw spring-boot:run`
3. Every five seconds a randomly generated Customer \
   record will be sent to a Kafka Topic.
