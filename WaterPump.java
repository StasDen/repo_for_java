package com.company;

public record WaterPump(String modelOfWaterPump, int powerOfWaterPumpInWatt, int capacityOfWaterPumpInLiters) {

    public static final String ORIGIN_OF_WATER_PUMP = "Japan";
    public static final String MATERIAL_OF_WATER_PUMP = "steel";
    public static final int GUARANTEE_OF_WATER_PUMP = 24;
    public static int YEAR_IN_WHICH_WATER_PUMP_WAS_CREATED = 2017;

    public WaterPump() {
        this("Honda WB30XT");
    }

    public WaterPump(String modelOfWaterPump) {
        this(modelOfWaterPump, 300);
    }

    public WaterPump(String modelOfWaterPump, int powerOfWaterPumpInWatt) {
        this(modelOfWaterPump, powerOfWaterPumpInWatt, 4);
    }

    public WaterPump(String modelOfWaterPump, int powerOfWaterPumpInWatt, int capacityOfWaterPumpInLiters) {
        this.modelOfWaterPump = modelOfWaterPump;
        this.powerOfWaterPumpInWatt = powerOfWaterPumpInWatt;
        this.capacityOfWaterPumpInLiters = capacityOfWaterPumpInLiters;
    }

    public static String getYearInWhichWaterPumpWasCreated() {

        return YEAR_IN_WHICH_WATER_PUMP_WAS_CREATED + " - is the year, when our water pump was created.";
    }

    public static void printTheYearInWhichWaterPumpWasCreated() {

        System.out.println(getYearInWhichWaterPumpWasCreated());
    }

    public static String getSomeAnotherInfoAboutWaterPump() {

        return "The origin of our water pump is " + ORIGIN_OF_WATER_PUMP + ", and it's made of "
                + MATERIAL_OF_WATER_PUMP + ". Guarantee of water pump - " + GUARANTEE_OF_WATER_PUMP + " months.";
    }

    public static void printSomeAnotherInfoAboutWaterPump() {

        System.out.println(getSomeAnotherInfoAboutWaterPump());
    }

}