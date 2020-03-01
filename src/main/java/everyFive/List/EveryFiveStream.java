package everyFive.List;

import java.util.List;
import java.util.stream.Collectors;

public class EveryFiveStream extends RandomListGenerator implements Selctor {

    @Override
    public List<Integer> retriveSelectList(List<Integer> inputList) {
        return inputList.stream()
                .filter(n -> n >= 10 && n <= 100)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> retriveEveryFive(List<Integer> inputList) {
        return null;
    }
}
