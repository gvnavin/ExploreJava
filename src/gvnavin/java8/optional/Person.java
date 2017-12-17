package gvnavin.java8.optional;

import java.util.Optional;

/**
 * Created by gnavin on 7/2/16.
 */
public class Person {
    private final Optional<Address> address;
    
    public Person(final Optional<Address> address) {
        this.address = address;
    }
    
    public Optional<Address> getAddressReturnOptional() {
        return address;
    }
    
    public Address getAddressReturnAddress() {
        return address.get();
    }
    
}
