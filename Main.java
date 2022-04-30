package com.company;

public class Main {

    public static void main(String[] args) {

        // Chain of constructors
        WaterPump waterPump = new WaterPump();
        System.out.println(waterPump);

        // Three objects
        // Method toString() is automatic
        WaterPump firstWaterPump = new WaterPump("Honda WB30XT");
        System.out.println(firstWaterPump);

        WaterPump secondWaterPump = new WaterPump("Honda WB30XT", 300);
        System.out.println(secondWaterPump);

        WaterPump thirdWaterPump = new WaterPump("Honda WB30XT", 300,
                4);
        System.out.println(thirdWaterPump);

        // Using static functions
        WaterPump.printSomeAnotherInfoAboutWaterPump();
        WaterPump.printTheYearInWhichWaterPumpWasCreated();
    }

}