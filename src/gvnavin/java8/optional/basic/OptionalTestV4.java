package gvnavin.java8.optional.basic;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalTestV4 {

    public static void main(String[] args) {
        OptionalTestV4 optionalTest = new OptionalTestV4();
        try {
            final Optional<String> optionalString = Optional.of(optionalTest.getNullString());
            if (optionalString.isPresent()) {
                System.out.println(optionalString.get().toString());
            }
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
