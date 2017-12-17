package gvnavin.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by gnavin on 7/4/16.
 */
public class FilterToArrayDemo {
    
    public static void main(final String[] args) {
        /*List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }*/
        
        final List<Integer> list = IntStream.range(0, 10)
                                            .boxed()
                                            .collect(Collectors.toList());
        
        final Stream<Integer> stream = list.stream();
        final Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }
}
