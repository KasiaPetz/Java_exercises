package exercises.repeatString;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RepeatStringWithExeptionTest {

    @Test
    public void shouldRepeatStr() {
        //given
        RepaeatString rs = new RepeatStringBuilder();

        //when
        String result = rs.repeatStr(3, "abc");

        //then
        assertThat("abcabcabc").isEqualTo(result);
    }
}

