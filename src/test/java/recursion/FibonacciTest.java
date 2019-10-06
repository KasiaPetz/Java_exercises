package recursion;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class FibonacciTest {
    @Test
    public void fibonacciTest() {
        //given
        Fibonacci fb = new Fibonacci();

        //when
        int result = fb.fibonacci(8);

        //then
        assertThat(result).isEqualTo(21);
    }

    @Test
    public void fibonacciIteracjaTest() {
        //given
        Fibonacci fb = new Fibonacci();

        //when
        int result = fb.fibonacciIteracja(8);

        //then
        assertThat(result).isEqualTo(21);
    }



}