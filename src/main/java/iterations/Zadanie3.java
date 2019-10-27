package iterations;//package iterations;

//Stworz litste intow. Uzupelnij liste 20stoma liczbami pseudolosowymi do 120.
//Wyswietl cala liste.

//Za pomocą pętli for wyświetl liczby z listy z przedzialu od 20 do 120 - metoda

//Wyświetl co piątą liczbe z listy

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Zadanie3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i <= 20; i++) {
            list.add(rd.nextInt(120));
        }

        System.out.println("List: " + list);
    }

    // for-each loop
    public List<Integer> selectNumbers(List<Integer> list) {
        List<Integer> selectedList = new ArrayList<>();

        for (int element : list) {
            if (element >= 20 && element <= 120) {
                selectedList.add(element);
            }
        }

        return selectedList;
    }

    // while loop
    public List<Integer> selectNumbersWithWhile(List<Integer> list) {
        List<Integer> selectedList = new ArrayList<>();
        int i = 0;

        while (i < list.size()) {
            Integer element = list.get(i);
            if (element >= 20 && element <= 120) {
                selectedList.add(element);
            }
            i++;
        }

        return selectedList;
    }

    public List<Integer> retriveNumbersByStream(List<Integer> list) {
        return list.stream()
                .filter(n -> n >= 20 && n <= 120)
                .collect(Collectors.toList());
    }

    //PD napisac test, naprawic metode, zrobic refactor, naprawic metode az test przejdzie

    public List<Integer> retriveEveryFifth(List<Integer> list) {
        List<Integer> everyFifthList = new ArrayList<>();

        for (int i = 0; i <= list.size(); i++) {
            if (i % 5 == 0) {
                everyFifthList.add(i);
            }
        }
        return everyFifthList;
    }
}


