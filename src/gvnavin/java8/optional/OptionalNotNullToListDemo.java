package gvnavin.java8.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 7/2/16.
 */
public class OptionalNotNullToListDemo {

    public static void main(String[] args) {
        final Optional<String> opt = Optional.of("String");
        List<String> list = collect(opt, Collectors.toList());
        Set<String> set  = collect(opt, Collectors.toSet());
    }

    //toList Own Implementation
    public static <T> List<T> toList() {
        final Optional<String> opt = Optional.of("String");
        return (List<T>) opt.map(Collections::singletonList)
                            .orElse(Collections.emptyList());
    }

    //Optional to List or set
    public static <R, A, T> R collect(Optional<T> option, Collector<? super T, A, R> collector) {
        final A container = collector.supplier().get();
        option.ifPresent(v -> collector.accumulator().accept(container, v));
        return collector.finisher().apply(container);
    }

}
