package hackeranktest;

import java.util.Arrays;
import java.util.List;

public class Balance {
    public static void main(String[] args) {
        List<String> exp= Arrays.asList("<<>>", "<>", ">>", "<<>", "><><");
        List<Integer> maxRepl = Arrays.asList(0,1,2,2,2,2);

        System.out.println(balancedOrNot(exp, maxRepl));
    }

    public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {
        return null;
    }
}
