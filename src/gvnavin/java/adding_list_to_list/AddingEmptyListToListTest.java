package gvnavin.java.adding_list_to_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class AddingEmptyListToListTest {
    
    public static void main(final String[] args) {
        // write your code here
        final List<String> list = new ArrayList<>();
        list.add("navin_1");
        list.addAll(Collections.emptyList());
        list.addAll(Collections.emptyList());
        list.add("navin_2");
        
        for (final String s : list) {
            System.out.println("s = " + s);
        }
        
        final BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);
    }
}
