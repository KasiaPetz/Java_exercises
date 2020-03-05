package hackeranktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad3 {

    public static void main(String[] args) {
        List<String> exp= Arrays.asList("<<>>", "<>", ">>", "<<>", "><><");
        List<Integer> maxRepl = Arrays.asList(0,1,2,2,2);

        System.out.println(balancedOrNot(exp, maxRepl));
    }

    public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < expressions.size(); i++) {
            Integer result = canBalanceExpression(expressions.get(i), maxReplacements.get(i));
            resultList.add(result);
        }

        return resultList;
    }

    private static Integer canBalanceExpression(String expression, Integer maxMoves) {
        char[] arr = expression.toCharArray();

        int moves = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                l++;
            } else {
                r++;
            }

            if (r > l) {
                r = 0;
                moves++;
            } else if (r == l) {
                l = 0;
                r = 0;
            }
         }

        if (l == 0 && moves <= maxMoves) {
            return 1;
        }

        return 0;
    }

}
