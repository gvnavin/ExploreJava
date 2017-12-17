package gvnavin.java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gnavin on 7/4/16.
 */
public class MatchAnyAllNoneDemo {
    
    public static void main(final String[] args) {
        
        final List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        
        boolean matchedResult = memberNames.stream()
                                           .anyMatch((s) -> s.startsWith("A"));
        
        System.out.println(matchedResult);
        
        matchedResult = memberNames.stream()
                                   .allMatch((s) -> s.startsWith("A"));
        
        System.out.println(matchedResult);
        
        matchedResult = memberNames.stream()
                                   .noneMatch((s) -> s.startsWith("A"));
        
        System.out.println(matchedResult);
    }
}
