package strings.pesel;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class PeselService implements Counter {
    //oblicza sredni wiek z listy peseli
    @Override
    public double averageAge(List<String> peselsList) {
        int sum = 0;

        for (String pesel : peselsList) {
            LocalDate birthday = getLocalDateFromPesel(pesel);
            LocalDate now = LocalDate.now();

            int age = Period.between(birthday, now).getYears();

            sum += age;
        }

        return (double) sum / peselsList.size();
    }

    private LocalDate getLocalDateFromPesel(String pesel) {
        int month = Integer.parseInt(pesel.substring(2, 4));   //parseInt() na typ prymitywny valueOf() na obiekt
        int year = Integer.parseInt(pesel.substring(0, 2));

        if (month > 20) {
            month = month - 20;
            year += 2000;
        } else {
            year += 1900;
        }

        int day = Integer.parseInt(pesel.substring(4, 6));

        return LocalDate.of(year, month, day);
    }

    @Override
    public GenderCount countGenders(List<String> peselsList) {
        int women = 0;
        int men = 0;

        for (String pesel : peselsList) {
            boolean validPesel = peselValidator(pesel);

            if (validPesel) {
                if (pesel.charAt(10) % 2 == 0 || pesel.charAt(10) == 0) {
                    women++;
                } else {
                    men++;
                }
            }
        }

        return new GenderCount(women, men);
    }

    private static boolean peselValidator(String pesel) {
        String trimPesel = pesel.trim();
        if (trimPesel.length() != 11 || !trimPesel.matches("[0-9]+")) {
            return false;
        }
        return true;
    }
}


