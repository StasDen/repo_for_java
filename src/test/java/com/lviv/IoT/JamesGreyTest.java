package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class JamesGreyTest {

    public JamesGrey jamesGrey;
    public BrokerManager brokerManager;

    @BeforeEach
    void setUp() {

        jamesGrey = new JamesGrey();
        brokerManager = new BrokerManager();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testGetHeaders() {

        Assertions.assertEquals(brokerManager.getHeaders() + ", " + " Work schedule", jamesGrey.getHeaders());
    }

    @Test
    public void testToCSV() {

        Assertions.assertEquals(brokerManager.toCSV() + ", " + jamesGrey.getWorkSchedule(), jamesGrey.toCSV());
    }

    @Test
    public void testGetWorkSchedule() {

        String workSchedule = "Monday-Friday";

        Assertions.assertEquals(workSchedule, jamesGrey.getWorkSchedule());
    }

}