package c04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author muhammed-topgul
 * @since 17/08/2023 10:26
 */
public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date); // 2022-01-20

        date = date.plusDays(1);
        System.out.println(date); // 2022-01-21

        date = date.plusMonths(1);
        System.out.println(date); // 2022-02-21

        date = date.plusYears(1);
        System.out.println(date); // 2023-02-21
    }
}