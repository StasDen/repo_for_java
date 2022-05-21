package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class RegexTest {

    private Regex regex;

    @BeforeEach
    void setUp() {

        regex = new Regex();
    }

    @AfterEach
    void tearDown() {
    }

    // Testing our regular expression
    @Test
    void testMainRegex() {

        Assertions.assertEquals("Who are you?", regex.mainRegex("Who are you?", 3));

        Assertions.assertEquals("Who are you right now ?", regex.mainRegex(
                "Who are you right now ?", 3));

        Assertions.assertEquals("Where are you?", regex.mainRegex("Where are you?",
                3));

        Assertions.assertEquals("Where are you at the moment?", regex.mainRegex(
                "Where are you at the moment?", 3));

        Assertions.assertEquals("How much?", regex.mainRegex("How much?",
                2));

        Assertions.assertEquals("How much", regex.mainRegex("How much",
                2));
    }

}