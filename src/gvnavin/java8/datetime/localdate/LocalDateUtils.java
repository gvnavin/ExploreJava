package gvnavin.java8.datetime.localdate;

import java.time.LocalDate;

public class LocalDateUtils {
    public static void main(String[] args) {
        System.out.println("LocalDate.now().atStartOfDay() = " + LocalDate.now().atStartOfDay());
    
        System.out.println("LocalDate.now().atTime(13, 50) = " + LocalDate.now().atTime(13, 50));
        
    }
}
