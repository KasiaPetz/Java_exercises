package exesandohs;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

//# Exes and Ohs
//
//        Sprawdź czy napis ma taką samą ilość 'x' co 'o'.
//
//        Metoda zwraca boolean i nie powinna rozróżniać wielkości liter.
//
//        Np.
//
//        "ooxx " -> true
//        "xooxx" -> false
//        "Xxoo" -> true
//        "abcdxx" -> false
//        "tttyGGyy" -> true


public class ExesAndOhsTest {

    private ExesAndOhs exesAndOhs;

    @Before
    public void setUp() {
        exesAndOhs = new ExesAndOhs();
    }

    @Test
    public void test1() {
        assertThat(exesAndOhs.checkXO("xxxooo")).isTrue();
    }

    @Test
    public void test2() {
        assertThat(exesAndOhs.checkXO("xxxXooOo")).isTrue();
    }

    @Test
    public void test3() {
        assertThat(exesAndOhs.checkXO("xxx23424esdsfvxXXOOooo")).isFalse();
    }

    @Test
    public void test4() {
        assertThat(exesAndOhs.checkXO("xXxxoewrcoOoo")).isFalse();
    }

    @Test
    public void test5() {
        assertThat(exesAndOhs.checkXO("XxxxooO")).isFalse();
    }

    @Test
    public void test6() {
        assertThat(exesAndOhs.checkXO("zssddd")).isTrue();
    }

    @Test
    public void test7() {
        assertThat(exesAndOhs.checkXO("Xxxxertr34")).isFalse();
    }

}
