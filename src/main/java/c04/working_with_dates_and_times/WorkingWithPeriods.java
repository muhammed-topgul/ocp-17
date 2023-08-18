package c04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/**
 * @author muhammed-topgul
 * @since 18/08/2023 08:53
 */
public class WorkingWithPeriods {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        // performAnimalEnrichment(start, end);
        performAnimalEnrichment(start, end, Period.ofMonths(1));

        System.out.println(Period.of(1, 2, 3));
        System.out.println(Period.ofMonths(3));

        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period));  // Exception
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        var upTo = start;
        while (upTo.isBefore(end)) {  // check is still before end
            System.out.println("Give to toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while (upTo.isBefore(end)) {  // check is still before end
            System.out.println("Give to toy: " + upTo);
            upTo = upTo.plus(period); // add a month
        }
    }
}
