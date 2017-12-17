package gvnavin.java8.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by gnavin on 7/4/16.
 */
public class WaysOfCreatingStreams {
    
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //stream.forEach(p -> System.out.println(p));
        stream.forEach(System.out::println);
        
        Stream<Integer> streamArray = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        //streamArray.forEach(p -> System.out.println(p));
        streamArray.forEach(System.out::println);
        
        IntStream intStreamChars = "12345_abcdefg".chars();
        //intStreamChars.forEach(p -> System.out.println(p));
        intStreamChars.forEach(System.out::println);
        
        Stream<String> streamStringSplit = Stream.of("A$B$C".split("\\$"));
        //streamStringSplit.forEach(p -> System.out.println(p));
        streamStringSplit.forEach(System.out::println);
    }
}
