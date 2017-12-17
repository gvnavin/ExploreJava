package gvnavin.java8.optional.basic;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalTestV3 {

    public static void main(String[] args) {
        OptionalTestV3 optionalTest = new OptionalTestV3();
        Optional<String> optionalString = optionalTest.getOptionalNullString();
        try {
            if (optionalString.isPresent()) {
                System.out.println(optionalString.get().toString());
            }
        } catch (NullPointerException x) {
            System.out.println("Optional object can be null");
        }
    }

    public String getNullString() {
        return (null);
    }

    public Optional<String> getOptionalNullString() {
        return (null);
    }

}
