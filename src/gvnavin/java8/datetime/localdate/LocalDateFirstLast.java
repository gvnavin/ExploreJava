package gvnavin.java8.datetime.localdate;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateFirstLast {
    public static void main(String[] args) {
        
        LocalDate firstDayOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstDayOfNextMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        
        LocalDate firstDayOfYear = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        LocalDate firstDayOfNextYear = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        
        LocalDate lastDayOfMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        LocalDate lastDayOfYear = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
    
        System.out.println("firstDayOfMonth = " + firstDayOfMonth);
        System.out.println("firstDayOfNextMonth = " + firstDayOfNextMonth);
    
        System.out.println("firstDayOfYear = " + firstDayOfYear);
        System.out.println("firstDayOfNextYear = " + firstDayOfNextYear);
    
        System.out.println("lastDayOfMonth = " + lastDayOfMonth);
        System.out.println("lastDayOfYear = " + lastDayOfYear);
        
    }
}
