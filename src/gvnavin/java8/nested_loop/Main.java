package gvnavin.java8.nested_loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
    
    
    public static void main(String[] args) {
        
        List<String> topics = new ArrayList<String>() {{
            add("topic_1");
            add("topic_2");
        }};
    
        List<String> levels = new ArrayList<String>() {{
            add("level_1");
            add("level_2");
        }};
    
        final List<String> list = topics
            .stream()
            .flatMap(
                topic -> levels
                    .stream()
                    .map(level -> topic + '_' + level)
            )
            .collect(Collectors.toList());
    
        System.out.println("list = " + list);
    }
}
