package gvnavin.java8.object_method_reference;

import gvnavin.java8.functional_interface.Converter;

/**
 * Created by gnavin on 5/13/16.
 */
public class ObjectMethodReferenceExample {
    public static void main(final String[] args) {
        final Something something = new Something();
        
        final Converter<String, String> converter1 = new Converter<String, String>() {
            @Override
            public String convert(final String from) {
                return something.startsWith(from);
            }
        };
        System.out.println(converter1.convert("Java"));
        
        final Converter<String, String> converter2 = (String s) -> {
            return something.startsWith(s);
        };
        System.out.println(converter2.convert("Java"));    // "J"
        
        final Converter<String, String> converter3 = (s) -> {
            return something.startsWith(s);
        };
        System.out.println(converter3.convert("Java"));    // "J"
        
        final Converter<String, String> converter4 = (String s) -> something.startsWith(s);
        System.out.println(converter4.convert("Java"));    // "J"
        
        final Converter<String, String> converter5 = (s) -> something.startsWith(s);
        System.out.println(converter5.convert("Java"));    // "J"
        
        //it is trying to match the method signature
        final Converter<String, String> converter = something::startsWith;
        System.out.println(converter.convert("Java"));      // "J"
    }
}
