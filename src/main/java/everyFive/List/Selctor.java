package everyFive.List;

import java.util.List;

public interface Selctor {
    List<Integer> retriveSelectList(List<Integer> inputList);

    List<Integer> retriveEveryFive(List<Integer> inputList);
}
