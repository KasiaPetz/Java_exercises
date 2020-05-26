package akademiaKodu.instrukcjeWarunkowe;

public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int number = 10;

        System.out.println(number++); //10
        System.out.println(++number); // postinkrementacja 12

        System.out.println(number--); //12
        System.out.println(--number); //10
    }
}
