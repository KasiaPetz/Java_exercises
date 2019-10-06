package exceptionsExample;

import calculator.Calculator;

public class UncheckedException {
    public static void main(String[] args) {

        //Metoda divide może wyrzucić wyjątek.
        //Ale jest to wyjatek typu unchecked czyli nie musismy robic bloku try catch.
        //Ale mozemy!!! Po prostu jest to opcjonalne.

        Calculator calculator = new Calculator();

        calculator.divide(5, 1);

    }
}
