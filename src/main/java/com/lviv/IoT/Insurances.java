package com.lviv.IoT;

// Class for inheritance
public class Insurances {

    // Some info about our insurances
    public enum TypesOfInsurances {
        VEHICLE,
        HEALTH,
        CASUALTY
    }

    public enum typesOfInsurances {
        vehicle,
        health,
        casualty
    }

    public int[] costOfInsurancesInUSDPerMonth = {50, 100, 250};
    public int[] durationOfInsurancesInMonths = {1, 3, 6, 12, 24};

}
