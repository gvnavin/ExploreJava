package gvnavin.java8.datetime.localtime;

import java.time.LocalTime;

public class LocalTimeComparison {
    
    public static void main(final String[] args) {
        final boolean notBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println("notBefore = " + notBefore);
        
        final boolean isAfter = LocalTime.parse("06:30").isAfter(LocalTime.parse("07:30"));
        System.out.println("isAfter = " + isAfter);
    }
}
