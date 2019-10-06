package collections.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void equalsTest() {
        Car car = new Car("Honda", 2014);
        Car car2 = new Car("Honda", 2014);
        Car car3 = new Car("Renaut", 2014);
        Car car4 = new Car("Mercedes", 2008);
        Car car5 = new Car("BMW", 2013);

        Set<Car> cars = new HashSet<>();

        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);  //co , toString obiektu
    }

    @Test
    public void treeSetTest() {
        Set<Car> cars = new TreeSet<>();

        Car car = new Car("Honda", 2014);
        Car car2 = new Car("Honda", 2014);
        Car car3 = new Car("Renaut", 2014);
        Car car4 = new Car("Mercedes", 2008);
        Car car5 = new Car("BMW", 2013);

        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);
    }
}