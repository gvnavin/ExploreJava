package gvnavin.java8.datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.Month;

//http://www.baeldung.com/java-8-date-time-intro
public class LocalDateTimeExample {
    public static void main(final String[] args) {
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        
        System.out.println(
            "LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30) = " +
                LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30)
        );
        
        System.out.println(
            "LocalDateTime.parse(2015-02-20T06:30:00) = " +
                LocalDateTime.parse("2015-02-20T06:30:00")
        );
        
        System.out.println("LocalDateTime.now().getDayOfWeek() = " + LocalDateTime.now().getDayOfWeek());
        System.out.println("LocalDateTime.now().getDayOfMonth() = " + LocalDateTime.now().getDayOfMonth());
        System.out.println("LocalDateTime.now().getDayOfYear() = " + LocalDateTime.now().getDayOfYear());
        
        System.out.println("LocalDateTime.now().getHour() = " + LocalDateTime.now().getHour());
        System.out.println("LocalDateTime.now().getMinute() = " + LocalDateTime.now().getMinute());
        System.out.println("LocalDateTime.now().getSecond() = " + LocalDateTime.now().getSecond());
        System.out.println("LocalDateTime.now().getNano() = " + LocalDateTime.now().getNano());
        
        System.out.println("LocalDateTime.now().getMonth() = " + LocalDateTime.now().getMonth());
        System.out.println("LocalDateTime.now().getMonthValue() = " + LocalDateTime.now().getMonthValue());
        
        System.out.println("LocalDateTime.now().getYear() = " + LocalDateTime.now().getYear());
        
        System.out.println("LocalDateTime.now().plusNanos(1) = " + LocalDateTime.now().plusNanos(1));
        System.out.println("LocalDateTime.now().plusSeconds(1) = " + LocalDateTime.now().plusSeconds(1));
        System.out.println("LocalDateTime.now().plusMinutes(1) = " + LocalDateTime.now().plusMinutes(1));
        System.out.println("LocalDateTime.now().plusHours(1) = " + LocalDateTime.now().plusHours(1));
        
        System.out.println("LocalDateTime.now().plusWeeks(1) = " + LocalDateTime.now().plusWeeks(1));
        
        System.out.println("LocalDateTime.now().minusDays(1) = " + LocalDateTime.now().minusDays(1));
        System.out.println("LocalDateTime.now().minusMonths(1) = " + LocalDateTime.now().minusMonths(1));
        System.out.println("LocalDateTime.now().minusYears(1) = " + LocalDateTime.now().minusYears(1));
        
        System.out.println("LocalDateTime.now().minusNanos(1) = " + LocalDateTime.now().minusNanos(1));
        System.out.println("LocalDateTime.now().minusSeconds(1) = " + LocalDateTime.now().minusSeconds(1));
        System.out.println("LocalDateTime.now().minusMinutes(1) = " + LocalDateTime.now().minusMinutes(1));
        System.out.println("LocalDateTime.now().minusHours(1) = " + LocalDateTime.now().minusHours(1));
        
        System.out.println("LocalDateTime.now().minusWeeks(1) = " + LocalDateTime.now().minusWeeks(1));
        
        System.out.println("LocalDateTime.now().minusDays(1) = " + LocalDateTime.now().minusDays(1));
        System.out.println("LocalDateTime.now().minusMonths(1) = " + LocalDateTime.now().minusMonths(1));
        System.out.println("LocalDateTime.now().minusYears(1) = " + LocalDateTime.now().minusYears(1));
        
    }
}
