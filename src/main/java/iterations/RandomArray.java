package iterations;

//Stworz tablice intow o rozmiarze 10.
//Uzupelnij ja losowymi liczbami z przedzialu od 0 do 9.
//Na ekran wydrukuj tablice, na nastepnie
// - najwieksza liczbe z tablicy
// - najmniejsza
// - srednia wszystkich liczb

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("Max value: " + maxRetrival(array));
        System.out.println("Min value: " + minRetrival(array));
        System.out.println("Average value: " + averageRetrival(array));

    }

    private static int maxRetrival(int[] inputArray) {
        int max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        return max;
    }

    private static int minRetrival(int[] inputArray) {
        int min = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }
        return min;
    }

    private static double averageRetrival(int[] inputArray) {
        int sum = 0;

        for (int value : inputArray) {
            sum = +value;
        }

        final double v = (double) sum / inputArray.length;
        return v;

    }
}
