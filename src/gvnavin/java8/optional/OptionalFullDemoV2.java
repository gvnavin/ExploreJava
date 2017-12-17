package gvnavin.java8.optional;

import java.time.Instant;
import java.util.Optional;

import static java.time.Instant.now;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalFullDemoV2 {

    //https://dzone.com/articles/optional-java-8-cheat-sheet

    public static void main(String[] args) {

        Optional<String> optNotNull = Optional.of("notNull");
        //not working as expected
        Optional<String> similar = optNotNull.flatMap(OptionalFullDemoV2::tryFindSimilar);


    }

    public static Optional<String> tryFindSimilar(String s) {
        return null;
    }


}
