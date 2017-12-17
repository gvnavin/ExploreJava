package gvnavin.guava.optional;

import com.google.common.base.Optional;

public class OptionalExample {
    
    public static void main(String[] args) {
        System.out.println("Optional.absent() = " + Optional.absent());
        
        System.out.println("optional = " + java.util.Optional.empty());
        
        final java.util.Optional<String> stringOptional = java.util.Optional.of("String");
        System.out.println("stringOptional = " + stringOptional);
        System.out.println("stringOptional.isPresent() = " + stringOptional.isPresent());
        System.out.println("stringOptional.get() = " + stringOptional.get());
        System.out.println("stringOptional.orElse(other) = " + stringOptional.orElse("other"));
    
        final Optional<Integer> fromNullable = Optional.fromNullable(5);
        System.out.println("fromNullable = " + fromNullable);
        System.out.println("fromNullable.isPresent() = " + fromNullable.isPresent());
        System.out.println("fromNullable.get() = " + fromNullable.get());
        System.out.println("fromNullable.or(10) = " + fromNullable.or(10));
        System.out.println("fromNullable.orNull() = " + fromNullable.orNull());
    
        final java.util.Optional<String> nullOptional = java.util.Optional.ofNullable(null);
        System.out.println("nullOptional = " + nullOptional);
        System.out.println("nullOptional.isPresent() = " + nullOptional.isPresent());
        System.out.println("nullOptional.orElse(other) = " + nullOptional.orElse("other"));
    
        final Optional<Integer> fromNullableNull = Optional.fromNullable(null);
        System.out.println("fromNullable = " + fromNullableNull);
        System.out.println("fromNullableNull.isPresent() = " + fromNullableNull.isPresent());
        System.out.println("fromNullableNull.or(10) = " + fromNullableNull.or(10));
        System.out.println("fromNullableNull.orNull() = " + fromNullableNull.orNull());
        
    }
    
    
}
