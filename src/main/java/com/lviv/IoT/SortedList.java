package com.lviv.IoT;

import java.util.Comparator;

// Implementing comparator interface to sort our lists
public class SortedList implements Comparator<AllOfInsurances> {

    // Function to sort list of objects in ascending order
    public int compare(AllOfInsurances a, AllOfInsurances b) {

        return a.nameOfInsurance.compareTo(b.nameOfInsurance);
    }

}
