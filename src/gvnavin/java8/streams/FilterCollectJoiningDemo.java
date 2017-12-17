package gvnavin.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 7/4/16.
 */
public class FilterCollectJoiningDemo {
    public static void main(final String[] args) {
        
        final List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        
        //Eliminate empty string and join using comma.
        String mergedString = getMergedStringUsingJava7(strings, ", ");
        System.out.println("Merged String: " + mergedString);
        
        mergedString = strings.stream()
                              .filter(string -> !string.isEmpty())
                              .collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }
    
    private static String getMergedStringUsingJava7(final List<String> strings, final String separator) {
        final StringBuilder stringBuilder = new StringBuilder();
        
        for (final String string : strings) {
            
            if (!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        final String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length() - 2);
    }
}
