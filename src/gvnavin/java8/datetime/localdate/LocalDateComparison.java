package gvnavin.java8.datetime.localdate;

import java.time.LocalDate;

public class LocalDateComparison {
    
    public static void main(String[] args) {
        boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("notBefore = " + notBefore);
    
        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        System.out.println("isAfter = " + isAfter);
    }
}
