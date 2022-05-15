package com.lviv.IoT;

public class JamesGrey extends BrokerManager {

    // One more unique variable for csv
    private static String workSchedule = "Monday-Friday";

    public final String getWorkSchedule() {

        return workSchedule;
    }

    // Using 'super' keyword to use functions of parent class
    @Override
    public final String getHeaders() {

        return super.getHeaders() + ", " + " Work schedule";
    }

    @Override
    public final String toCSV() {

        return super.toCSV() + ", " + getWorkSchedule();
    }

}
