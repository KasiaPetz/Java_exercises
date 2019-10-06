package fizzBuzz;
//Wypisz liczby od 1 do 100, jeżeli liczba jest podzielna przez 3 wypisz Fizz, jesli przez 5 Buzz, jesli przez 3 i 5 FizzBuzz
//w przeciwnym razie wypisz liczbe

public class FizzBuzz {

    public static void fizzBuzz() {
        for(int i = 1; i < 100; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%5 == 0 ){
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
       fizzBuzz();
    }

}
