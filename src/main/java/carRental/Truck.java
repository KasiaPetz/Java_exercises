package carRental;

public class Truck extends Vehicle {

    public Truck(int registrationNumber, int vinNumber, String color, double price, double fuelUsagePer100Km, double amountOfFuelInLiters, double totalKm, Engine engine) {
        super(registrationNumber, vinNumber, color, price, fuelUsagePer100Km, amountOfFuelInLiters, totalKm, engine);
    }
}
