package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class KateBushTest {

    public KateBush kateBush;
    public BrokerManager brokerManager;

    @BeforeEach
    void setUp() {

        kateBush = new KateBush();
        brokerManager = new BrokerManager();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetProfessionalRewards() {

        String professionalRewards = "Diploma for being a professional";

        Assertions.assertEquals(professionalRewards, kateBush.getProfessionalRewards());
    }

    @Test
    void testGetHeaders() {

        Assertions.assertEquals(brokerManager.getHeaders() + ", " + "Professional rewards",
                kateBush.getHeaders());
    }

    @Test
    void testToCSV() {

        Assertions.assertEquals(brokerManager.toCSV() + ", " + kateBush.getProfessionalRewards(),
                kateBush.toCSV());
    }

}