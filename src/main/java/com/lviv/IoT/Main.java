package com.lviv.IoT;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Here you can see all the information about our head insurance broker James Grey
        // Our chain of constructors is used
        InsuranceBroker jamesGrey = new InsuranceBroker();
        System.out.println(jamesGrey);

        // Using collections
        // Write it only in the methods
        // Naming is important
        Map<String, List<AllOfInsurances>> typeToNameOfInsurance = new HashMap<>();

        // Creating lists
        // Without 'healthList'(there aren't any different insurances in type 'health')
        List<AllOfInsurances> vehicleList = new ArrayList<>();

        // Adding some elements
        // Class 'AllOfInsurances' is here
        vehicleList.add(new AllOfInsurances("property coverage"));
        vehicleList.add(new AllOfInsurances("liability coverage"));
        vehicleList.add(new AllOfInsurances("medical coverage"));

        List<AllOfInsurances> casualtyList = new ArrayList<>();

        casualtyList.add(new AllOfInsurances("crime insurance"));
        casualtyList.add(new AllOfInsurances("terrorism coverage"));
        casualtyList.add(new AllOfInsurances("kidnap and ransom coverage"));
        casualtyList.add(new AllOfInsurances("political risk coverage"));

        // Putting it in our map
        typeToNameOfInsurance.put("vehicle", vehicleList);
        typeToNameOfInsurance.put("casualty", casualtyList);

        // Checking our map
        System.out.println("Our map: " + typeToNameOfInsurance);

        // Using a method from another class
        BrokerManager brokerManager = new BrokerManager();
        brokerManager.printSomeInfoAboutInsurances();

        InsuranceManager insuranceManager = new InsuranceManager();
        insuranceManager.showAdvancedTypesOfInsurances();

        // In brackets of method 'sortTypesOfInsurances()' using the output of another function
        insuranceManager.sortTypesOfInsurances(new String[]{insuranceManager.findAndShowTypesOfInsurancesOnSaleInSummer()});
        insuranceManager.sortInsurances(casualtyList);
    }

}
