package iterations;

//Stworz tablice intow o rozmiarze 10.
//Uzupelnij ja losowymi liczbami z przedzialu od 0 do 9.
//Na ekran wydrukuj tablice, na nastepnie
// - najwieksza liczbe z tablicy
// - najmniejsza
// - srednia wszystkich liczb

import utils.RandomUtils;

public class MaxAndMin {
   // public static void main(String[] args) {

        int[] array = RandomUtils.generateRandomIntArray(10, 0, 9);

        public static int maxRetrival(int[] inputArray) {
            int max = inputArray[0];

            for(int i = 0; i < inputArray.length; i++ ) {
                if(inputArray[i] > max) {
                    max = inputArray[i];
                }
            }
            return max;
        }

        public static double avgRetrival(int[] inputArray) {
            int sum = 0;

            for(int i = 0; i < inputArray.length; i++) {
                sum =+ inputArray[i];
            }

            double average = (double) sum/ inputArray.length;

            return average;
        }

}
