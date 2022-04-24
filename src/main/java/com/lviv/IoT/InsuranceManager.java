package com.lviv.IoT;

import java.util.*;
import java.util.List;

// Our class 'Manager' for some sorting functions
public class InsuranceManager {

    public enum advancedTypesOfInsurances {
        vehicle,
        health,
        casualty,
        gap,
        life,
        burial
    }

    public advancedTypesOfInsurances[] findTypesOfInsurancesOnSaleInSummer() {

        return new advancedTypesOfInsurances[]{
                advancedTypesOfInsurances.vehicle,
                advancedTypesOfInsurances.health,
                advancedTypesOfInsurances.casualty,
                advancedTypesOfInsurances.gap,
                advancedTypesOfInsurances.life,
                advancedTypesOfInsurances.burial
        };
    }

    public void printTypesOfInsurancesOnSaleInSummer(advancedTypesOfInsurances[] advancedTypesOfInsurances) {

        System.out.println("Our types of insurances on sale in summer: " + Arrays.toString(advancedTypesOfInsurances));
    }

    public void sortAndShowTypesOfInsurances(advancedTypesOfInsurances[] typesOfInsurances) {

        // Using built-in method to sort our array
        Arrays.sort(typesOfInsurances);
        System.out.println("Sorted types of insurances in ascending order: " + Arrays.toString(typesOfInsurances));

        // Implementing sorting in descending order as well
        Arrays.sort(typesOfInsurances, Collections.reverseOrder());
        System.out.println("Sorted types of insurances in descending order: " + Arrays.toString(typesOfInsurances));
    }

    public void sortAndShowInsurances(List<AllOfInsurances> list) {

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
