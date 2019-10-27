package iterations.numbersExaminator;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersStream implements Examinator {
    @Override
    public List<Integer> examinate(List<Integer> inputList) {
        List<Integer> resultList = inputList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        return resultList;
    }
}
