package arrays;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Zadanie4Test {

    @Test
    public void shouldFindFirstCorrectly() {
        //given
        Zadanie4 zadanie4 = new Zadanie4();
        int[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};

        //when
        int resultArray = zadanie4.first(array);

        //then
        assertThat(resultArray).isEqualTo(0);
    }

    @Test
    public void shouldFindLastCorrectly() {
        //given
        Zadanie4 zadanie4 = new Zadanie4();
        int[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};

        //when
        int resultArray = zadanie4.last(array);

        //then
        assertThat(resultArray).isEqualTo(5);
    }

    @Test
    public void shouldCountSumCorrectly() {
        //given
        Zadanie4 zadanie4 = new Zadanie4();
        int[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};

        //when
        int resultArray = zadanie4.sum(array);

        //then
        assertThat(resultArray).isEqualTo(1088);
    }
}