package c04.working_with_dates_and_times;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author muhammed-topgul
 * @since 18/08/2023 09:19
 */
public class WorkingWithDurations {
    public static void main(String[] args) {
        {
            var everyDay = Duration.ofDays(1);            // PT24H
            var everyHour = Duration.ofHours(1);          // PT1H
            var everyMinutes = Duration.ofMinutes(1);     // PT1M
            var everyTenSeconds = Duration.ofSeconds(10); // PT10S
            var everyMilli = Duration.ofMillis(1);        // PT0.001S
            var everyNano = Duration.ofNanos(1);          // PT0.000000001S

            System.out.println(everyDay);
            System.out.println(everyHour);
            System.out.println(everyMinutes);
            System.out.println(everyTenSeconds);
            System.out.println(everyMilli);
            System.out.println(everyNano);
        }
        {
            var everyDay = Duration.of(1, ChronoUnit.DAYS);            // PT24H
            var everyHour = Duration.of(1, ChronoUnit.HOURS);          // PT1H
            var everyMinutes = Duration.of(1, ChronoUnit.MINUTES);     // PT1M
            var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS); // PT10S
            var everyMilli = Duration.of(1, ChronoUnit.MILLIS);        // PT0.001S
            var everyNano = Duration.of(1, ChronoUnit.NANOS);          // PT0.000000001S

            System.out.println(everyDay);
            System.out.println(everyHour);
            System.out.println(everyMinutes);
            System.out.println(everyTenSeconds);
            System.out.println(everyMilli);
            System.out.println(everyNano);
        }
    }
}
