package utils;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RandomUtilsTest {

    @Test
    public void shouldFillArrayWithValuesFromRange() {
        //given
        int length = 10, from = 0, to = 20;

        //when
        int[] array = RandomUtils.generateRandomIntArray(length, from, to);

        //then
        for(int element : array) {
            assertThat(element).isBetween(from, to);  // po co tutaj to for
        }
    }

}