package iterations;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Zadanie2Test {

    @Test
    public void shouldRetrieveIntArrayCorrectly() {
        //given
        Zadanie2 zadanie2 = new Zadanie2();
        int[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};

        //when
        int[] resultArray = zadanie2.retrieveIntArray(array);

        //then
        assertThat(resultArray).contains(50, 20, 111);
    }
    @Test
    public void shouldRetriveFiveDevided() {        // do sprawdzenia, jak wyodrebic czesc kodu do testu z given ?
        //given
        Zadanie2 zadanie2 = new Zadanie2();
        int[] array = {0, 50, 20, 230, 111, 10, 150, 200, 300, 12, 5};

        //when
        zadanie2.fiveDivided(array);            // metoda nie zwraca tablicy jest voidem do czego to przypisac ? jak sie testuje voidy ?

        //then works
        //assertThat();
    }

}
