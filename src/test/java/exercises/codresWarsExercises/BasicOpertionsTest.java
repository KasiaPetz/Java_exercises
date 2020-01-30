package exercises.codresWarsExercises;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BasicOpertionsTest {

    @Test
    public void basicMathTest() {
        //given

        //when
        Integer r1 = BasicOperations.basicMath("+", 4, 7);
        Integer r2 = BasicOperations.basicMath("-", 15, 18);
        Integer r3 = BasicOperations.basicMath("*", 5, 5);
        Integer r4 = BasicOperations.basicMath("/", 49, 7);

        //then
        assertThat(r1).isEqualTo(11);
        assertThat(r2).isEqualTo(-3);
        assertThat(r3).isEqualTo(25);
        assertThat(r4).isEqualTo(7);
    }

    @Test
    public void shouldThrowExceptionWhenDivideByZero() {
        //given
        int a = 49;
        int b = 0;

        //when & then
        assertThrows(ArithmeticException.class, () -> {
            BasicOperations.basicMath("/", a, b);
        });
    }

}