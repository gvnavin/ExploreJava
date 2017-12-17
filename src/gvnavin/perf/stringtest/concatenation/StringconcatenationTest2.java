package gvnavin.perf.stringtest.concatenation;

/**
 * StringBuffer.append() is much more faster than String
 * When you create StringBuffer with default constructor StringBuffer() without setting initial length,
 * then the StringBuffer is initialized with 16 characters
 */
public class StringconcatenationTest2 {
    public static void main(final String[] args) {
        //Test the String Concatenation using + operator
        final long startTime = System.currentTimeMillis();
        String result = "hello";
        for (int i = 0; i < 1500; i++) {
            result += "hello";
        }
        
        final long endTime = System.currentTimeMillis();
        System.out.println(
            "Time taken for string concatenation using + operator : " + (endTime - startTime) + " milli seconds");
        
        //Test the String Concatenation using StringBuffer
        final long startTime1 = System.currentTimeMillis();
        //StringBuffer is initialized with 16 characters
        final StringBuffer result1 = new StringBuffer("hello");
        for (int i = 0; i < 1500; i++) {
            result1.append("hello");
        }
        final long endTime1 = System.currentTimeMillis();
        System.out.println(
            "Time taken for string concatenation using StringBuffer :  " + (endTime1 - startTime1) + " milli seconds");
    }
}
