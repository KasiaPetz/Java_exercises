package iterations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Zadanie3Test {

    @Test
    public void shouldRetrieveIntListCorrectly() {
        //given
        Zadanie3 zadanie3 = new Zadanie3();
        Integer[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};
        List<Integer> list = Arrays.asList(array);

        //when
        List<Integer> resultList = zadanie3.selectNumbers(list);

        //then
        assertThat(resultList).containsExactly(50, 20, 111);
    }


    @Test
    public void shouldRetrieveIntListCorrectlyWithWhile() {
        //given
        Zadanie3 zadanie3 = new Zadanie3();
        Integer[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};
        List<Integer> list = Arrays.asList(array);

        //when
        List<Integer> resultList = zadanie3.selectNumbersWithWhile(list);

        //then
        assertThat(resultList).containsExactly(50, 20, 111);
    }

    @Test
    public void shouldRetriveNumbersByStreamCorrectly() {
        Zadanie3 zadanie3 = new Zadanie3();
        Integer[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};
        List<Integer> list = Arrays.asList(array);

        //given
        List<Integer> resultList = zadanie3.retriveNumbersByStream(list);

        //then
        assertThat(resultList).containsExactly(50, 20, 111);
    }

    @Test
    public void shouldRetriveEveryFifthCorrectly() {
        //given
        Zadanie3 zadanie3 = new Zadanie3();
        Integer[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};
        List<Integer> list = Arrays.asList(array);

        //when
        List<Integer> resultList = zadanie3.retriveEveryFifth(list);

        //then
        assertThat(resultList).contains(0, 10, 5);  // contains a containsExectly - order
    }

}