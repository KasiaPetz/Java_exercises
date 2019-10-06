package utils;

import java.util.Random;

public final class RandomUtils {

    private RandomUtils() {

    }

    private static final Random random = new Random();

    public static int[] generateRandomIntArrayWithLogs(int length, int from, int to) {
        int[] array = generateRandomIntArray(length, from, to);

        System.out.print("Generated array : ");
        for(int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        return array;
    }

    public static int[] generateRandomIntArray(int length, int from, int to) {
        int[] array = new int[length];

        if (from >= to) {
            throw new IllegalArgumentException("Bottom range limit must be smaller than the top range limit");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(to - from) + from;

            //dane : from 50 to 90
            //array[i] = random.nextInt(90 - 50) + 50;
        }

        return array;
    }


}
