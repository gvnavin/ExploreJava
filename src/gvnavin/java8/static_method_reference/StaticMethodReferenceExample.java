package gvnavin.java8.static_method_reference;

import gvnavin.java8.functional_interface.Converter;

/**
 * Created by gnavin on 5/13/16.
 */
public class StaticMethodReferenceExample {
    
    public static void main(final String[] args) {
        final Converter<String, Integer> converterStandard = new Converter<String, Integer>() {
            @Override
            public Integer convert(final String stringInput) {
                return Integer.valueOf(stringInput);
            }
        };
        System.out.println(converterStandard.convert("123"));    // 123
        
        final Converter<String, Integer> converterLamba1 = (String stringInput) -> {
            return Integer.valueOf(stringInput);
        };
        System.out.println(converterLamba1.convert("123"));    // 123
        
        final Converter<String, Integer> converterLamba2 = (stringInput) -> Integer.valueOf(stringInput);
        System.out.println(converterLamba2.convert("123"));    // 123
        
        //passing static method reference  by using ::"
        final Converter<String, Integer> byMethodReference = Integer::valueOf;
        final Integer converted = byMethodReference.convert("123");
        System.out.println(converted);    // 123
    }
}
