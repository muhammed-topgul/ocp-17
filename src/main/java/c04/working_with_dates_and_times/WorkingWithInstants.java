package c04.working_with_dates_and_times;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * @author muhammed-topgul
 * @since 18/08/2023 09:32
 */
public class WorkingWithInstants {
    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now();
        TimeUnit.SECONDS.sleep(2);
        Instant later = Instant.now();

        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());
    }
}
