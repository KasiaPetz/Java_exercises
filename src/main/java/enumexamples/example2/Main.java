package enumexamples.example2;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.XL, "Polex");

        System.out.println(tshirt.getSize());

        switch (tshirt.getSize()) {
            case S:
                System.out.println("Koszulka o rozmiarze S");
                break;
            case M:
                System.out.println("Koszulka o rozmiarze M");
                break;
            case L:
            case XL:
                System.out.println("Koszulka o rozmiarze L lub XL");
                break;
            default:
                System.out.println("W sumie to nie wiem jaki rozmiar");
        }
    }

}
