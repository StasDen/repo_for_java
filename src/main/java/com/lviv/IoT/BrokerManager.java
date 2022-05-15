package com.lviv.IoT;

public class BrokerManager extends Insurances {

    // Necessary variable for our csv
    private static String position = "Broker manager";

    public final String getName() {

        return position;
    }

    // Using inheritance
    public final void printSomeInfoAboutInsurances() {

        System.out.println("We can offer you such types of insurances: " + TypesOfInsurances.VEHICLE + ", "
                + TypesOfInsurances.HEALTH + " and " + TypesOfInsurances.CASUALTY + ".");
    }

    // Functions for our csv
    public String getHeaders() {

        return "Position";
    }

    public String toCSV() {

        return getName();
    }

}
