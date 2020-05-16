package akademiaKodu.instrukcjeWarunkowe;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int myNumber = input.nextInt();
        //== por liczby czy sa rowne

        int numberToDevide = 5;

        if (myNumber % numberToDevide == 0) {
            System.out.println("Liczba podzielna przez " + numberToDevide);
        } else {
            System.out.println("Liczba nie jest podzielna przez " + numberToDevide);
        }
    }
}
