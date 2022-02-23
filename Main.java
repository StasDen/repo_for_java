package com.company;

public class Main {

    // Necessary method 'main'(running the program)
    public static void main (String[] args) {

        // Chain of constructors
        WaterPump firstWaterPump = new WaterPump ();

        WaterPump secondWaterPump = new WaterPump ("USA");

        WaterPump thirdWaterPump = new WaterPump ("USA", "iron");

        WaterPump fourthWaterPump = new WaterPump ("USA", "iron", 12);

        // Method 'toString()' is used(different output)
        System.out.println(secondWaterPump);
        System.out.println(thirdWaterPump);
        System.out.println(fourthWaterPump);

        // Using static method(only static variable)
        System.out.println(WaterPump.getYearInWhichWaterPumpWasCreated()); // The objects of class 'WaterPump' are instance(you shouldn't use them with static method)
    }
}