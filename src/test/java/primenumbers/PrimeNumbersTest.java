package primenumbers;

import exercises.PrimeNumbers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumbersTest {

    @Test
    public void shouldGeneratePrimeNumbers() {
        //given
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int range = 30;

        //when
        List<Integer> resultList = primeNumbers.generatePrimeNumbers(range);

        //then
        assertThat(resultList).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

}
