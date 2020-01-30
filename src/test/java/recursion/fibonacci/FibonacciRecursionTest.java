package recursion.fibonacci;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciRecursionTest {
    @Test
    public void fibonacci() {
        //given
        Fibonacci fb = new FibonacciRecursion();

        //when
        int result = fb.fibonacci(8);

        //then
        assertThat(result).isEqualTo(21);
    }
}