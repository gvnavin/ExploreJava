package gvnavin.java8.lambda_scope;

import gvnavin.java8.functional_interface.Converter;

/**
 * Created by gnavin on 5/14/16.
 */
public class LambdaScopeExample {
    static int outerStaticNum;
    int outerNum;
    
    public static void main(final String[] args) {
    
    }
    
    public static void accessingFinalVariable() {
        final int num = 1;
        final Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));     // 3
    }
    
    public static void accessingNonFinalVariable() {
        //effectively final
        final int num = 1;
        final String x = "abcdefg";
        final Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));     // 3
    }
    
    public static void changingNonFinalVariableReadSCopeOnly() {
        final int num = 1;
        final Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));     // 3
        //num = 3;
    }
    
    public static void testStaticReadWriteScopes() {
        final Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
    
    public void testFieldReadWriteScopes() {
        final Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        
        final Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 67;
            return String.valueOf(from);
        };
    }
}
