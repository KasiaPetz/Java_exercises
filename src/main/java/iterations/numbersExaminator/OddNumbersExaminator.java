package iterations.numbersExaminator;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExaminator implements Examinator {

    @Override
    public List<Integer> examinate(List<Integer> inputList) {
        List<Integer> resultList = new ArrayList<>();

        for (Integer element : inputList) {
            if (element % 2 == 0) {
                resultList.add(element);
            }
        }

//Lepiej uzyc foreach bo, nie ma potrzeby wywolywania metody get w kazdym obrocie
//        for (int i = 0; i < inputList.size(); i++) {
//            if (inputList.get(i) % 2 == 0) {
//                resultList.add(inputList.get(i));
//            }
//        }

        return resultList;
    }
}
