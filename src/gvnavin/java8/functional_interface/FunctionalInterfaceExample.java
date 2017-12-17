package gvnavin.java8.functional_interface;

/**
 * Created by gnavin on 5/13/16.
 */
public class FunctionalInterfaceExample {
    
    public static void main(final String[] args) {
        
        final Converter<String, Integer> converterStandard = new Converter<String, Integer>() {
            @Override
            public Integer convert(final String stringInput) {
                return Integer.valueOf(stringInput);
            }
        };
        System.out.println(converterStandard.convert("123"));    // 123
        
        final Converter<String, Integer> converterLambda1 = (String stringInput) -> {
            return Integer.valueOf(stringInput);
        };
        System.out.println(converterLambda1.convert("123"));    // 123
        
        final Converter<String, Integer> converterLamba2 = (stringInput) -> Integer.valueOf(stringInput);
        System.out.println(converterLamba2.convert("123"));    // 123
    }
}
