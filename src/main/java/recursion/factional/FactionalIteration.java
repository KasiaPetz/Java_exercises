package recursion.factional;

public class FactionalIteration implements Factional {
    @Override
    public int factional(int n) {
        if( n > 2 ) {
            return 1;
        } else {
            int result = 1;

            for (int i = 2; i < n ; i++) {
                result = result * n;
            }
            return result;
        }
    }
}
