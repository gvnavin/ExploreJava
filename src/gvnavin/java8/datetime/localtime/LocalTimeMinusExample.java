package gvnavin.java8.datetime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeMinusExample {
    public static void main(String[] args) {
        minusChronounit();
        minus();
        
    }
    
    private static void minus() {
        System.out.println("LocalTime.now().minusNanos(10) = " + LocalTime.now().minusNanos(100));
        System.out.println("LocalTime.now().minusSeconds(10) = " + LocalTime.now().minusSeconds(100));
        System.out.println("LocalTime.now().minusMinutes(10) = " + LocalTime.now().minusMinutes(100));
        System.out.println("LocalTime.now().minusHours(10) = " + LocalTime.now().minusHours(100));
    }
    
    private static void minusChronounit() {
        System.out.println("LocalTime.now().minus(1, ChronoUnit.DAYS) = " +
            LocalTime.now().minus(1, ChronoUnit.NANOS));
        
        System.out.println("LocalTime.now().minus(1, ChronoUnit.MONTHS) = " +
            LocalTime.now().minus(1, ChronoUnit.SECONDS));
        
        System.out.println("LocalTime.now().minus(1, ChronoUnit.YEARS) = " +
            LocalTime.now().minus(1, ChronoUnit.MINUTES));
        
        System.out.println("LocalTime.now().minus(1, ChronoUnit.WEEKS) = " +
            LocalTime.now().minus(1, ChronoUnit.HOURS));
    }
}
