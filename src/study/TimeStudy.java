package study;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeStudy {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

//        System.out.println(now.plus(1, ChronoUnit.DAYS));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

//        System.out.println(zonedDateTime.getZone());
//        System.out.println(zonedDateTime);

        Period period = Period.ofDays(1);

        Duration duration = Duration.ofDays(1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plus(duration));
    }

}
