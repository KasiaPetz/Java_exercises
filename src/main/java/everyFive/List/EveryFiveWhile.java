package everyFive.List;

import java.util.ArrayList;
import java.util.List;

public class EveryFiveWhile extends RandomListGenerator implements Selctor {
    @Override
    public List<Integer> retriveSelectList(List<Integer> inputList) {
        List<Integer> selectedList = new ArrayList<>();
        int i = 0;

        while (i < inputList.size()) {
            Integer value = inputList.get(i);

            if (value >= 20 && value <= 100) {
                selectedList.add(value);
            }
        }
        return selectedList;
    }

    @Override
    public List<Integer> retriveEveryFive(List<Integer> inputList) {
        return null;
    }
}
