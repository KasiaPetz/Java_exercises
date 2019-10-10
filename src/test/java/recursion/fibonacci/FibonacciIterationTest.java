package recursion.fibonacci;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciIterationTest {
    @Test
    public void fibonacciTest() {
        //given
        Fibonacci fb = new FibonacciIteration();

        //when
        int result = fb.fibonacci(8);

        //then
        assertThat(result).isEqualTo(21);
    }

}