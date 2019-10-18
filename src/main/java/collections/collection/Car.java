package collections.collection;

import java.util.Objects;

public class Car implements Comparable {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() &&
                Objects.equals(getBrand(), car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getYear());
    }

    //jesli metoda zwraca 0 to obiekty sa równy
    //jesli 1 this jest >
    //jesli -1 o jest wiekszy
    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;

        return this.getBrand().compareTo(car.getBrand());
    }
}
