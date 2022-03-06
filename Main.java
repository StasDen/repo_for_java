package com.company; // It means company.com

public class Main {

    public static void main(String[] args) {

        // Launching chain of constructors(check up console)
	    WaterPump firstWaterPump = new WaterPump("Honda WB30XT");
        WaterPump secondWaterPump = new WaterPump("Honda WB30XT", 300);
        WaterPump thirdWaterPump = new WaterPump("Honda WB30XT", 300, 4);

        System.out.println(firstWaterPump); // Method toString() is automatic(preferences of record)
        System.out.println(secondWaterPump);
        System.out.println(thirdWaterPump);

        // Using static functions
        WaterPump.printSomeAnotherInfoAboutWaterPump(); // We can call functions like this or just import it from record 'WaterPump'
        WaterPump.printTheYearInWhichWaterPumpWasCreated();
    }
}