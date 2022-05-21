package com.lviv.IoT;

// One more class to be written in our csv file
public class AdamSmith extends BrokerManager {

    // Unique variable
    private static String jobAddress = "Oxford Street";

    public final String getJobAddress() {

        return jobAddress;
    }

    // Func to set headers in our csv table
    @Override
    public final String getHeaders() {

        return super.getHeaders() + ", " + "Job address"; // Keyword 'super' refers to super class
    }

    // Func to set values in our csv table
    @Override
    public final String toCSV() {

        return super.toCSV() + ", " + getJobAddress();
    }

}
