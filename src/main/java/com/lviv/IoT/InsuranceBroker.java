package com.lviv.IoT;

public record InsuranceBroker(String name, double workExperienceInYears, String jobAddress, String workSchedule) {

    // Chain of constructors is here
    public InsuranceBroker() {
        this("James Grey");
    }

    public InsuranceBroker(final String name) {
        this(name, 10.5);
    }

    public InsuranceBroker(final String name, final double workExperienceInYears) {
        this(name, workExperienceInYears, "Green St.");
    }

    public InsuranceBroker(final String name, final double workExperienceInYears, final String jobAddress) {
        this(name, workExperienceInYears, jobAddress, "Monday-Friday");
    }

    // Method 'toString()' for our object isn't needed
    public void printInfoAboutInsuranceBroker(final InsuranceBroker insuranceBroker) {

        System.out.println(insuranceBroker);
    }

}
