package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class InsuranceBrokerTest {
    private InsuranceBroker insuranceBroker;

    @BeforeEach
    void setUp() {

        insuranceBroker = new InsuranceBroker();

        System.out.println("The test has started");
    }

    @AfterEach
    void tearDown() {

        System.out.println("The test has finished");
    }

    @Test
    public void testPrintInfoAboutInsuranceBroker() {

        Assertions.assertEquals("InsuranceBroker[name=James Grey, workExperienceInYears=10.5," +
                " jobAddress=Green St., workSchedule=Monday-Friday]", insuranceBroker.toString());
    }

}