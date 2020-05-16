package akademiaKodu;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        System.out.println("Podaj promień koła");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println("Pole koła to " + Math.PI * r * r);
    }

}
