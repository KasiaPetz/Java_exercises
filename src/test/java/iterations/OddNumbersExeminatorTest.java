package iterations;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OddNumbersExeminatorTest {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void beforeTest() {
        //System.out.println("Test case: begin");  // bez sensu to jest jak zrobic zebym wiedziała ktory test
        System.out.println("Running " + testName.getMethodName());

    }

    @After
    public void afterTest() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormal() {
        //given
        OddNumbersExeminator exeminator = new OddNumbersExeminator();
       // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> inputArray = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            inputArray.add(i);
        }

        //when
        List<Integer> resultList = exeminator.examinate(inputArray);

        //then
        assertThat(resultList).contains(2,4,6,8);
    }

    @Test
    public void testOddNumbersExterminatorEmpty() {
        //given
        OddNumbersExeminator exeminator = new OddNumbersExeminator();

        List<Integer> inputArray = new ArrayList<>();

        //when
        List<Integer> resultList = exeminator.examinate(inputArray);

        //then
        assertThat(resultList).isEmpty();
    }

    @Test
    public void testOddNumbersWithStream() {
        //given
        OddNumbersExeminator exeminator = new OddNumbersExeminator();

        List<Integer> inputArray = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            inputArray.add(i);
        }

        //when
        List<Integer> resultList = exeminator.exterminateStream(inputArray);

        //then
        assertThat(resultList).contains(2,4,6,8);
    }
}