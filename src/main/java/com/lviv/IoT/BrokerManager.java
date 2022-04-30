package com.lviv.IoT;

// Inheritance is here
public class BrokerManager extends Insurances {

    public void printSomeInfoAboutInsurances() {

        System.out.println("We can offer you such types of insurances: " + typesOfInsurances.vehicle + ", "
                + typesOfInsurances.health + " and " + typesOfInsurances.casualty + ".");
    }

}
