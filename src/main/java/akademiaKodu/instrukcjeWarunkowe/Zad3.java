package akademiaKodu.instrukcjeWarunkowe;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("Podaj hasło");
        Scanner scanner = new Scanner(System.in);
        //next() do Stringa
        String password = scanner.next();

        /*
        == do porównia typów prostych, liczby, pojedyńcze znaki i war logiczne
        equals do porównaie typów złożonych (String)
         */

        if (password.equals("Akademia") || password.equals("akademia")) {
            System.out.println("Podałeś poprawne hasło ");
        } else {
            System.out.println("Nie podałeś poprawnego hasła");
        }
    }
}
