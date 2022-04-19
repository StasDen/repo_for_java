package com.lviv.IoT;

import java.util.*;
import java.util.List;

// Our class 'Manager' for some sorting functions
public class InsuranceManager {

    public String[] advancedTypesOfInsurances = {"vehicle", "health", "casualty", "gap", "life", "burial"};

    public void sortTypesOfInsurances(String[] advancedTypesOfInsurances) {

        // Using built-in method to sort our array
        Arrays.sort(advancedTypesOfInsurances);
        System.out.println("Sorted types of insurances in ascending order: " + Arrays.toString(advancedTypesOfInsurances));

        // Implementing sorting in descending order as well
        Arrays.sort(advancedTypesOfInsurances, Collections.reverseOrder());
        System.out.println("Sorted types of insurances in descending order: " + Arrays.toString(advancedTypesOfInsurances));
    }

    public void sortInsurances(List<AllOfInsurances> list) {

        // Using 'Collections.sort()' method to sort our ArrayList
        // Method can be written in a such way
        // Using here our class 'SortedList'
        list.sort(new SortedList());
        System.out.println("Sorted list of insurances for some type in ascending order: " + list);

        // Implementing sorting in descending order as well using lambda
        list.sort(((a, b) -> b.nameOfInsurance.compareTo(a.nameOfInsurance)));
        System.out.println("Sorted list of insurances for some type in descending order: " + list);
    }

}
