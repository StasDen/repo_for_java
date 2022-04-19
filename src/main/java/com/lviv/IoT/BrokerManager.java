package com.lviv.IoT;

import java.util.List;

// Inheritance is here
public class BrokerManager extends Insurances {

    public void printSomeInfoAboutInsurances() {

        System.out.println("We can offer you such types of insurances: " + typesOfInsurances[0] + ", "
                + typesOfInsurances[1] + " and " + typesOfInsurances[2] + ".");
    }

    // Demo functions
    public String findAnInsuranceForClientType(String clientType, List<AllOfInsurances> list) {

        return null;
    }

    public String advisePacksForInsurances(List<PacksOfInsurances> list, int costOfPack) {

        return null;
    }

}
