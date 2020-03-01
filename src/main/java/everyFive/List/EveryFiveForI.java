package everyFive.List;
//Stworz litste intow. Uzupelnij liste 20stoma liczbami pseudolosowymi do 120.
// ze stworzonej listy stwórz liste zawierajacej tylko liczby z listy z przedzialu od 20 do 100
// ze stworzonej listy stwórz liste zawierajacej tylko co 5 jej element


import java.util.ArrayList;
import java.util.List;

public class EveryFiveForI extends RandomListGenerator implements Selctor {

    @Override
    public List<Integer> retriveSelectList(List<Integer> inputList) {
        List<Integer> selectedList = new ArrayList<>();

        for (int i = 0; i <= inputList.size(); i++) {
            if (inputList.get(i) >= 20 && inputList.get(i) <= 100) {
                selectedList.add(inputList.get(i));
            }
        }
        return selectedList;
    }

    @Override
    public List<Integer> retriveEveryFive(List<Integer> inputList) {
        List<Integer> everyFive = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i += 5) {
            everyFive.add(inputList.get(i));
        }
        return everyFive;
    }
}
