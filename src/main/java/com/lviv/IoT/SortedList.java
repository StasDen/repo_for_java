package com.lviv.IoT;

import java.io.Serializable;
import java.util.Comparator;

// Implementing comparator interface to sort our lists
public class SortedList implements Comparator<AllOfInsurances>, Serializable {

    // Function to sort list of objects in ascending order
    public final int compare(final AllOfInsurances a, final AllOfInsurances b) {

        return a.getNameOfInsurance().compareTo(b.getNameOfInsurance());
    }

}
