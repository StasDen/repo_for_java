package com.lviv.IoT;

// A class for our lists
public class AllOfInsurances {

    private final String nameOfInsurance;

    public AllOfInsurances(final String nameOfInsurance) {

        this.nameOfInsurance = nameOfInsurance;
    }

    // Function to print info in the right way
    public final String toString() {

        return this.nameOfInsurance;
    }

    // Using one more getter for private variable
    public final String getNameOfInsurance() {

        return nameOfInsurance;
    }

}
