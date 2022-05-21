package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class SortedListTest {

    private SortedList sortedList;

    @BeforeEach
    void setUp() {

        sortedList = new SortedList();

        System.out.println("The test has started");
    }

    @AfterEach
    void tearDown() {

        System.out.println("The test has finished");
    }

    @Test
    public void testCompare() {

        AllOfInsurances a = new AllOfInsurances("First test obj");
        AllOfInsurances b = new AllOfInsurances("Second test obj");

        Assertions.assertEquals(a.getNameOfInsurance().compareTo(b.getNameOfInsurance()), sortedList.compare(a, b));
    }

}