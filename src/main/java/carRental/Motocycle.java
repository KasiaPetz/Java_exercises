package carRental;

public class Motocycle extends Vehicle {

    public Motocycle(int registrationNumber, int vinNumber, String color, double price, double fuelUsagePer100Km, double amountOfFuelInLiters, double totalKm, Engine engine) {
        super(registrationNumber, vinNumber, color, price, fuelUsagePer100Km, amountOfFuelInLiters, totalKm, engine);
    }
}
