package fizzBuzz;
//Stwórz liste o zakresie od 0 do 15,
//jeżeli liczba jest podzielna przez 3 wypisz Fizz, jesli przez 5 Buzz, jesli przez 3 i 5 FizzBuzz

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzList {
    private String fizz = "Fizz";
    private String buzz = "Buzz";
    private String fizzBuzz = "FizzBuzz";


    public List<String> fizzBuzzList() {
        List<String> fizzBuzzList = new ArrayList<>();

        for (int i = 0; i <= 15; i++) {
            if (i == 0) {
                // do nothing
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add(fizzBuzz);
            } else if (i % 3 == 0) {
                fizzBuzzList.add(fizz);
            } else if (i % 5 == 0) {
                fizzBuzzList.add(buzz);
            }
        }
        return fizzBuzzList;
    }
}
