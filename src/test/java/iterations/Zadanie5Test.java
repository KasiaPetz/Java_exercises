package iterations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Zadanie5Test {

    @Test
    public void shouldJoinArrays() {
        //given
        Zadanie5 zadanie5 = new Zadanie5();
        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 4};

        //when
        int[] resultArray = zadanie5.joinArrays(first, second);

        //then
        assertThat(resultArray).containsExactly(1, 2, 3, 4, 1, 2, 3, 4);
    }

    @Test
    public void shouldJoinArraysCorrectly() {   // dlaczego nie moze sie tak samo nazywa przeciazanie metod ???
        //given
        Zadanie5 zadanie5 = new Zadanie5();
        int[] first = {33, 50, 45};
        int[] second = {56, 44,67};
        int[] third = {69, 77};

        //when
        int[] resultArray = zadanie5.joinArrays(first, second, third);

        //then
        assertThat(resultArray).containsExactly(33, 50, 45, 56, 44, 67, 69, 77);
    }
}