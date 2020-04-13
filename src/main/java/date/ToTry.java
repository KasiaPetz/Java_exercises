package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class ToTry {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(1994, 1, 5);

        Period period = Period.between(date, now);
        int periodYears = period.getYears();
        int periodMonths = period.getMonths();
        int periodDays = period.getDays();
        String periodString = period.toString();


        System.out.println(period);
        System.out.println(periodString);  //dlaczego hashkod
        System.out.println(periodYears);
        System.out.println(periodMonths);  //ilość pozostałych miesecy po rozliczeniu lat w danum period
        System.out.println(periodDays);

        System.out.println(ChronoUnit.DAYS.between(date, now));


        Integer[] tab = {1,2,3,4};
        List<Integer> list = Arrays.asList(tab);
    }
}
