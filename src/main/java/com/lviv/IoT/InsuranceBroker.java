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

      public InsuranceBroker(String name) {
        this(name, 10.5);
    }

    public InsuranceBroker(String name, double workExperienceInYears) {
        this(name, workExperienceInYears, "Green St.");
    }

    public InsuranceBroker(String name, double workExperienceInYears, String jobAddress) {
        this(name, workExperienceInYears, jobAddress, "Monday-Friday");
    }

    public InsuranceBroker(String name, double workExperienceInYears, String jobAddress, String workSchedule) {
        this.name = name;
        this.workExperienceInYears = workExperienceInYears;
        this.jobAddress = jobAddress;
        this.workSchedule = workSchedule;
    }

    public void printInfoAboutInsuranceBroker(InsuranceBroker insuranceBroker) {

        System.out.println(insuranceBroker);
    }

}
