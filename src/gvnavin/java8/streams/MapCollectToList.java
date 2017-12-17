package gvnavin.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 7/4/16.
 */
public class MapCollectToList {
    
    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        
        final List<Integer> distinctNumbers = numbers
            .stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("java 8 : Squares List: " + distinctNumbers);
        
        final List<Integer> noDistinctSquaresList = numbers.stream()
                                                           .map(i -> i * i)
                                                           .collect(Collectors.toList());
        System.out.println("java 8 : Squares List: " + noDistinctSquaresList);
        
        final List<String> noDistinctSquaresList2 = numbers.stream()
                                                           .map(i -> "String i:" + i)
                                                           .collect(Collectors.toList());
        System.out.println("java 8 : Squares List: " + noDistinctSquaresList);
        
        final List<Integer> distinctSquaresList = numbers.stream()
                                                         .map(i -> i * i)
                                                         .distinct()
                                                         .collect(Collectors.toList());
        System.out.println("java 8 : Squares List: " + distinctSquaresList);
        
        // Convert String to Uppercase and join them using coma
        final List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        final String G7Countries = G7.stream()
                                     .map(x -> x.toUpperCase())
                                     .collect(Collectors.joining(", "));
        
        System.out.println(G7Countries);
        
    }
    
    public static void java7() {
        //get list of square of distinct numbers
        final List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        final List<Integer> squaresList = getSquares(numbers);
        System.out.println("java 7 : squaresList = " + squaresList);
    }
    
    private static List<Integer> getSquares(final List<Integer> numbers) {
        final List<Integer> squaresList = new ArrayList<>();
        
        for (final Integer number : numbers) {
            final Integer square = new Integer(number.intValue() * number.intValue());
            
            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }
}
