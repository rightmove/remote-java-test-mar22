package com.rightmove.property.data.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;

class PropertyDataClientImplTest {

    private PropertyDataClient underTest;
    private HttpClient httpClient;

    @BeforeEach
    void setUp() {
        underTest = new PropertyDataClientImpl(new ObjectMapper(), HttpClient.newBuilder().build(), "https://www.rightmove.com/data/property-data.json");
    }

    @Test
    void getProperties() {
    }
}
