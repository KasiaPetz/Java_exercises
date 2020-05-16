package akademiaKodu;

import java.util.Scanner;

//dopisac obsługa błedu co jesli ktos poda boolina
public class Zad5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe pierwsza");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Podaj liczbe 2");
        int secondNumber = input.nextInt();

        int score = firstNumber + secondNumber;
        System.out.println("Suma liczb to " + score);
    }
}
