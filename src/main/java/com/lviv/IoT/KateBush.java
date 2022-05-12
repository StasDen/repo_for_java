package com.lviv.IoT;

public class KateBush extends BrokerManager {

    private static String professionalRewards = "Diploma for being a professional";

    public final String getProfessionalRewards() {

        return professionalRewards;
    }

    @Override
    public final String getHeaders() {

        return super.getHeaders() + ", " + "Professional rewards";
    }

    @Override
    public final String toCSV() {

        return super.toCSV() + ", " + getProfessionalRewards();
    }

}
