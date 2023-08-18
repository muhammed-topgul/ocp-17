package c04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author muhammed-topgul
 * @since 17/08/2023 10:10
 */
public class CreatingDatesAndTimes {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());      // 2023-08-17
        System.out.println(LocalTime.now());      // 10:16:38.734925300
        System.out.println(LocalDateTime.now());  // 2023-08-17T10:16:38.734925300
        System.out.println(ZonedDateTime.now());  // 2023-08-17T10:16:38.734925300+03:00[Europe/Istanbul]

        LocalDate date1 = LocalDate.of(2022, Month.JANUARY, 20); // 2022-01-20
        LocalDate date2 = LocalDate.of(2022, 1, 20);       // 2022-01-20
        System.out.println(date1.equals(date2)); // true

        LocalTime time1 = LocalTime.of(6, 15); // 06:15
        LocalTime time2 = LocalTime.of(6, 15, 30); // 06:15:30
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // 06:15:30.000000200

        LocalDateTime dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dataTime2 = LocalDateTime.of(date1, time1);

        ZoneId zone = ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date2, time2, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);

        // var d = new LocalDate(); // DOES NOT COMPILE
        var d = LocalDate.of(2022, Month.JANUARY, 32); // DateTimeException
    }
}
