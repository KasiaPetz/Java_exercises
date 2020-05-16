package akademiaKodu.Strings;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Podaj pirewsze słowo");
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();

        System.out.println("Podaj drugie słowo");
        String secondWord = sc.next();

        System.out.println(secondWord + " " + firstWord);
    }
}
