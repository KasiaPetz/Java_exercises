package exercises.codresWarsExercises.Average;

import java.util.Arrays;

public class AverageStream implements Average {

    @Override
    public double findAverage(int[] array) {
        return Arrays.stream(array)
                .average()
                .orElse(0);
    }
}

//  return IntStream.of(array).average().getAsDouble();