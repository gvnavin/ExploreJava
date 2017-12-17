package gvnavin.java8.int_stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class IntStreamCreation {
    
    public static void main(String[] args) {
        System.out.println("IntStream.of");
        IntStream.of(1, 2, 3).forEach(System.out::println);
    
        System.out.println("IntStream.range");
        IntStream.range(0, 5).forEach(System.out::println);
    
        System.out.println("IntStream.rangeClosed");
        //for consistency avoid rangeClosed use range always
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    
        System.out.println("IntStream.iterate (limit is actually no of items [not termination condition])");
        IntStream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);
    
        System.out.println("IntStream.generate IntSupplier");
        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(3);
    
        IntStream intStreamChars = "12345_abcdefg".chars();
        intStreamChars.forEach(System.out::println);
    }
}
