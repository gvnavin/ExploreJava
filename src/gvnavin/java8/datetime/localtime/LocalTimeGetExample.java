package gvnavin.java8.datetime.localtime;

import java.time.LocalTime;

public class LocalTimeGetExample {
    public static void main(String[] args) {
        System.out.println("LocalTime.now().getHour() = " + LocalTime.now().getHour());
        System.out.println("LocalTime.now().getMinute() = " + LocalTime.now().getMinute());
        System.out.println("LocalTime.now().getSecond() = " + LocalTime.now().getSecond());
        System.out.println("LocalTime.now().getNano() = " + LocalTime.now().getNano());
    
        System.out.println("LocalTime.MAX = " + LocalTime.MAX);
        System.out.println("LocalTime.MIN = " + LocalTime.MIN);
        System.out.println("LocalTime.MIDNIGHT = " + LocalTime.MIDNIGHT);
    }
}
