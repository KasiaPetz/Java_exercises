package akademiaKodu.Strings;

import java.util.Scanner;

public class Zad2 {
    public static int lettersCounter(String input) {
       return input.length();
    }

    public static void main(String[] args) {
        System.out.println("Podaj imię:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println(lettersCounter(name));
    }

}
