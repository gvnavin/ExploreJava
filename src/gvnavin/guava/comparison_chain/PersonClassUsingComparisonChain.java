package gvnavin.guava.comparison_chain;

import com.google.common.collect.ComparisonChain;

//https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained
public class PersonClassUsingComparisonChain implements Comparable<PersonClassUsingComparisonChain> {
    private String lastName;
    private String firstName;
    private int zipCode;
    
    public int compareTo(PersonClassUsingComparisonChain other) {
        return ComparisonChain.start()
            .compare(this.lastName, other.lastName)
            .compare(this.firstName, other.firstName)
            .compare(this.zipCode, other.zipCode)
            .result();
    }
}
