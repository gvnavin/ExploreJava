package gvnavin.java.stringtest.concatenation;

/**
 * Doesn't provide any actual difference
 */
public class StringconcatenationTest3 {
    public static void main(String[] args) {
        //Test the String Concatenation using + operator
        //StringBuffer is initialized with 16 characters
        long startTime = System.currentTimeMillis();
        StringBuffer result = new StringBuffer("hello");
        for (int i = 0; i < 1500; i++) {
            result.append("hello");
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for string concatenation using StringBuffer with out setting size : " + (endTime - startTime) + " milli seconds");
        
        //Test the String Concatenation using StringBuffer
        long startTime1 = System.currentTimeMillis();
        //StringBuffer is initialized with 16 characters
        StringBuffer result1 = new StringBuffer("hello");
        result1.ensureCapacity(250000);
        for (int i = 0; i < 1500; i++) {
            result1.append("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for string concatenation using StringBuffer with setting size :  " + (endTime1 - startTime1) + " milli seconds");
    }
}
