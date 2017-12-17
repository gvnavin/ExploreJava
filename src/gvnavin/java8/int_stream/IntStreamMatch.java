package gvnavin.java8.int_stream;

import java.util.stream.IntStream;

public class IntStreamMatch {
    public static void main(final String[] args) {
        IntStream.range(1, 5).anyMatch(i -> i % 2 == 0);
        
        // > false
        IntStream.range(1, 5).allMatch(i -> i % 2 == 0);
        
        // > false
        IntStream.range(1, 5).noneMatch(i -> i % 2 == 0);
    }
}
