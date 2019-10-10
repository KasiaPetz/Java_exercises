package iterations;

//Stworz tablice intow o rozmiarze 10.
//Uzupelnij ja losowymi liczbami z przedzialu od 0 do 9.
//Na ekran wydrukuj tablice, na nastepnie
// - najwieksza liczbe z tablicy
// - najmniejsza
// - srednia wszystkich liczb

import utils.RandomUtils;

public class Zadanie1 {

    public static void main(String[] args) {

        int tablica[] = RandomUtils.generateRandomIntArrayWithLogs(10, 0,10);

        int max = maxFinder(tablica);
        int min = minFinder(tablica);
        double avrg = calculateAvg(tablica);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avrg);
    }

    public static int maxFinder(int[] tab) {
        int max = tab[0];

        for(int i = 0; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int minFinder(int[] tab) {
        int min = tab[0];

        for(int i = 0; i < tab.length; i++) {
            if( tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static double calculateAvg(int[] tab) {
       int sum = 0;

       for(int i = 0; i < tab.length; i++) {
           sum = sum + tab[i];
       }

       double avrg = (double) sum / tab.length;
       return avrg ;
    }
}


