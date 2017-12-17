package gvnavin.java8.optional;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalFullDemo {

    //https://dzone.com/articles/optional-java-8-cheat-sheet

    public static void main(final String[] args) {

        waysOfCreatingOptional();

        String x = "String";
        if (x != null && x.contains("ing")) {
            System.out.println("x != null && x.contains(ing) : " + x);
        }

        Optional<String> opt = Optional.of(x);

        if (opt.isPresent() && opt.get().contains("ing")) {
            System.out.println("opt.isPresent() && opt.get().contains(ing)" + opt.get());
        }

        opt.filter(a -> a.contains("ing"))
           .ifPresent(a -> System.out.println("Optional.filter(ing).ifPresent(Lambda) : " + a));

        x = "1  ";
        opt = Optional.of(x);
        if (x != null) {
            final String t = x.trim();
            if (t.length() > 1) {
                System.out.println(t);
            }
        }

        opt.map(String::trim)
           .filter(t -> t.length() > 1)
           .ifPresent(System.out::println);

        final Optional<Integer> lengthOptional = opt.map(String::length);
        System.out.println("Optional<Integer> lengthOptional = " + lengthOptional);
        demoEqualToNullUsingOrElseGet();

        final Optional<String> optNotNull = Optional.of("notNull");
        //replacement of firstChar
        final Character firstChar = optNotNull.filter(s -> !s.isEmpty())
                                              .map(s -> s.charAt(0))
                                              .orElseThrow(IllegalArgumentException::new);
        System.out.println("character = " + firstChar);

    }

    private static void waysOfCreatingOptional() {
        final Optional<String> optNotNull = Optional.of("notNull");
        System.out.println("optNotNull = " + optNotNull);

        final Optional<String> optNull = Optional.of(null);
        System.out.println("optNull = " + optNull);

        final Optional<Object> optMayBeNul = Optional.ofNullable(null);
        System.out.println("optMayBeNul = " + optMayBeNul);

        final Optional<Object> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
    }

    private static void demoNotEqualToNullUsingIfPresent() {
        final String x = "String";

        if (x != null) {
            System.out.println("x != null + " + x);
        }

        final Optional<String> opt = Optional.of(x);

        opt.ifPresent(a -> System.out.println("demoNotEqualToNullUsingIfPresent Optional.ifPresent(Lambda) : " + a));
        opt.ifPresent(System.out::println);

    }

    private static void demoEqualToNullUsingOrElseGet() {
        final String x = null;
        final Optional<String> opt = Optional.ofNullable(x);
        if (x == null) {
            final String string = getString();
            System.out.println("demoEqualToNullUsingOrElseGet if (x == null), string = " + string);
        }
        final String str = opt.orElseGet(OptionalFullDemo::getString);
        System.out.println("demoEqualToNullUsingOrElseGet orElseGet str = " + str);
    }

    public static void demoNotEqualToNullElseUsingMapOrElse() {
        final String x = "1  ";
        final Optional<String> opt = Optional.of(x);

        //normal
        int length = (x != null) ? x.length() : -1;
        System.out.println("length = " + length);

        //using optional
        length = opt.map(String::length).orElse(-1);
        System.out.println("length = " + length);

        length = opt.map(OptionalFullDemo::takeStringInput).orElse(-1);
        System.out.println("length = " + length);

        final int intlen = opt.map(String::length)
                              .orElseGet(OptionalFullDemo::getLength);
        System.out.println("intlen = " + intlen);

    }

    public static String getString() {
        return "String";
    }

    public static int getLength() {
        return 11;
    }

    public static int takeStringInput(final String s) {
        return 111;
    }

    public char firstChar(final String s) {
        if (s != null && !s.isEmpty())
            return s.charAt(0);
        else
            throw new IllegalArgumentException();
    }

}
