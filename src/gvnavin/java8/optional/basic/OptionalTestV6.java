package gvnavin.java8.optional.basic;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalTestV6 {

    public static void main(String[] args) {
        OptionalTestV6 optionalTest = new OptionalTestV6();
        try {
            final Optional<String> optionalString = Optional.ofNullable(optionalTest.getNullString());
            optionalString.ifPresent(s -> System.out.println(s.toString()));
            final String otherStringValue = optionalString.orElse("OtherStringValue");
            System.out.println("otherStringValue = " + otherStringValue);
        } catch (NullPointerException x) {
            System.out.println("NullPointerException");
        }
    }

    public String getNullString() {
        return (null);
    }

    public Optional<String> getOptionalNullString() {
        return (null);
    }

}
