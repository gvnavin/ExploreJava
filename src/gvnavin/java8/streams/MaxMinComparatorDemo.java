package gvnavin.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 7/4/16.
 */
public class MaxMinComparatorDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    
        numbers.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        
        final OptionalInt optionalMinInt = numbers.stream()
                                                  .mapToInt(Integer::intValue)
                                                  .min();
        
        System.out.println("optionalMinInt = " + optionalMinInt.getAsInt());
    
    
        final OptionalInt optionalMaxInt = numbers.stream()
                                       .mapToInt(Integer::intValue)
                                       .max();
        System.out.println("optionalMaxInt = " + optionalMaxInt.getAsInt());
    
        numbers.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

        numbers.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        
        numbers.stream().max(Comparator.comparingInt(Integer::intValue)).ifPresent(System.out::println);

        numbers.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
        numbers.stream().min(Comparator.comparingInt(Integer::intValue)).ifPresent(System.out::println);

    }
}
