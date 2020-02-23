package strings;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class ReverseStringTest {

    @Test
    void reverseWords() {
        //given
        String str = "K a s i a";

        //when
        String result = ReverseString.reverseWords(str);

        //then
        assertThat(result).isEqualTo("a i s a K");
    }
}