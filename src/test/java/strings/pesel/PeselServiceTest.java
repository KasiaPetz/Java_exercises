package strings.pesel;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PeselServiceTest {

    @Test
    public void averageAge() {
        //given
        PeselService ps = new PeselService();

        List<String> pesels = new ArrayList<>();
        pesels.add("79062712462");
        pesels.add("83062712464");
        pesels.add("54062712461");
        pesels.add("89062712465");
        pesels.add("95062712466");
        pesels.add("84062712463");
        pesels.add("05262712468");

        //when
        double result = ps.averageAge(pesels);

        //then
        assertThat(result).isEqualTo(34.85, offset(0.1));
    }

    @Test
    public void genderCountTest() {
        //given
        PeselService ps = new PeselService();

        List<String> pesels = new ArrayList<>();
        pesels.add("91067212462");
        pesels.add("83062712464");
        pesels.add("54062712461");
        pesels.add("89062712465");
        pesels.add("95062712466");
        pesels.add("84062712463");
        pesels.add("05262712468");

        //when
        GenderCount result = ps.countGenders(pesels);

        //then
        assertThat(result.getWomen()).isEqualTo(4);
        assertThat(result.getMen()).isEqualTo(3);
    }
}