package arrays;

//Stworz tablice intow o rozmiarze 20. Uzupelnij cala tablice liczbami pseudolosowymi do 120.
//Wyswietl cala tablice.
//Za pomocą pętli for wyświetl liczby od 20 do 120 - metoda
//Wyświetl co piątą liczbe

public class Zadanie2 {

    //funkcja zwraca nowa tablice z liczbami od 20 do 120 z tablicy przekazanej jako argument
    public int[] retrieveIntArray(int [] tab) {
        int counter = 0;

        for(int i = 0; i < tab.length; i++) {
            if (tab[i] >= 20 && tab[i] <= 120) {
                counter++;
            }
        }

        int[] selectTab = new int[counter];
        int j = 0;

        for(int i = 0; i < tab.length; i++) {
            if (tab[i] >= 20 && tab[i] <= 120) {
                selectTab[j] = tab[i];
                j++;
            }
        }
        return selectTab;
    }

    public void fiveDivided(int [] tab ) {
        for(int i = 0; i < tab.length; i++) {
            if( i % 5 == 0) {
                System.out.print(tab[i] + " ");
            }
        }
    }
}
