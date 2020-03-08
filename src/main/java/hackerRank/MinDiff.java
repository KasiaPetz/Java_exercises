package hackerRank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDiff {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 3, 7, 3);

        System.out.println(minDiff(array));
    }

    public static int minDiff(List<Integer> arr) {
        List<Integer> list = new ArrayList<>(arr);
        int midDiff = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            midDiff += Math.abs(list.get(i) - list.get(i + 1));
        }
        return midDiff;
    }

}
