package gvnavin.java8.streams.flatmap_demo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by gnavin on 7/4/16.
 */
public class FlatMapToIntDemo {
    public static void main(final String[] args) {
        final int[][] intArray = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        
        //1. Stream<int[]>
        final Stream<int[]> streamArray = Stream.of(intArray);
        
        //2. Stream<int[]> -> flatMap -> IntStream
        final IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
        
        final int sum = 0;
        final int reduce = intStream.sum();
        //.reduce(sum, (left, right) -> left + right);
        System.out.println("reduce = " + reduce);
        
        //intStream.forEach(x -> System.out.println(x));
    }
}
