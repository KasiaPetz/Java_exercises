package everyFive.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator {
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    public List<Integer> randomListGenerator(List<Integer> inputList) {
        for (int i = 0; i <= 20; i++) {
            list.add(random.nextInt(101) + 20);
        }
        return list;
    }
}
