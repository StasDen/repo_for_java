package com.lviv.IoT;

import java.io.Serializable;
import java.util.Comparator;

// Implementing comparator interface to sort our lists
// 'Serializable' means we can work with bytes
public class SortedList implements Comparator<AllOfInsurances>, Serializable {

    // Function to sort list of objects in ascending order
    public final int compare(final AllOfInsurances a, final AllOfInsurances b) {

        return a.getNameOfInsurance().compareTo(b.getNameOfInsurance());
import java.util.Comparator;

// Implementing comparator interface to sort our lists
public class SortedList implements Comparator<AllOfInsurances> {

    // Function to sort list of objects in ascending order
    public int compare(AllOfInsurances a, AllOfInsurances b) {

        return a.nameOfInsurance.compareTo(b.nameOfInsurance);
    }

}
