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
      
// Inheritance is here
public class BrokerManager extends Insurances {

    public void printSomeInfoAboutInsurances() {

        System.out.println("We can offer you such types of insurances: " + typesOfInsurances.vehicle + ", "
                + typesOfInsurances.health + " and " + typesOfInsurances.casualty + ".");
    }

}
