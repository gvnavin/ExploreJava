package gvnavin.guava.common_object_utilities;

import com.google.common.base.MoreObjects;

public class MoreObjectsExample {
    public static void main(String[] args) {
        System.out.println("MoreObjects.firstNonNull(string0, string1) : " + MoreObjects.firstNonNull("string0",
            "string1"));
        System.out.println("MoreObjects.firstNonNull(string0, null) : " + MoreObjects.firstNonNull("string0",
            null));
        System.out.println("MoreObjects.firstNonNull(null, string1) : " + MoreObjects.firstNonNull(null, "string1"));
    
        //java.lang.NullPointerException
        //System.out.println("MoreObjects.firstNonNull(null, null) : " + MoreObjects.firstNonNull(null, null));
    
        final MoreObjectsExample moreObjectsExample = new MoreObjectsExample();
        moreObjectsExample.test();
    }
    
    public void test() {
        // Returns "ClassName{}"
        final String s1 = MoreObjects.toStringHelper(String.class)
            .toString();
        System.out.println("s1 = " + s1);
        
        // Returns "ClassName{x=1}"
        final String s2 = MoreObjects.toStringHelper(this)
            .add("x", 1)
            .toString();
        System.out.println("s2 = " + s2);
        
        // Returns "MyObject{x=1}"
        final String s3 = MoreObjects.toStringHelper("MyObject")
            .add("x", 1)
            .toString();
        System.out.println("s3 = " + s3);
    
        // Returns "ClassName{x=1, y=foo}"
        final String s4 = MoreObjects.toStringHelper(this)
            .add("x", 1)
            .add("y", "foo")
            .toString();
        System.out.println("s4 = " + s4);
        
        // Returns "ClassName{x=1}"
        final String s5 = MoreObjects.toStringHelper(this)
            .omitNullValues()
            .add("x", 1)
            .add("y", null)
            .toString();
        System.out.println("s5 = " + s5);
    }
}
