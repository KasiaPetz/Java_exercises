package recursion.fibonacci;

public class FibonacciRecursion implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);  // ??
    }

    public int fib(int n) {         //przeniesc do klasy
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
