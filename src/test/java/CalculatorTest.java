import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void shouldAddCorrectly() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(2, 3);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shouldSubstractCorrectly() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.substract(10, 5);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shouldMultipleCorrectly() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(2, 3);
        int resultWithZero = calculator.multiply(0,5);

        //then
        assertThat(result).isEqualTo(6);
        assertThat(resultWithZero).isEqualTo(0);
    }

    @Test
    public void shouldDivideCorrectly() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(10, 5);

        //then
        assertThat(result).isEqualTo(2);
    }


    @Test
    public void shouldThrowExceptionWhenDivideByZero() {
        //given
        Calculator calculator = new Calculator();

        //when
        try {
            double result = calculator.divide(10, 0);
            Assert.fail();
        } catch (ArithmeticException e) {
            //then test pass
        }
    }

    @Test
    public void test() {
        File file = new File("plik.txt");

        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
