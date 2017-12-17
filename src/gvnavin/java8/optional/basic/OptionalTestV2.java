package gvnavin.java8.optional.basic;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalTestV2 {

    public static void main(String[] args) {
        OptionalTestV2 optionalTest = new OptionalTestV2();
        String nullString = optionalTest.getNullString();

        if (nullString != null) {
            System.out.println(nullString.toString());
        } else {
            System.out.println("nullString is null, man that check was a lot of work");
        }
    }

    public String getNullString() {
        return (null);
    }

    public Optional<String> getOptionalNullString() {
        return (null);
    }

}
