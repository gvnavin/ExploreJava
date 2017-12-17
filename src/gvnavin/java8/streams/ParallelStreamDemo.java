package gvnavin.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gnavin on 7/4/16.
 */
public class ParallelStreamDemo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        //parallel processing
        final long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);
    }

}
