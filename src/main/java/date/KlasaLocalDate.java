package date;

import java.time.LocalDate;
import java.time.Period;

public class KlasaLocalDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate localDate1 = LocalDate.of(2000, 5, 10);

        Period period = Period.between(localDate1, today);   //tutaj nie wiem o co chodzi
        int per = period.getYears();

        System.out.println("Period type " + period);   // ????? toString()
        System.out.println("With getYears() " + per);

        System.out.println(localDate1.getYear());       //2000
        System.out.println(localDate1.getMonthValue()); //5
        System.out.println(localDate1.getDayOfMonth()); //10
        System.out.println(localDate1.getDayOfYear());  //131


        System.out.println(localDate1.plusDays(4));    //2000-05-14 zwraca nowy obiekt
        System.out.println(localDate1);
        System.out.println(localDate1.minusDays(34));  //2000-04-06

        System.out.println(localDate1.plusMonths(1));  //2000-06-10
        System.out.println(localDate1.minusMonths(4)); //2000-01-10

        System.out.println(localDate1.plusYears(10));  //2010-05-10
        System.out.println(localDate1.minusYears(5));  //1995-05-10

        System.out.println(localDate1.isLeapYear());   //true

        LocalDate localDate2 = LocalDate.of(2010, 1, 1);

        System.out.println(localDate1.isBefore(localDate2)); //true
        System.out.println(localDate1.isAfter(localDate2));  //false
    }
}
