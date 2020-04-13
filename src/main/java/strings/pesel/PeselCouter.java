package strings.pesel;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class PeselCouter implements Counter {

    //ma zwracać sredni wiek
    @Override
    public double averageAge(List<String> peselsList) {
        int sum = 0;

        for (String pesel : peselsList) {
            int suma = 0;
            LocalDate birthday = getLocalDateFromPesel(pesel);
            LocalDate now = LocalDate.now();

            int age = Period.between(birthday, now).getYears();

            sum = +age;
        }

        return sum / peselsList.size();
    }

    @Override
    public GenderCount countGenders(List<String> peselsList) {
        return null;
    }

    // LocalDate.of(year, month, day)
    private LocalDate getLocalDateFromPesel(String pesel) {
        // parse dla prymitywnych valueOf dla obiektów
        int day = Integer.parseInt(pesel.substring(4, 6));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int year = Integer.parseInt(pesel.substring(0, 2));

        //pesele po roku 2000 do miesiaca maja doliczone +20 do miesiaca, 21 styczen 32 grudzień
        if (month > 20) {
            month = month - 20;
            year += 2000;
        } else {
            year += 1900;
        }

        return LocalDate.of(year, month, day);
    }
}
