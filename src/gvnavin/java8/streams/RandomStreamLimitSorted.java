package gvnavin.java8.streams;

import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by gnavin on 7/4/16.
 */
public class RandomStreamLimitSorted {

    public static void main(String[] args) {
        //print ten random numbers
        Random random = new Random();

        System.out.println("java 7 :");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("java 8 random numbers :");
        random.ints().limit(10).forEach(System.out::println);

        System.out.println("java 8 random numbers sorted:");
        random.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println("java 8 random numbers sorted modulo :");
        random.ints().limit(10).sorted().map(x -> x % 91).forEach(System.out::println);

    }

    public static void streamGenerate() {
        //generate infinitely if limit is given
        Stream<Date> stream = Stream.generate(() -> new Date());
        stream.limit(10).forEach(p -> System.out.println(p));

        Stream<Date> stream2 = Stream.generate(Date::new);
        stream2.limit(10).forEach(System.out::println);
    }

}
