package com.spring.graphql.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.graphql.example.domain.BankDetails;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class JsonParser {

    public static void main(String[] args) throws Exception {
        InputStream in = new ClassPathResource(
                "banks_in_usa.json").getInputStream();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<BankDetails> bankDetails = Arrays.asList(objectMapper.readValue(in, BankDetails[].class));
    }
}
