package gvnavin.java8.streams.flatmap_demo;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by gnavin on 7/4/16.
 */
public class FlatMapDemo {
    public static void main(final String[] args) {
        final String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };
        
        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        temp.forEach(System.out::println);
        
        //Stream<String>, GOOD!
        temp = Arrays.stream(data);
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        stringStream.forEach(System.out::println);
        
        temp = Arrays.stream(data);
        stringStream = temp.flatMap(x -> Arrays.stream(x));
        final Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
        
        stream.forEach(System.out::println);
        
        //combine together
        Arrays.stream(data)
              .flatMap(x -> Arrays.stream(x))
              .filter(x -> "a".equals(x.toString()))
              .forEach(System.out::println);
        
    }
}
