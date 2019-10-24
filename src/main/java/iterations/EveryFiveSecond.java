package iterations;

//Stworz tablice intow o rozmiarze 20. Uzupelnij cala tablice liczbami pseudolosowymi do 120.
//Wyswietl cala tablice.
//Za pomocą pętli for wyświetl liczby od 20 do 120 - metoda
//Wyświetl co piątą liczbe

import utils.RandomUtils;

public class EveryFiveSecond {
    private static final int ARRAY_SIZE = 20;

    public int[] randomArray = RandomUtils.generateRandomIntArray(ARRAY_SIZE, 20, 120);

    private static void arrayPrint(int[] array) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println(array[i]);
        }
    }

    public static void everyFivePrint(int[] array) {
        arrayPrint(array);

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    // poprawic voida na int[}
}
