package akademiaKodu.Strings;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Podaj słowo - duze litery:");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(word.toLowerCase());
    }
}
