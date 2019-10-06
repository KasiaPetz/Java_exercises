package recursion;

public class Factional {

    public int factionalIteraction(int n) {
        if( n < 2) {
            return 1;
        }
        int result = 1;

        for(int i = 2; i <= n; i++) {
            result = i * result;
        }
        return result;
    }

    public int factionalRecursion(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factionalRecursion(n-1);
        }
    }

    public int factionalRecursionFunction(int n) {
        return n < 2 ? 1 : n* factionalRecursionFunction(n-1);
    }

}
