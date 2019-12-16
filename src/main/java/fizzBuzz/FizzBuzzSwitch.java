package fizzBuzz;

public class FizzBuzzSwitch {

    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {

        String opcja = "D";

        switch(opcja) {
            case "A":
                System.out.println("Raz");
            case "B":
                System.out.println("Dwa");
                break;
            case "C":
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Default");
        }

    }
}
