package collections.collection;

//HashSet nie pamieta kolejnosci, nie wyciagne po indeksie
//LinkedHashSet pamieta kolejnosc ale i tak nie wyciagne po indeksie
//nie przyjmuje duplikatów - przyjmie ponowne dodawanie ale nie zduplikuje
//nie da sie chodzic po indeksach
//do uzycia gdy: czesto zapisyane nowe obj, czesto zmiana obj istniejacego, czesto wyszukuje


import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Kasia");
        set.add("Kasia");
        set.add("Kasia");
        set.add("Ania");
        set.add("Ewa");
        set.add("Ola");

        for (String value : set) {
            System.out.println(value);
        }

        System.out.println("Contains: " + set.contains("Ewa"));

        System.out.println("Size: " + set.size());   //4

        set.clear();

        System.out.println("Is empty: " + set.isEmpty());

        System.out.println("Contains: " + set.contains("Ewa"));
    }
}
