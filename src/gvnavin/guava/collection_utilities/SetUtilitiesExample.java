package gvnavin.guava.collection_utilities;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class SetUtilitiesExample {
    public static void main(final String[] args) {
        
        final Set<String> approx100Set = Sets.newHashSetWithExpectedSize(100);
        System.out.println("approx100Set.size() = " + approx100Set.size());
        
        final Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
        final Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
        
        final Sets.SetView<String> intersection = Sets
            .intersection(primes, wordsWithPrimeLength); // contains "two", "three", "seven"
        // I can use intersection as a Set directly, but copying it can be more efficient if I use it a lot.
        final ImmutableSet<String> strings = intersection.immutableCopy();
        print(strings, "intersection");
        
        final Sets.SetView<String> union = Sets.union(primes, wordsWithPrimeLength);
        print(union, "union");
        
        final Sets.SetView<String> difference = Sets.difference(primes, wordsWithPrimeLength);
        print(difference, "difference");
        
        final Sets.SetView<String> difference2 = Sets.difference(wordsWithPrimeLength, primes);
        print(difference2, "difference");
        
        final Sets.SetView<String> symmetricDifference = Sets.symmetricDifference(primes, wordsWithPrimeLength);
        print(symmetricDifference, "symmetricDifference");
        
        final ImmutableSet<String> immutableSet1 = ImmutableSet.of("1", "2");
        final ImmutableSet<String> immutableSet2 = ImmutableSet.of("a", "b");
        final Set<List<String>> lists = Sets.cartesianProduct(immutableSet1, immutableSet2);
        for (final List<String> list : lists) {
            print(list, "cartesianProduct");
        }
        
        final Set<Set<String>> sets = Sets.powerSet(immutableSet1);
        for (final Set<String> set : sets) {
            print(set, "powerSet");
        }
    }
    
    private static void print(final Collection<String> strings, final String str) {
        System.out.println("SetUtilities.print : " + str);
        for (final String string : strings) {
            System.out.println("string = " + string);
        }
    }
}
