package akademiaKodu.Strings;

import java.util.Scanner;
//sprawdzic
public class Zad3 {
    public static boolean isAkademia(String input) {
        String controlWord = "Akademia";
        if (input == controlWord) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Podaj słowo:");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(isAkademia(word));
    }

}
