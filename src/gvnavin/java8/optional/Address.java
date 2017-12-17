package gvnavin.java8.optional;

import java.time.Instant;
import java.util.Optional;

/**
 * Created by gnavin on 7/2/16.
 */
public class Address {
    private final Optional<Instant> validFrom;

    public Address(final Optional<Instant> validFrom) {
        this.validFrom = validFrom;
    }

    public Optional<Instant> getValidFromReturnOptionalInstant() {
        return validFrom;
    }

    public Instant getValidFromReturnInstant() {
        return validFrom.get();
    }
}
