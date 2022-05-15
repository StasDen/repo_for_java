package com.lviv.IoT;

// Record class for storing info
public record InsuranceBroker(String name, double workExperienceInYears, String jobAddress, String workSchedule) {

    // Implementing chain of constructors(record feature)
    public InsuranceBroker() {
        this("James Grey"); // Use 'this()' right after the constructor name!
    }

    // Check the parameter usage
    public InsuranceBroker(final String name) {
        this(name, 10.5);
    }

    public InsuranceBroker(final String name, final double workExperienceInYears) {
        this(name, workExperienceInYears, "Green St.");
    }

    public InsuranceBroker(final String name, final double workExperienceInYears, final String jobAddress) {
        this(name, workExperienceInYears, jobAddress, "Monday-Friday");
    }

    // Method 'toString()' for our object isn't needed(record feature x2)
    public void printInfoAboutInsuranceBroker(final InsuranceBroker insuranceBroker) {

        System.out.println(insuranceBroker);
    }

}
