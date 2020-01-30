package fizzBuzz;


import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzIfListTest {
    @Test
    public void test1 () {
        //given
        FizzBuzzList fbl = new FizzBuzzList();

        //when
        List<String> resultList = fbl.fizzBuzzList();

        //then
        assertThat(resultList).containsExactly("Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz");

    }

}