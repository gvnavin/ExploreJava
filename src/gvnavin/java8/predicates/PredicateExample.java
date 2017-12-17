package gvnavin.java8.predicates;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by gnavin on 5/14/16.
 */
public class PredicateExample {
    public static void main(String[] args) {
        testPredicate1();
    }

    public static void testPredicate1() {

        Predicate<String> stringLengthPredicate00 = new Predicate<String>() {
            @Override
            public boolean test(final String s) {
                return s.length() > 0;
            }
        };

        Predicate<String> stringLengthPredicate01 = (String s) -> { return s.length() > 0; };
        Predicate<String> stringLengthPredicate02 = (s) -> { return s.length() > 0; };
        Predicate<String> stringLengthPredicate03 = s -> { return s.length() > 0; };
        Predicate<String> stringLengthPredicate04 = (s) -> s.length() > 0;
        Predicate<String> stringLengthPredicate05 = s -> s.length() > 0;

        //lambda expression
        Predicate<String> stringLengthPredicate = s -> s.length() > 0;
        System.out.println("stringLengthPredicate : " + stringLengthPredicate.test("foo"));              // true
        System.out.println("stringLengthPredicate.negate() : " + stringLengthPredicate.negate().test("foo"));     // false

        //static method reference
        Predicate<String> stringNonNullPredicate = Objects::nonNull;
        Predicate<String> isStringNullPredicate = Objects::isNull;
        System.out.println("stringNonNullPredicate : " + stringNonNullPredicate.test(new String()));
        System.out.println("isStringNullPredicate : " + isStringNullPredicate.test(null));

        //method reference
        Predicate<String> isStringEmptyPredicate = String::isEmpty;
        Predicate<String> isStringNotEmptyPredicate = isStringEmptyPredicate.negate();
        System.out.println("isStringEmptyPredicate : " + isStringEmptyPredicate.test("Predicate"));
        System.out.println("isStringNotEmptyPredicate : " + isStringNotEmptyPredicate.test("Predicate"));
    }
}
