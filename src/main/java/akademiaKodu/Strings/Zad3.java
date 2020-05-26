package akademiaKodu.Strings;

import java.util.Scanner;

public class Zad3 {
    public static boolean isAkademia(String input) {
        return input.equals("Akademia");
    }

    public static void main(String[] args) {
        System.out.println("Podaj słowo:");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(isAkademia(word));
    }

}
