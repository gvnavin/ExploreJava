package gvnavin.guava.collection_utilities;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListUtilitiesExample {
    public static void main(final String[] args) {
        final List<String> list1 = new ArrayList<>();
        final List<String> list2 = new ArrayList<>();
        
        //factory method pattern
        final List<String> list3 = Lists.newArrayList();
        final Map<String, String> map1 = Maps.newLinkedHashMap();
        final Map<String, String> map2 = Maps.newHashMap();
        
        final Set<String> copySet = Sets.newHashSet();
        final List<String> elements = Lists.newArrayList("alpha", "beta", "gamma");
        
        final List<String> exactly100 = Lists.newArrayListWithCapacity(100);
        System.out.println("list exactly100.size() = " + exactly100.size());
        
        final List<String> approx100 = Lists.newArrayListWithExpectedSize(100);
        System.out.println("list approx100.size() = " + approx100.size());
        
        final Set<String> approx100Set = Sets.newHashSetWithExpectedSize(100);
        System.out.println("approx100Set.size() = " + approx100Set.size());
        
        //static factory methods
        final Multiset<String> multiset = HashMultiset.create();
        
        final List<Integer> countUp = Ints.asList(1, 2, 3, 4, 5);
        System.out.println("print count up");
        print(countUp);
        
        final List<Integer> countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}
        System.out.println("print count down");
        print(countDown);
        
        final List<List<Integer>> parts = Lists.partition(countUp, 2); // {{1, 2}, {3, 4}, {5}}
        System.out.println("count partition");
        for (final List<Integer> part : parts) {
            print(part);
        }
        
        final List<Integer> transform = Lists.transform(countUp, (t) -> 2 * t);
        System.out.println("transform");
        print(transform);
        
        final CharSequence c = "abd";
        final List<Character> characters = Lists.charactersOf(c);
        
        for (final Character character : characters) {
            System.out.println("character = " + character);
        }
        
        final ImmutableList<Character> hello = Lists.charactersOf("hello");
        for (final Character character : hello) {
            System.out.println("character = " + character);
        }
        
    }
    
    public static void print(final List<Integer> countUp) {
        System.out.println("ListUtilitiesExample.print");
        for (final Integer integer : countUp) {
            System.out.println("integer = " + integer);
        }
    }
    
}
