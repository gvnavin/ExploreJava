package gvnavin.java8.int_stream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        
        IntStream.range(1, 5).map(i -> i * i).forEach(System.out::println);
        
        Stream<Integer> streamOfIntegers = IntStream.range(1, 5).boxed();
        
        System.out.println(
            IntStream.range(1, 5)
                .filter(i -> i % 2 == 0)
                .allMatch(i -> i % 2 == 0)
        );
        
        System.out.println(
            IntStream.range(1, 5)
                .filter(i -> i % 2 == 0)
                .noneMatch(i -> i % 2 != 0)
        );
    
        System.out.println("IntStream.max : " +
            IntStream.range(1, 5).max().getAsInt()
        );
    
        System.out.println("IntStream.min : " +
            IntStream.range(1, 5).min().getAsInt()
        );
    
        final List<Integer> list
            = IntStream.rangeClosed(1, 20).boxed().collect(toList());
    
        System.out.println("List to IntStream.min : " +
            list.stream().mapToInt(Integer::intValue).min().getAsInt()
        );
    
        System.out.println("List to IntStream.max : " +
            list.stream().mapToInt(Integer::intValue).max().getAsInt()
        );
        
        System.out.println("List to IntStream reduce : " +
            IntStream.range(1, 5).reduce(0, (c, e) -> c + e)
        );
    
        IntStream.range(1, 5).sum();
    
        System.out.println("List to IntStream reduce : " +
            list.stream().mapToInt(Integer::intValue).reduce(0, (c, e) -> c + e)
        );
    
        IntStream.range(1, 5).parallel().forEach(i -> heavyOperation(i));
    }
    
    private static void heavyOperation(final int i) {
        
    }
    
}
