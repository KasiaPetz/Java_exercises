package recursion.fibonacci;

import org.junit.Test;

public class FibonacciOptimalizationTest {

    @Test
    public void fibonacciOptimalizationTest() {
        Fibonacci fibonacci = new FibonacciIteration();

        //given
        int n = 45;

        long startI = System.nanoTime();

        fibonacci.fibonacci(n);

        System.out.println(System.nanoTime() - startI);

        fibonacci = new FibonacciRecursion();

        long startR = System.nanoTime();

        fibonacci.fibonacci(n);

        System.out.println(System.nanoTime() - startR);
    }

}
