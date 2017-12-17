package gvnavin.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gnavin on 7/4/16.
 */
public class FilterCountDemo {

    public static void main(String[] args) {
        getCountLength3();
        getCountEmptyString();
    }

    public static void getCountLength3() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        long count;

        System.out.println("getCountLength3 Using Java 7: ");
        count = getCountLength3UsingJava7(strings);
        System.out.println("getCountLength3 Empty Strings: " + count);

        System.out.println("getCountLength3 Using Java 8: ");
        count = strings.stream()
                       .filter(string -> string.length() == 3)
                       .count();
        System.out.println("getCountLength3 Strings of length 3: " + count);
    }


    public static void getCountEmptyString() {
        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("getCountEmptyString List: " + strings);

        System.out.println("getCountEmptyString Using Java 7: ");
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("getCountEmptyString count = " + count);

        System.out.println("getCountEmptyString Using Java 8: ");
        count = strings.stream().filter(String::isEmpty).count();
        System.out.println("getCountEmptyString Empty Strings: " + count);
    }

    private static int getCountLength3UsingJava7(List<String> strings) {
        int count = 0;

        for (String string : strings) {

            if (string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;

        for (String string : strings) {

            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
