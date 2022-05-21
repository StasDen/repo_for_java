package com.lviv.IoT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

class InsuranceManagerTest {

    // Adding necessary stuff
    private InsuranceManager insuranceManager = new InsuranceManager();

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    // Creating the array with enum elements
    InsuranceManager.AdvancedTypesOfInsurances[] advancedTypesOfInsurancesForTest = {
            InsuranceManager.AdvancedTypesOfInsurances.GAP,
            InsuranceManager.AdvancedTypesOfInsurances.BURIAL,
            InsuranceManager.AdvancedTypesOfInsurances.LIFE,
            InsuranceManager.AdvancedTypesOfInsurances.HEALTH,
            InsuranceManager.AdvancedTypesOfInsurances.CASUALTY,
            InsuranceManager.AdvancedTypesOfInsurances.VEHICLE
    };

    @BeforeEach
    void setUp() {

        insuranceManager = new InsuranceManager();

        System.setOut(new PrintStream(outputStreamCaptor, true, StandardCharsets.UTF_8));
    }

    @AfterEach
    void tearDown() {

        System.setOut(standardOut);
    }

    @Test
    public void testFindTypesOfInsurancesOnSaleInSummer() {

        Assertions.assertEquals(Arrays.toString(InsuranceManager.AdvancedTypesOfInsurances.values()),
                Arrays.toString(insuranceManager.findTypesOfInsurancesOnSaleInSummer()));
    }

    @Test
    public void testPrintTypesOfInsurancesOnSaleInSummer() {

        // Calling print function at first
        insuranceManager.printTypesOfInsurancesOnSaleInSummer(advancedTypesOfInsurancesForTest);

        // And now testing the output
        Assertions.assertEquals("Our types of insurances on sale in summer: "
                + Arrays.toString(advancedTypesOfInsurancesForTest), outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSortTypesOfInsurancesInAscendingOrderAndShowIt() {

        insuranceManager.sortTypesOfInsurancesInAscendingOrderAndShowIt(advancedTypesOfInsurancesForTest);

        Assertions.assertEquals("Sorted types of insurances in ascending order: "
                + Arrays.toString(advancedTypesOfInsurancesForTest), outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSortTypesOfInsurancesInDescendingOrderAndShowIt() {

        insuranceManager.sortTypesOfInsurancesInDescendingOrderAndShowIt(advancedTypesOfInsurancesForTest);

        Assertions.assertEquals("Sorted types of insurances in descending order: "
                + Arrays.toString(advancedTypesOfInsurancesForTest), outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSortInsurancesInAscendingOrderAndShowIt() {

        // Adding the necessary ArrayList
        List<AllOfInsurances> casualtyList = new ArrayList<>();
        casualtyList.add(new AllOfInsurances("crime insurance"));
        casualtyList.add(new AllOfInsurances("terrorism coverage"));
        casualtyList.add(new AllOfInsurances("kidnap and ransom coverage"));
        casualtyList.add(new AllOfInsurances("political risk coverage"));

        insuranceManager.sortInsurancesInAscendingOrderAndShowIt(casualtyList);

        Assertions.assertEquals("Sorted list of insurances for some type in ascending order: " + casualtyList,
                outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSortInsurancesInDescendingOrderAndShowIt() {

        List<AllOfInsurances> casualtyList = new ArrayList<>();
        casualtyList.add(new AllOfInsurances("crime insurance"));
        casualtyList.add(new AllOfInsurances("terrorism coverage"));
        casualtyList.add(new AllOfInsurances("kidnap and ransom coverage"));
        casualtyList.add(new AllOfInsurances("political risk coverage"));

        insuranceManager.sortInsurancesInDescendingOrderAndShowIt(casualtyList);

        Assertions.assertEquals("Sorted list of insurances for some type in descending order: " + casualtyList,
                outputStreamCaptor.toString().trim());
    }

}