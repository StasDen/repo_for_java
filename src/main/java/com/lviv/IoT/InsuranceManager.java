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

    // 'values()' enum method returns an array
    public advancedTypesOfInsurances[] findTypesOfInsurancesOnSaleInSummer() {

        return advancedTypesOfInsurances.values();
    }

    public void printTypesOfInsurancesOnSaleInSummer(advancedTypesOfInsurances[] advancedTypesOfInsurances) {

        System.out.println("Our types of insurances on sale in summer: " + Arrays.toString(advancedTypesOfInsurances));
    }

    // Using built-in method to sort our array
    public void sortTypesOfInsurancesInAscendingOrderAndShowIt(advancedTypesOfInsurances[] typesOfInsurances) {

        Arrays.sort(typesOfInsurances);
        System.out.println("Sorted types of insurances in ascending order: " + Arrays.toString(typesOfInsurances));
    }

    // Implementing sorting in descending order as well
    public void sortTypesOfInsurancesInDescendingOrderAndShowIt(advancedTypesOfInsurances[] typesOfInsurances) {

        Arrays.sort(typesOfInsurances, Collections.reverseOrder());
        System.out.println("Sorted types of insurances in descending order: " + Arrays.toString(typesOfInsurances));
    }

    // Using 'Collections.sort()' method to sort our ArrayList
    public void sortInsurancesInAscendingOrderAndShowIt(List<AllOfInsurances> list) {

        list.sort(new SortedList());
        System.out.println("Sorted list of insurances for some type in ascending order: " + list);
    }

    // Implementing sorting in descending order using lambda
    public void sortInsurancesInDescendingOrderAndShowIt(List<AllOfInsurances> list) {

        list.sort(((a, b) -> b.nameOfInsurance.compareTo(a.nameOfInsurance)));
        System.out.println("Sorted list of insurances for some type in descending order: " + list);
    }

}
