package strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeBinaryTest {

    @Test
    public void fakeBinTest() {
        //given
        String str = "1234567890";

        //when
        String result = FakeBinary.fakeBin(str);

        //then
        assertThat("0000111110").isEqualTo(result);
    }

    @Test
    public void fakeBinTest2() {
        //given
        String shortStr = "1234";

        //when
        String result2 = FakeBinary.fakeBin(shortStr);

        //then
        assertThat("0000").isEqualTo(result2);
    }

    @Test
    public void fakeBinTest3() {
        //given
        String shortStr = "558342";

        //when
        String result2 = FakeBinary.fakeBin(shortStr);

        //then
        assertThat("111000").isEqualTo(result2);
    }
}