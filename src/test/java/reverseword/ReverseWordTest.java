package reverseword;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordTest {

    @Test
    public void reverseWordTest(){
        //given
        String word = "Michal";

        //when
        String result = ReverseWord.reverseWord(word);

        //then
        assertThat(result).isEqualTo("lahciM");
    }


    @Test
    public void reverseWordLoopTest() {
        //given
        String word = "Michal";

        //when
        String result = ReverseWord.reverseWordWithLoop(word);

        //then
        assertThat(result).isEqualTo("lahciM");
    }
}