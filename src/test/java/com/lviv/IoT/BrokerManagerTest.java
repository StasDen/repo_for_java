package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Assertions;

class BrokerManagerTest {

    private BrokerManager brokerManager;

    // Creating necessary variables to check printed output
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {

        brokerManager = new BrokerManager();

        // New out here
        System.setOut(new PrintStream(outputStreamCaptor, true, StandardCharsets.UTF_8));
    }

    @AfterEach
    void tearDown() {

        // Returning standard out
        System.setOut(standardOut);
    }

    // Func 'trim()' deleting all unnecessary raws
    @Test
    public void testPrintSomeInfoAboutInsurances() {

        brokerManager.printSomeInfoAboutInsurances();

        Assertions.assertEquals("We can offer you such types of insurances: "
                + Insurances.TypesOfInsurances.VEHICLE + ", " + Insurances.TypesOfInsurances.HEALTH + " and "
                + Insurances.TypesOfInsurances.CASUALTY + ".", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testGetHeaders() {

        Assertions.assertEquals("name", brokerManager.getHeaders());
    }

    @Test
    public void testToCSV() {

        String name = "Harry";

        Assertions.assertEquals(name, brokerManager.toCSV());
    }

}