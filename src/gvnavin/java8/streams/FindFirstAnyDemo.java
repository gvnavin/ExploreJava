package gvnavin.java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gnavin on 7/4/16.
 */
public class FindFirstAnyDemo {
    public static void main(String[] args) {
        
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        
        String firstMatchedName = memberNames.stream()
            .filter((s) -> s.startsWith("L"))
            .findFirst()
            .get();
        
        System.out.println("firstMatchedName = " + firstMatchedName);
        
        String anyMatchedName = memberNames.stream()
            .filter((s) -> s.startsWith("S"))
            .findAny()
            .get();
        
        System.out.println("anyMatchedName = " + anyMatchedName);

        String present = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .findFirst()
                .orElse(null);


        System.out.println("present = " + present);

        String notPresent = memberNames.stream()
                .filter((s) -> s.startsWith("x"))
                .findFirst()
                .orElse(null);

        System.out.println("notPresent = " + notPresent);

        boolean presentTrue = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .map((x) -> Boolean.TRUE)
                .findFirst()
                .orElse(Boolean.FALSE);


        System.out.println("presentTrue = " + presentTrue);

        boolean notPresentFalse = memberNames.stream()
                .filter((s) -> s.startsWith("x"))
                .map((x) -> Boolean.TRUE)
                .findFirst()
                .orElse(Boolean.FALSE);

        System.out.println("notPresentFalse = " + notPresentFalse);

    }
}
