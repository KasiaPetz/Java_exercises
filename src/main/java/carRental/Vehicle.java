package carRental;

public abstract class Vehicle {
    private int registrationNumber;
    private int vinNumber;
    private String color;
    private double price;
    private double fuelUsagePer100Km;
    /**
     * Pozostałe paliwo wyrazone w litrach.
     */
    private double amountOfFuelInLiters;
    /**
     * stan zbiornika paliwa w litrach
     */
    private double totalKm;
    private Engine engine;

    public Vehicle(int registrationNumber, int vinNumber, String color, double price, double fuelUsagePer100Km,
                   double amountOfFuelInLiters, double totalKm, Engine engine) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelUsagePer100Km = fuelUsagePer100Km;
        this.amountOfFuelInLiters = amountOfFuelInLiters;
        this.totalKm = totalKm;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelUsagePer100Km() {
        return fuelUsagePer100Km;
    }

    public void setFuelUsagePer100Km(double fuelUsagePer100Km) {
        this.fuelUsagePer100Km = fuelUsagePer100Km;
    }

    public double getAmountOfFuelInLiters() {
        return amountOfFuelInLiters;
    }

    public void setAmountOfFuelInLiters(double amountOfFuelInLiters) {
        this.amountOfFuelInLiters = amountOfFuelInLiters;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }

    public void drive(double distance) {
       totalKm += distance;
       amountOfFuelInLiters -= distance*fuelUsagePer100Km/100;
    }

    public void refuel(double fuel) {
       amountOfFuelInLiters += fuel;
    }
}
