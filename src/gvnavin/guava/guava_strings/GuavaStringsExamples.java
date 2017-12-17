package gvnavin.guava.guava_strings;

import com.google.common.base.Strings;

public class GuavaStringsExamples {
    public static void main(String[] args) {
        System.out.println("Strings.commonPrefix(abcHello, abcdHello) = " + Strings.commonPrefix("abcHello", "abcdHello"));
        System.out.println("Strings.commonSuffix(abcHello, abcdHello) = " + Strings.commonSuffix("abcHello", "abcdHello"));
    
        System.out.println("Strings.emptyToNull(Hello) = " + Strings.emptyToNull("Hello"));
        System.out.println("Strings.emptyToNull() = " + Strings.emptyToNull(""));
        System.out.println("Strings.emptyToNull(null) = " + Strings.emptyToNull(null));
    
        System.out.println("Strings.isNullOrEmpty(Hello) = " + Strings.isNullOrEmpty("Hello"));
        System.out.println("Strings.isNullOrEmpty() = " + Strings.isNullOrEmpty(""));
        System.out.println("Strings.isNullOrEmpty(null) = " + Strings.isNullOrEmpty(null));
    
        System.out.println("Strings.nullToEmpty(Hello) = " + Strings.nullToEmpty("Hello"));
        System.out.println("Strings.nullToEmpty() = " + Strings.nullToEmpty(""));
        System.out.println("Strings.nullToEmpty(null) = " + Strings.nullToEmpty(null));
    
        System.out.println("Strings.padEnd(Hello, 4., 0) = " + Strings.padEnd("4.", 7, '0'));
        System.out.println("Strings.padEnd(Hello, 7, 0) = " + Strings.padEnd("Hello", 7, '0'));
        System.out.println("Strings.padEnd(Hello, 5, 0) = " + Strings.padEnd("Hello", 5, '0'));
        System.out.println("Strings.padEnd(Hello, 4, 0) = " + Strings.padEnd("Hello", 4, '0'));
    
        System.out.println("Strings.padStart(7, 3, 0) = " + Strings.padStart("7", 3, '0'));
        System.out.println("Strings.padStart(Hello, 7, 0) = " + Strings.padStart("Hello", 7, '0'));
        System.out.println("Strings.padStart(Hello, 5, 0) = " + Strings.padStart("Hello", 5, '0'));
        System.out.println("Strings.padStart(Hello, 4, 0) = " + Strings.padStart("Hello", 4, '0'));
    
        System.out.println("Strings.repeat(hello, 3) = " + Strings.repeat("hello", 3));
    }
}
