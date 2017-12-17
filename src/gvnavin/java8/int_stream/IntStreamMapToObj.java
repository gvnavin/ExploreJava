package gvnavin.java8.int_stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class IntStreamMapToObj {
    public static void main(final String[] args) {
        final DoubleStream doubleStream = IntStream.range(1, 5).mapToDouble(i -> i);
        
        final LongStream longStream = IntStream.range(1, 5).mapToLong(i -> i);
        
        final Stream<Color> stream = IntStream.range(1, 5).mapToObj(i -> getColor(i));
    }
    
    private static Color getColor(final int i) {
        return new Color();
    }
    
    static class Color {
        
    }
}
