package calculator;

public class Calculator {

    public int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int substract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            throw new ArithmeticException();
        }
        return numberOne / numberTwo;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        try {
            double result = calculator.divide(4, 2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Division by zero! Error " + e);
        } finally {
            System.out.println("The end...");
        }
    }
}