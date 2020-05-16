package akademiaKodu.Strings;

import java.util.Scanner;

public class Zad5 {
    public static boolean firstLetterValidator(String input) {
        char firstLetter = input.charAt(0);
        char expectedFirstLetter = 'A';

        if(firstLetter == expectedFirstLetter) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Podaj słowo:");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(firstLetterValidator(word));
    }
}
