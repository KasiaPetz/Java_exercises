package arrays;

//Stworz tablice intow o rozmiarze 20. Uzupelnij cala tablice liczbami pseudolosowymi do 120.
//Wyswietl cala tablice.
//Za pomocą pętli for wyświetl liczby od 20 do 120 - metoda
//Wyświetl co piątą liczbe

public class EveryFive {

    public int[] retriveArray(int [] inputArray) {
        int counter = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if( inputArray[i] >= 20 && inputArray[i] <= 120) {
                counter++;
            }
        }

        int[] selectArray = new int [counter];
        int j = 0;

        for( int i = 0; i < inputArray.length; i++) {
            if( inputArray[i] >= 20 && inputArray[i] <= 120) {
                selectArray[j] = inputArray[i];
                j++;
            }
        }

        return selectArray;
    }
}
