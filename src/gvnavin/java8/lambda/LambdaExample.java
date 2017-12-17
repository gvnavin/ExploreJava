package gvnavin.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gnavin on 5/13/16.
 */
public class LambdaExample {
    
    public static void main(final String[] args) {
        final List<String> names1 = Arrays.asList("peter", "anna", "mike", "xenia");
        
        Collections.sort(names1, new Comparator<String>() {
            @Override
            public int compare(final String a, final String b) {
                return b.compareTo(a);
            }
        });
        System.out.println(Arrays.toString(names1.toArray()));
        
        final List<String> names2 = Arrays.asList("peter", "anna", "mike", "xenia");
        names2.sort((String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println(Arrays.toString(names2.toArray()));
        
        final List<String> names3 = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names3, (String a, String b) -> b.compareTo(a));
        System.out.println(Arrays.toString(names3.toArray()));
        
        final List<String> names4 = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names4, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(names4.toArray()));
    }
    
}
