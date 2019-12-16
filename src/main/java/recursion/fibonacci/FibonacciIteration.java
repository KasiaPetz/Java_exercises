package recursion.fibonacci;


public class FibonacciIteration implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        int firstNumber = 1;
        int secondNumber = 1;
        int result = 1;

        for (int i = 2; i < n; i++) {
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        return result;
    }

}
