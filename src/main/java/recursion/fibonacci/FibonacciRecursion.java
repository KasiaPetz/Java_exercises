package recursion.fibonacci;

public class FibonacciRecursion implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        return n < 2? n :  fibonacci(n-1) + fibonacci(n-2);
    }
}
