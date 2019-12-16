package recursion.factional;

public class FactionalAlgorithm implements Factional {
    @Override
    public int factional(int n) {
        return n < 2 ? 1 : n * factional(n-1);
    }
}
