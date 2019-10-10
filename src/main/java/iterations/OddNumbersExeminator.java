package iterations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersExeminator {

    public List<Integer> examinate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++) {
            if( i%2 == 0 ) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

    public List<Integer> exterminateStream(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());

        return evenNumbers;
    }
}
