package com.lviv.IoT;

public class BrokerManager extends Insurances {

    private static String name = "Harry";

    public final String getName() {

        return name;
    }

    // Using inheritance
    public final void printSomeInfoAboutInsurances() {

        System.out.println("We can offer you such types of insurances: " + TypesOfInsurances.VEHICLE + ", "
                + TypesOfInsurances.HEALTH + " and " + TypesOfInsurances.CASUALTY + ".");
    }

    public String getHeaders() {

        return "name";
    }

    public String toCSV() {

        return getName();
    }

}
