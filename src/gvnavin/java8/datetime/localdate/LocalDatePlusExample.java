package gvnavin.java8.datetime.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDatePlusExample {
    public static void main(String[] args) {
        plusChronounit();
        plus();
        
    }
    
    private static void plus() {
        System.out.println("LocalDate.now().plusDays(10) = " + LocalDate.now().plusDays(10));
        System.out.println("LocalDate.now().plusMonths(10) = " + LocalDate.now().plusMonths(10));
        System.out.println("LocalDate.now().plusWeeks(10) = " + LocalDate.now().plusWeeks(10));
        System.out.println("LocalDate.now().plusYears(10) = " + LocalDate.now().plusYears(10));
    }
    
    private static void plusChronounit() {
        System.out.println("LocalDate.now().plus(1, ChronoUnit.DAYS) = " +
            LocalDate.now().plus(1, ChronoUnit.DAYS));
        
        System.out.println("LocalDate.now().plus(1, ChronoUnit.MONTHS) = " +
            LocalDate.now().plus(1, ChronoUnit.MONTHS));
        
        System.out.println("LocalDate.now().plus(1, ChronoUnit.YEARS) = " +
            LocalDate.now().plus(1, ChronoUnit.YEARS));
        
        System.out.println("LocalDate.now().plus(1, ChronoUnit.WEEKS) = " +
            LocalDate.now().plus(1, ChronoUnit.WEEKS));
        
        System.out.println("LocalDate.now().plus(1, ChronoUnit.DECADES) = " +
            LocalDate.now().plus(1, ChronoUnit.DECADES));
        
        System.out.println("LocalDate.now().plus(1, ChronoUnit.CENTURIES) = " +
            LocalDate.now().plus(1, ChronoUnit.CENTURIES));
        
        System.out.println("LocalDate.now().plus(1, ChronoUnit.MILLENNIA) = " +
            LocalDate.now().plus(1, ChronoUnit.MILLENNIA));
    }
}
