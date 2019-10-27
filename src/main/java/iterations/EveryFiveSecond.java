package iterations;

//Stworz tablice intow o rozmiarze 20. Uzupelnij cala tablice liczbami pseudolosowymi do 120.
//Wyswietl cala tablice.
//Za pomocą pętli for wyświetl liczby  do 120
//wyswietl liczby podzielne przez 5
//Wyświetl co piątą liczbe

import utils.RandomUtils;

public class EveryFiveSecond {
    private static final int ARRAY_SIZE = 20;

    public static void everyFivePrint(int[] array) {
        arrayPrint(array);

        int[] resultArray = getDigitsDividedBy5(array);
        arrayPrint(resultArray);
    }

    public static void main(String[] args) {
        int[] randomArray = RandomUtils.generateRandomIntArray(ARRAY_SIZE, 0, 120);

        everyFivePrint(randomArray);      //exception
        printEvery5(randomArray);
    }

    private static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] getDigitsDividedBy5(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                resultArray[j] = array[i];
                j++;
            }
        }
        return resultArray;
    }

    private static void printEvery5(int[] array) {
        for (int i = 0; i < array.length; i+=5) {
            System.out.print(array[i] +" ");
        }
    }

}
