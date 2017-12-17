package gvnavin.perf.stringtest.concatenation;

/**
 * This class shows the time taken for creation of String literals and String objects.
 * Code from http://www.precisejava.com/javaperf/j2se/StringAndStringBuffer.htm
 */
public class StringConcatenationTest1 {
    public static void main(final String[] args) {
        //Test the String Concatination
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            final String result =
                "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
        }
        final long endTime = System.currentTimeMillis();
        System.out.println(
            "Time taken for string concatenation using + operator : " + (endTime - startTime) + " milli seconds");
        
        //Test the StringBuffer Concatination
        final long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            final StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        
        final long endTime1 = System.currentTimeMillis();
        System.out.println(
            "Time taken for String concatenation using StringBuffer : " + (endTime1 - startTime1) + " milli seconds");
    }
}