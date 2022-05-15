package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class AllOfInsurancesTest {

    private AllOfInsurances allOfInsurances;

    @BeforeEach
    void setUp() {

        allOfInsurances = new AllOfInsurances("For test");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {

        Assertions.assertEquals("For test", allOfInsurances.toString());
    }

}