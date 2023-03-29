//package com.example.kafkawritedemo.config;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Most options in Jackson ObjectMapper can be configured via
// * application.yaml and the default (preferred) ObjectMapper
// * is already included in the pmtods-kafka-lib.jar file.
// * This is provided as an example of how an application
// * may configure special instances as needed.
// *
// * ObjectMapper bean is defined here.
// * There are many other options to configure
// * the <i>ObjectMapper</i>, however.  See below for
// * more information.
// *
// * @see <a href="https://www.baeldung.com/jackson-object-mapper-tutorial">ObjectMapper Tutorial</a>
// * @see <a href="https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/ObjectMapper.html">ObjectMapper JavaDoc</a>
// */
//@Configuration
//public class ObjectMapperConfig {
//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//        mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
//
//        return mapper;
//    }
//}
