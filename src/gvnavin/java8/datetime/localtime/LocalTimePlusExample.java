package gvnavin.java8.datetime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimePlusExample {
    public static void main(final String[] args) {
        plusChronounit();
        plus();
        
    }
    
    private static void plus() {
        System.out.println("LocalTime.now().plusNanos(10) = " + LocalTime.now().plusNanos(100));
        System.out.println("LocalTime.now().plusSeconds(10) = " + LocalTime.now().plusSeconds(100));
        System.out.println("LocalTime.now().plusMinutes(10) = " + LocalTime.now().plusMinutes(100));
        System.out.println("LocalTime.now().plusHours(10) = " + LocalTime.now().plusHours(100));
    }
    
    private static void plusChronounit() {
        System.out.println("LocalTime.now().plus(1, ChronoUnit.DAYS) = " +
            LocalTime.now().plus(1, ChronoUnit.NANOS));
        
        System.out.println("LocalTime.now().plus(1, ChronoUnit.MONTHS) = " +
            LocalTime.now().plus(1, ChronoUnit.SECONDS));
        
        System.out.println("LocalTime.now().plus(1, ChronoUnit.YEARS) = " +
            LocalTime.now().plus(1, ChronoUnit.MINUTES));
        
        System.out.println("LocalTime.now().plus(1, ChronoUnit.WEEKS) = " +
            LocalTime.now().plus(1, ChronoUnit.HOURS));
    }
}
