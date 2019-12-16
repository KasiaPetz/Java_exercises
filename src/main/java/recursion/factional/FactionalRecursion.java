package recursion.factional;

public class FactionalRecursion implements Factional {
    @Override
    public int factional(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factional(n - 1);
    }
}
