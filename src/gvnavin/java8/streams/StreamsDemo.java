package gvnavin.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by gnavin on 7/3/16.
 */
public class StreamsDemo {

    public static void main(String[] args) {
    }

    public static void listStream() {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
        //stream.forEach(System.out::println);

    }

}
