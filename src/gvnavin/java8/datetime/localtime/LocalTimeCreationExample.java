package gvnavin.java8.datetime.localtime;

import java.time.Clock;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalTimeCreationExample {
    
    public static void main(final String[] args) {
        
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalTime.parse(10:15:30) = " + LocalTime.parse("10:15:30"));
    
        usingNowAndZoneId();
        
        usingNowAndClock();
    
        usingOf();
    
    }
    
    private static void usingOf() {
        System.out.println("LocalTime.of(20, 02) = " + LocalTime.of(20, 02));
        
        System.out.println("LocalTime.of(20, 02, 20) = " + LocalTime.of(20, 02, 20));
        
        System.out.println("LocalTime.of(20, 02, 20, 30) = " + LocalTime.of(20, 02, 20, 30));
    
    
    }
    
    private static void usingNowAndClock() {
        System.out.println("LocalTime.now(Clock.systemDefaultZone()) = " + LocalTime.now(Clock.systemDefaultZone()));
    
        System.out.println("LocalTime.now(Clock.system(ZoneId.of(Asia/Kolkata))) = " + LocalTime
            .now(Clock.system(ZoneId.of("Asia/Kolkata"))));
    }
    
    private static void usingNowAndZoneId() {
        System.out.println("LocalTime.now(ZoneId.systemDefault()) = " + LocalTime.now(ZoneId.systemDefault()));
        
        System.out.println("LocalTime.now(ZoneId.of(Asia/Kolkata)) = " + LocalTime.now(ZoneId.of("Asia/Kolkata")));
    }
}
