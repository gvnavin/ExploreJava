package gvnavin.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 7/4/16.
 */
public class FilterCollectToListDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //Eliminate empty string
        System.out.println("Java 7");
        List<String> filtered = deleteEmptyStringsUsingJava7(strings);
        System.out.println("Filtered List: " + filtered);
        
        System.out.println("Java 8");
        filtered = strings.stream()
            .filter(string -> !string.isEmpty())
            .collect(Collectors.toList());
        
        System.out.println("Filtered List: " + filtered);
    }
    
    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();
        
        for (String string : strings) {
            
            if (!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }
}
