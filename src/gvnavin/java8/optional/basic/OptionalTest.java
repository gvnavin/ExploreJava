package gvnavin.java8.optional.basic;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalTest {

    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        String nullString = optionalTest.getNullString();

        try {
            System.out.println(nullString.toString());
        } catch (NullPointerException x) {
            System.out.println("a NullPointerException!");
        }
    }

    public String getNullString() {
        return (null);
    }

    public Optional<String> getOptionalNullString() {
        return (null);
    }

}
