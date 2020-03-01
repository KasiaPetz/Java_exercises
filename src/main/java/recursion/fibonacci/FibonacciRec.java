package recursion.fibonacci;

public class FibonacciRec implements Fibonacci {

    @Override
    public int fibonacci(int n) {

        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
