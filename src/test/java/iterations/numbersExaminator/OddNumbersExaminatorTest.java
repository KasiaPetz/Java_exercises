package iterations.numbersExaminator;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OddNumbersExaminatorTest {

    @Test
    public void testOddNumbersExterminatorNormal() {
        //given
        Examinator examinator = new OddNumbersExaminator();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //when
        List<Integer> result = examinator.examinate(list);

        //then
        assertThat(result).contains(2, 4, 6, 8);
    }
}