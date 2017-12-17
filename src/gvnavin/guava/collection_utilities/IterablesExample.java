package gvnavin.guava.collection_utilities;

import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;

public class IterablesExample {
    public static void main(final String[] args) {
        final Iterable<Integer> concatenated = Iterables.concat(
            Ints.asList(1, 2, 3),
            Ints.asList(4, 5, 6));
        // concatenated has elements 1, 2, 3, 4, 5, 6
        
        for (final Integer integer : concatenated) {
            System.out.println("integer = " + integer);
        }
        
        //String lastAdded = Iterables.getLast(concatenated);
        
        //String theElement = Iterables.getOnlyElement(thisSetIsDefinitelyASingleton);
    }
}
