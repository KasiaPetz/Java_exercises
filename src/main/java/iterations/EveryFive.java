package iterations;

//Stworz tablice intow o rozmiarze 20. Uzupelnij cala tablice liczbami pseudolosowymi do 120.
//Wyswietl cala tablice.
//Za pomocą pętli for wyświetl liczby od 20 do 120 - metoda
//Wyświetl co piątą liczbe

public class EveryFive {
    final int ARRAY_SIZE = 20;
    final int SCOPE = 120;

    public int[] retriveArray(int [] inputArray) {
        int counter = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if( inputArray[i] >= ARRAY_SIZE && inputArray[i] <= SCOPE) {
                counter++;
            }
        }

        int[] selectArray = new int [counter];
        int j = 0;

        for( int i = 0; i < inputArray.length; i++) {
            if( inputArray[i] >= ARRAY_SIZE && inputArray[i] <= SCOPE) {
                selectArray[j] = inputArray[i];
                j++;
            }
        }

        return selectArray;
    }
}
