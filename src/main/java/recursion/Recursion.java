package recursion;

public class Recursion {

    public int sumaIteracja(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n;
            n--;
        }
        return suma;
    }

    public int sumaRekurencja(int n) {
        if (n > 0) {                                 //sprawdzay czy parametr jest > 0
            return n + sumaRekurencja(n - 1);     // suma tej liczby z wywołaniem funcji z parametrem mniejszym o 1
        } else {
            return 0;                              //jesli parametr jest mniejszy = 0 zwracamy 0
        }
    }

    public int sumaRekurencjaFunkcja(int n) {
        return n > 0 ? n + sumaRekurencja(n - 1) : 0;  //z funkcja trojargumentowa
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();

        int iteracja = 0;
        int rekurencja = 0;

        iteracja = r.sumaIteracja(3);
        rekurencja = r.sumaRekurencja(3);

        System.out.println("Iteracja: " + iteracja);
        System.out.println("Recursion: " + rekurencja);
        System.out.println(r.sumaRekurencjaFunkcja(3));
    }
}
