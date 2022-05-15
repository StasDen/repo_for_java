package com.lviv.IoT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Our class 'Manager' for some sorting functions
public class InsuranceManager {

    // Using enum type
    public enum AdvancedTypesOfInsurances {
        VEHICLE,
        HEALTH,
        CASUALTY, // Check naming convention
        GAP,
        LIFE,
        BURIAL
    }

    // 'values()' enum method returns an array
    public final AdvancedTypesOfInsurances[] findTypesOfInsurancesOnSaleInSummer() {

        return AdvancedTypesOfInsurances.values();
    }

    public final void printTypesOfInsurancesOnSaleInSummer(final AdvancedTypesOfInsurances[] advancedTypesOfInsurances) {

        System.out.println("Our types of insurances on sale in summer: " + Arrays.toString(advancedTypesOfInsurances));
    }

    // Using built-in method to sort our array
    public final void sortTypesOfInsurancesInAscendingOrderAndShowIt(final AdvancedTypesOfInsurances[] typesOfInsurances) {

        Arrays.sort(typesOfInsurances);
        System.out.println("Sorted types of insurances in ascending order: " + Arrays.toString(typesOfInsurances));
    }

    // Implementing sorting in descending order as well
    public final void sortTypesOfInsurancesInDescendingOrderAndShowIt(final AdvancedTypesOfInsurances[] typesOfInsurances) {

        Arrays.sort(typesOfInsurances, Collections.reverseOrder());
        System.out.println("Sorted types of insurances in descending order: " + Arrays.toString(typesOfInsurances));
    }

    // Using 'Collections.sort()' method to sort our ArrayList
    public final void sortInsurancesInAscendingOrderAndShowIt(final List<AllOfInsurances> list) {

        // Using 'SortedList' class to do this
        list.sort(new SortedList());
        System.out.println("Sorted list of insurances for some type in ascending order: " + list);
    }

    // Implementing sorting in descending order using lambda
    public final void sortInsurancesInDescendingOrderAndShowIt(final List<AllOfInsurances> list) {

        list.sort(((a, b) -> b.getNameOfInsurance().compareTo(a.getNameOfInsurance())));
        System.out.println("Sorted list of insurances for some type in descending order: " + list);
    }

}
