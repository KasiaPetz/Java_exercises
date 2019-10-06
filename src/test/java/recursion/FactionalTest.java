package recursion;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactionalTest {
    @Test
    public void factionalIterationTest() {
        //given
        Factional factional = new Factional();

        //when
        int result = factional.factionalIteraction(5);

        //then
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void factionalRecursionTest() {
        //given
        Factional factional = new Factional();

        //when
        int result = factional.factionalRecursion(5);

        //then
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void factionalRecursionFunctionTest() {
        //given
        Factional factional = new Factional();

        //when
        int result = factional.factionalRecursionFunction(5);

        //then
        assertThat(result).isEqualTo(120);
    }

}