package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class AdamSmithTest {

    private AdamSmith adamSmith = new AdamSmith();
    private BrokerManager brokerManager = new BrokerManager();

    // Every new func test - new obj
    @BeforeEach
    void setUp() {

        adamSmith = new AdamSmith();
        brokerManager = new BrokerManager();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testGetJobAddress() {

        String jobAddress = "Oxford Street";

        // Using 'Assertions.assertEquals()' to test the output
        Assertions.assertEquals(jobAddress, adamSmith.getJobAddress());
    }

    @Test
    public void testGetHeaders() {

        Assertions.assertEquals(brokerManager.getHeaders() + ", " + "Job address", adamSmith.getHeaders());
    }

    @Test
    public void testToCSV() {

        Assertions.assertEquals(brokerManager.toCSV() + ", " + adamSmith.getJobAddress(), adamSmith.toCSV());
    }

}