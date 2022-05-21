package com.lviv.IoT;

// Class to be written in our CSV file
public class AdamSmith extends BrokerManager {

    private static String jobAddress = "Oxford Street";

    public final String getJobAddress() {

        return jobAddress;
    }

    // Printing headers of our table in CSV file
    @Override
    public final String getHeaders() {

        return super.getHeaders() + ", " + "Job address";
    }

    // Printing values of our table
    @Override
    public final String toCSV() {

        return super.toCSV() + ", " + getJobAddress();
    }

}
