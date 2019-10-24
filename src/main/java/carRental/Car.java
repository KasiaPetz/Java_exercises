package carRental;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int registrationNumber, int vinNumber, String color, double price,
               double fuelUsagePer100Km, double amountOfFuelInLiters, double totalKm, Engine engine, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelUsagePer100Km, amountOfFuelInLiters, totalKm, engine);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
