package gvnavin.java8.datetime.localdate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateCreationExample {
    
    public static void main(final String[] args) {
        
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalDate.parse(2015-02-20) = " + LocalDate.parse("2015-02-20"));
        
        usingNowAndZoneId();
        
        usingNowAndClock();
        
        usingOf();
        
    }
    
    private static void usingOf() {
        System.out.println("LocalDate.of(2015, 02, 20) = " + LocalDate.of(2015, 02, 20));
        
        System.out.println("LocalDate.of(2017, Month.NOVEMBER, 20) = " + LocalDate.of(2017, Month.NOVEMBER, 20));
        
        System.out.println("LocalDate.ofYearDay(2017, 200) = " + LocalDate.ofYearDay(2017, 200));
        
        System.out.println("LocalDate.ofEpochDay(3000) = " + LocalDate.ofEpochDay(3000));
    }
    
    private static void usingNowAndClock() {
        System.out.println("LocalDate.now(Clock.systemDefaultZone()) = " + LocalDate.now(Clock.systemDefaultZone()));
        
        System.out.println("LocalDate.now(Clock.system(ZoneId.of(Asia/Kolkata))) = " + LocalDate
            .now(Clock.system(ZoneId.of("Asia/Kolkata"))));
    }
    
    private static void usingNowAndZoneId() {
        System.out.println("LocalDate.now(ZoneId.systemDefault()) = " + LocalDate.now(ZoneId.systemDefault()));
        
        System.out.println("LocalDate.now(ZoneId.of(Asia/Kolkata)) = " + LocalDate.now(ZoneId.of("Asia/Kolkata")));
    }
}
