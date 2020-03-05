package hackeranktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zad1 {
    // 5 1 3 7 3
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,1,1,1,1,1);

        System.out.println(minDiff(array));
    }

    public static int minDiff(List<Integer> arr) {
        List<Integer> list = new ArrayList<>(arr);

        Collections.sort(list);

        int minDiff = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            minDiff += Math.abs(list.get(i) - list.get(i + 1));
        }

        return minDiff;
    }

}