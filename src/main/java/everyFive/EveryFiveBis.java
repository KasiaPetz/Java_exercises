package everyFive;
//Stworz tablice intow o rozmiarze 20. Uzupelnij cala tablice liczbami pseudolosowymi do 120.
//Wyswietl cala tablice.
//Za pomocą pętli for wyświetl liczby od 20 do 120 - metoda
//Wyświetl co piątą liczbe

import java.util.Random;

public class EveryFiveBis {

    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) + 20;
        }

        arrayPrint(array);
        arrayPrint5(array);
        selectArray(array);

    }

    private static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void arrayPrint5(int[] array) {
        for (int i = 0; i < array.length; i += 5) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] selectArray(int[] inputArray) {
        int counter = 0;
        int j = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] >= 20 && inputArray[i] <= 120) {
                counter++;
            }
        }

         int[] retriveArray = new int[counter];

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] >= 20 && inputArray[i] <= 120) {
                inputArray[i] = retriveArray[j];
                j++;
            }
        }

        return retriveArray;
    }

}
