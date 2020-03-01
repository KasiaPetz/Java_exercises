package everyFive.List;

import java.util.ArrayList;
import java.util.List;

public class EveryFiveForEach extends RandomListGenerator implements Selctor {
    @Override
    public List<Integer> retriveSelectList(List<Integer> inputList) {
        List<Integer> selectedList = new ArrayList<>();

        for (int element: inputList) {
            if( element >= 20 && element <= 100) {
                selectedList.add(element);
            }
        }
        return selectedList;
    }

    @Override
    public List<Integer> retriveEveryFive(List<Integer> inputList) {
        return null;
    }
}
