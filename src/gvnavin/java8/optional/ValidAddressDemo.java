package gvnavin.java8.optional;

import java.time.Instant;
import java.util.Optional;

import static java.time.Instant.now;

/**
 * Created by gnavin on 7/2/16.
 */
public class ValidAddressDemo {
    
    private static boolean isValidAddressV1(final Person person) {
        if (person != null) {
            if (person.getAddressReturnAddress() != null) {
                final Instant validFrom = person.getAddressReturnAddress().getValidFromReturnInstant();
                return validFrom != null && validFrom.isBefore(now());
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    private static boolean isValidAddressV2(final Person person) {
        return person != null &&
            person.getAddressReturnAddress() != null &&
            person.getAddressReturnAddress().getValidFromReturnInstant() != null &&
            person.getAddressReturnAddress().getValidFromReturnInstant().isBefore(now());
    }
    
    private static boolean isValidAddressUsingOptional(final Optional<Person> person) {
        return person.flatMap(Person::getAddressReturnOptional)
                     .flatMap(Address::getValidFromReturnOptionalInstant)
                     .filter(x -> x.isBefore(now()))
                     .isPresent();
    }
    
}
