package gvnavin.java8.optional.basic;

import java.util.Optional;

/**
 * Created by gnavin on 7/1/16.
 */
public class OptionalTestV5 {
    
    public static void main(final String[] args) {
        final OptionalTestV5 optionalTest = new OptionalTestV5();
        try {
            final Optional<String> optionalString = Optional.ofNullable(optionalTest.getNullString());
            if (optionalString.isPresent()) {
                System.out.println(optionalString.get().toString());
            }
        } catch (final NullPointerException x) {
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
