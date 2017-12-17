package gvnavin.guava.comparison_chain;

public class PersonClassUsingNormalCompareTo implements Comparable<PersonClassUsingNormalCompareTo> {
    private String lastName;
    private String firstName;
    private int zipCode;
    
    public int compareTo(PersonClassUsingNormalCompareTo other) {
        int cmp = lastName.compareTo(other.lastName);
        if (cmp != 0) {
            return cmp;
        }
        cmp = firstName.compareTo(other.firstName);
        if (cmp != 0) {
            return cmp;
        }
        return Integer.compare(zipCode, other.zipCode);
    }
}
