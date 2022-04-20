package com.lviv.IoT;

import java.util.*;
import java.util.List;

// Our class 'Manager' for some sorting functions
public class InsuranceManager {

    public String[] advancedTypesOfInsurances = {"vehicle", "health", "casualty", "gap", "life", "burial"};

    public void showAdvancedTypesOfInsurances() {

        System.out.println("Our advanced types of insurances: " + Arrays.toString(advancedTypesOfInsurances));
    }

    // Not all types of insurances are on sale in summer
    public String findAndShowTypesOfInsurancesOnSaleInSummer() {

        String[] typesOfInsurancesOnSaleInSummer = {"health", "casualty", "gap", "life"};

        System.out.println("Our types of insurances on sale in summer: " + Arrays.toString(typesOfInsurancesOnSaleInSummer));

        return Arrays.toString(typesOfInsurancesOnSaleInSummer);
    }

    public void sortTypesOfInsurances(String[] typesOfInsurances) {

        // Using built-in method to sort our array
        Arrays.sort(typesOfInsurances);
        System.out.println("Sorted types of insurances in ascending order: " + Arrays.toString(typesOfInsurances));

        // Implementing sorting in descending order as well
        Arrays.sort(typesOfInsurances, Collections.reverseOrder());
        System.out.println("Sorted types of insurances in descending order: " + Arrays.toString(typesOfInsurances));
    }

    public void sortInsurances(List<AllOfInsurances> list) {

        // Using 'Collections.sort()' method to sort our ArrayList
        // Using here our class 'SortedList'
        // Method can be written in a such way too
        list.sort(new SortedList());
        System.out.println("Sorted list of insurances for some type in ascending order: " + list);

        // Implementing sorting in descending order as well using lambda
        list.sort(((a, b) -> b.nameOfInsurance.compareTo(a.nameOfInsurance)));
        System.out.println("Sorted list of insurances for some type in descending order: " + list);
    }

}
