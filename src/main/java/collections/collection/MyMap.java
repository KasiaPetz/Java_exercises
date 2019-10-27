package collections.collection;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MyMap {
    public static void main(String[] args) {

        Map<Integer, Car> map = new TreeMap<>();

        Car car = new Car("Honda", 2014);
        Car car2 = new Car("Honda", 2015);
        Car car3 = new Car("Renaut", 2014);
        Car car4 = new Car("Mercedes", 2008);
        Car car5 = new Car("BMW", 2013);

        map.put(11, car);
        map.put(11, car2);
        map.put(13, car3);
        map.put(18, car4);
        map.put(15, car5);

        for (Map.Entry<Integer, Car> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getKey());
        }

        System.out.println(map.get(11));

        System.out.println(map.entrySet());  //cała mapa
    }

}
