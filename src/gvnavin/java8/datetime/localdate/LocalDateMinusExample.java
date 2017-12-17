package gvnavin.java8.datetime.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateMinusExample {
    public static void main(String[] args) {
        minusChronounit();
        minus();
        
    }
    
    private static void minus() {
        System.out.println("LocalDate.now().minusDays(10) = " + LocalDate.now().minusDays(10));
        System.out.println("LocalDate.now().minusMonths(10) = " + LocalDate.now().minusMonths(10));
        System.out.println("LocalDate.now().minusWeeks(10) = " + LocalDate.now().minusWeeks(10));
        System.out.println("LocalDate.now().minusYears(10) = " + LocalDate.now().minusYears(10));
    }
    
    private static void minusChronounit() {
        System.out.println("LocalDate.now().minus(1, ChronoUnit.DAYS) = " +
            LocalDate.now().minus(1, ChronoUnit.DAYS));
        
        System.out.println("LocalDate.now().minus(1, ChronoUnit.MONTHS) = " +
            LocalDate.now().minus(1, ChronoUnit.MONTHS));
        
        System.out.println("LocalDate.now().minus(1, ChronoUnit.YEARS) = " +
            LocalDate.now().minus(1, ChronoUnit.YEARS));
        
        System.out.println("LocalDate.now().minus(1, ChronoUnit.WEEKS) = " +
            LocalDate.now().minus(1, ChronoUnit.WEEKS));
        
        System.out.println("LocalDate.now().minus(1, ChronoUnit.DECADES) = " +
            LocalDate.now().minus(1, ChronoUnit.DECADES));
        
        System.out.println("LocalDate.now().minus(1, ChronoUnit.CENTURIES) = " +
            LocalDate.now().minus(1, ChronoUnit.CENTURIES));
        
        System.out.println("LocalDate.now().minus(1, ChronoUnit.MILLENNIA) = " +
            LocalDate.now().minus(1, ChronoUnit.MILLENNIA));
    }
}
