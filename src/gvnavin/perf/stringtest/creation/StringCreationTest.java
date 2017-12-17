package gvnavin.perf.stringtest.creation;

/**
 * This class shows the time taken for creation of String literals and String objects.
 * Code from http://www.precisejava.com/javaperf/j2se/StringAndStringBuffer.htm
 */
public class StringCreationTest {
    public static void main(String[] args) {
        // create String literals
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for creation of String literals : " + (endTime - startTime) + " milli seconds");
        
        // create String objects using 'new' keyword
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for creation of String objects : " + (endTime1 - startTime1) + " milli seconds");
    
        testComparison();
    }
    
    public static void testComparison() {
        String literal1 = "hello";
        String literal2 = "hello";
    
        //return true since both the objects points to same string literal
        System.out.println("literal1 == literal2 : " + (literal1 == literal2));
        
        System.out.println("literal1.equals(literal2) : " + literal1.equals(literal2));
        
        String object1 = new String("hello");
        String object2 = new String("hello");
        
        //it will return false since they are 2 different objects
        System.out.println("object1 == object2 : " + (object1 == object2));
        
        System.out.println("object1.equals(object2) : " + object1.equals(object2));
    }
}