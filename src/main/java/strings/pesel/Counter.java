package strings.pesel;

import java.util.List;

public interface Counter {

    double averageAge(List<String> peselsList);
    GenderCount countGenders(List<String> peselsList);
}
