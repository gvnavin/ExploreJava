package gvnavin.java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NullMapGetToStringDemo {
    public static void main(final String[] args) {
        final Map<String, String> map = new HashMap<>();
        final Optional<Map<String, String>> optionalMap = Optional.ofNullable(map);
        
        //final String random =
        optionalMap.map(x -> {
            System.out.println(x.getClass().toString());
            System.out.println("x.get " + x.get("random"));
            return x.get("random");
        }).map(x -> {
            System.out.print(x);
            return x.toString();
        }).ifPresent(System.out::println);
        
        /*System.out.println("random = " + random);*/
    }
}
