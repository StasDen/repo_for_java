package com.company;

// Using keyword 'record'(useful class with automatic getters; hashCode(), equals(), toString() methods)
public record WaterPump(String modelOfWaterPump, int powerOfWaterPumpInWatt, int capacityOfWaterPumpInLiters) {

    public static final String ORIGIN_OF_WATER_PUMP = "Japan"; // The instance of writing a static variable(ORIGIN_OF_WATER_PUMP)
    public static final String MATERIAL_OF_WATER_PUMP = "steel";
    public static final int GUARANTEE_OF_WATER_PUMP = 24;

    static public int YEAR_IN_WHICH_WATER_PUMP_WAS_CREATED = 2017;

    // CHAIN OF CONSTRUCTORS
    // Default constructor 1
    // Default constructor will call another constructor
    public WaterPump () {
        // Call constructor 2
        this("Honda WB30XT");

        System.out.println("Default constructor was called");
    }

    // Parametrized constructor 2
    public WaterPump (String modelOfWaterPump) {
        // Call constructor 3
        this(modelOfWaterPump, 300);

        System.out.println("The first parametrized constructor was called");
    }

    // Parametrized constructor 3(the same is below)
    public WaterPump (String modelOfWaterPump, int powerOfWaterPumpInWatt) {
        // Call constructor 4
        this(modelOfWaterPump, powerOfWaterPumpInWatt, 4);

        System.out.println("The second parametrized constructor was called");
    }

    public WaterPump (String modelOfWaterPump, int powerOfWaterPumpInWatt, int capacityOfWaterPumpInLiters) {
        // At the end of our chain of constructors(just this. ...)
        // Without this(...) - the rule of creating a chain of constructors
        this.modelOfWaterPump = modelOfWaterPump;
        this.powerOfWaterPumpInWatt = powerOfWaterPumpInWatt;
        this.capacityOfWaterPumpInLiters = capacityOfWaterPumpInLiters;

        System.out.println("The third parametrized constructor was called");
    }

    // Static func for our static variable(ONLY static variable)
    static String getYearInWhichWaterPumpWasCreated () {

        return YEAR_IN_WHICH_WATER_PUMP_WAS_CREATED + " - is the year, when our water pump was created.";
    }

    public static void printTheYearInWhichWaterPumpWasCreated () {

        System.out.println(getYearInWhichWaterPumpWasCreated());
    }

    public static String getSomeAnotherInfoAboutWaterPump () {

        return "The origin of our water pump is " + ORIGIN_OF_WATER_PUMP + ", and it's made of " + MATERIAL_OF_WATER_PUMP + ". Guarantee of water pump - " + GUARANTEE_OF_WATER_PUMP + " months.";
    }

    public static void printSomeAnotherInfoAboutWaterPump () {

        System.out.println(getSomeAnotherInfoAboutWaterPump());
    }
}