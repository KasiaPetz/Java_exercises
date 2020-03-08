package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Balance {
    public static void main(String[] args) {
        List<String> exp = Arrays.asList("<<>>", "<>", ">>", "<<>", "><><");
        List<Integer> maxRepl = Arrays.asList(0, 1, 2, 2, 2, 2);

        System.out.println(balancedOrNot(exp, maxRepl));
    }

    public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < expressions.size(); i++) {
            //result =  1 or 0
            Integer result = canBalanceExpresion(expressions.get(i), maxReplacements.get(i));
            resultList.add(result);
        }

        return resultList;
    }

    private static Integer canBalanceExpresion(String expression, Integer maxMoves) {
        char[] arr = expression.toCharArray();

        int moves = 0;
        int l = 0;
        int r = 0;

        //count l and r
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                l++;
            } else {
                r++;
            }
        //l > 0
            if (r > l) {
                r = 0;
                moves++;
        //l = 0
            } else if (r == l) {
                r = 0;
                l = 0;
            }
        }

        if ( l == 0 && moves <= maxMoves) {
            return 1;
        }
        return 0;
    }


}
