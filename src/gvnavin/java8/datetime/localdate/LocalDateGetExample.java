package gvnavin.java8.datetime.localdate;

import java.time.LocalDate;

public class LocalDateGetExample {
    public static void main(String[] args) {
        System.out.println("LocalDate.now().getChronology() = " + LocalDate.now().getChronology());
        System.out.println("LocalDate.now().getDayOfWeek() = " + LocalDate.now().getDayOfWeek());
        System.out.println("LocalDate.now().getDayOfMonth() = " + LocalDate.now().getDayOfMonth());
        System.out.println("LocalDate.now().getDayOfYear() = " + LocalDate.now().getDayOfYear());
    
        System.out.println("LocalDate.now().getMonth() = " + LocalDate.now().getMonth());
        System.out.println("LocalDate.now().getMonthValue() = " + LocalDate.now().getMonthValue());
        System.out.println("LocalDate.now().getYear() = " + LocalDate.now().getYear());
        System.out.println("LocalDate.now().getEra() = " + LocalDate.now().getEra());
        
        System.out.println("LocalDate.now().isLeapYear() = " + LocalDate.now().isLeapYear());
    
        /**
         
         LocalDate.now().getChronology() = ISO
         LocalDate.now().getDayOfWeek() = SATURDAY
         LocalDate.now().getDayOfMonth() = 9
         LocalDate.now().getDayOfYear() = 343
         LocalDate.now().getMonth() = DECEMBER
         LocalDate.now().getMonthValue() = 12
         LocalDate.now().getYear() = 2017
         LocalDate.now().getEra() = CE
         LocalDate.now().isLeapYear() = false
         
         */
    }
}
