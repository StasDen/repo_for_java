package com.company; // In Java all code is in packages

// Record class(keyword 'final')
public class WaterPump {

    private final String modelOfWaterPump = "Honda WB30XT";
    private final int powerOfWaterPumpInWatt = 300;
    private final int capacityOfWaterPumpInLiters = 4;

    public String originOfWaterPump = "Japan";
    public String materialOfWaterPump = "Steel";
    public int guaranteeOfWaterPumpInMonths = 24;

    static public int yearInWhichWaterPumpWasCreated = 2017; // Using static variable

    // Chain of constructors
    public WaterPump () {
        System.out.println("Standard water pump.");
    }

    public WaterPump (String originOfWaterPump) {
        this.originOfWaterPump = originOfWaterPump;

        System.out.println("Origin of our water pump - " + originOfWaterPump + ".");
    }

    public WaterPump (String originOfWaterPump, String materialOfWaterPump) {
        this.originOfWaterPump  = originOfWaterPump;
        this.materialOfWaterPump = materialOfWaterPump;

        System.out.println("Origin of our water pump - " + originOfWaterPump + ", and it's made of " + materialOfWaterPump + ".");
    }

    // Constructor with 3 parameters
    public WaterPump (String originOfWaterPump, String materialOfWaterPump, int guaranteeOfWaterPumpInMonths) {
        this.originOfWaterPump = originOfWaterPump;
        this.materialOfWaterPump = materialOfWaterPump;
        this.guaranteeOfWaterPumpInMonths = guaranteeOfWaterPumpInMonths;

        System.out.println("Origin of our water pump - " + originOfWaterPump + ", and it's made of " + materialOfWaterPump + "." + " Guarantee of water pump - " + guaranteeOfWaterPumpInMonths + " months.");
    }

    // Using 'toString()' method(find out more in class 'Main')
    public String toString () {

        return "The model of water pump " + "'" + modelOfWaterPump + "'" + " has power of " + powerOfWaterPumpInWatt + " watt and capacity of " + capacityOfWaterPumpInLiters + " litres.";
    }

    // Static function(for our static variable)
    static String getYearInWhichWaterPumpWasCreated () {

        return yearInWhichWaterPumpWasCreated + " - is the year, when our water pump was created.";
    }
}