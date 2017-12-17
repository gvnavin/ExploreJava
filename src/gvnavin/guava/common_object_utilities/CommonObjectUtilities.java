package gvnavin.guava.common_object_utilities;

import com.google.common.base.Objects;

import java.util.Comparator;

public class CommonObjectUtilities {
    public static void main(String[] args) {
        
        System.out.println("Objects.equal(a,a) : " + Objects.equal("a", "a")); // returns true
        System.out.println("Objects.equal(a,b) : " + Objects.equal("a", "b")); // returns false
        System.out.println("Objects.equal(null, a) : " + Objects.equal(null, "a")); // returns false
        System.out.println("Objects.equal(a, null) : " + Objects.equal("a", null)); // returns false
        System.out.println("Objects.equal(null, null) : " + Objects.equal(null, null)); // returns true
        
        System.out.println("java.util.Objects.equals(a,a) : " + java.util.Objects.equals("a", "a")); // returns true
        System.out.println("java.util.Objects.equals(a,b) : " + java.util.Objects.equals("a", "b")); // returns false
        System.out.println("java.util.Objects.equals(null,a) : " + java.util.Objects.equals(null, "a")); // returns
        // false
        System.out.println("java.util.Objects.equals(a,null) : " + java.util.Objects.equals("a", null)); // returns
        // false
        System.out.println("java.util.Objects.equals(null, null) : " + java.util.Objects.equals(null, null)); //
        // returns true
        
        System.out.println("java.util.Objects.isNull(notnull) : " + java.util.Objects.isNull("notnull"));
        System.out.println("java.util.Objects.isNull(null) : " + java.util.Objects.isNull(null));
        
        System.out.println("java.util.Objects.nonNull(notnull) : " + java.util.Objects.nonNull("notnull"));
        System.out.println("java.util.Objects.nonNull(null) : " + java.util.Objects.nonNull(null));
        
        System.out.println("Objects.hashCode(hashcode) : " + Objects.hashCode("hashcode"));
        System.out.println("Objects.hashCode(hashcode1, hashcode2, hashcode3) : " + Objects
            .hashCode("hashcode1", "hashcode2", "hashcode3"));
        
        System.out.println("java.util.Objects.hashCode(hashcode) = " + java.util.Objects.hashCode("hashcode"));
        System.out
            .println("java.util.Objects.hash(hashcode1, hashcode2, hashcode3) = " + java.util.Objects.hash("hashcode1",
                "hashcode2", "hashcode3"));
        
        System.out.println("java.util.Objects.toString(null) : " + java.util.Objects.toString(null));
        System.out.println("java.util.Objects.toString(nonNull) : " + java.util.Objects.toString("nonNull"));
        
        System.out.println("java.util.Objects.toString(null, defaultValue) : " +
            java.util.Objects.toString(null, "defaultValue"));
        System.out.println("java.util.Objects.toString(nonNull, defaultValue) : " +
            java.util.Objects.toString("nonNull", "defaultValue"));
        
        System.out.println("java.util.Objects.compare(String1, String2, (s1, s2) -> s1.compareTo(s2)) : " +
            java.util.Objects.compare("String1", "String2", (s1, s2) -> s1.compareTo(s2))
        );
        
        System.out.println("java.util.Objects.compare(String1, String2, Comparator.naturalOrder()) : " +
            java.util.Objects.compare("String1", "String2", Comparator.naturalOrder())
        );
        
        System.out.println("java.util.Objects.equals(new String[] {str}, new String[] {str}) : " +
            java.util.Objects.equals(new String[] { "str" }, new String[] { "str" })
        );
    
        System.out.println("java.util.Objects.deepEquals(new String[] {str}, new String[] {str}) : " +
            java.util.Objects.deepEquals(new String[] { "str" }, new String[] { "str" })
        );
    
        System.out.println("java.util.Objects.deepEquals(new String[] {str1}, new String[] {str2}) : " +
            java.util.Objects.deepEquals(new String[] { "str1" }, new String[] { "str2" })
        );
    }
}
