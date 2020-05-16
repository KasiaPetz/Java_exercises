package akademiaKodu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = input.nextInt();
        int lastDigit = number%10;

        System.out.println("Twoja liczba to "+number);
        System.out.println("Ostatnia cyfra to "+lastDigit);
    }
}
