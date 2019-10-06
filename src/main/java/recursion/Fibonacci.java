package recursion;

public class Fibonacci {
    public int fibonacci(int n) {
        return n < 2? n :  fibonacci(n-1) + fibonacci(n-2);
    }

    public int fibonacciIteracja(int n) {
        int pierwszy = 1;
        int drugi = 1;
        int pomocnicza = 1;

        for(int i=2; i<n; i++) {
            pomocnicza = pierwszy + drugi;
            pierwszy = drugi;
            drugi = pomocnicza;
        }
        return pomocnicza;
    }

}
