package gvnavin.guava.preconditions;

import com.google.common.base.Preconditions;

import java.util.Objects;

public class PreconditionsExamples {
    public static void main(final String[] args) {
        
        Preconditions.checkArgument(1 < 2);
        Preconditions.checkArgument(1 < 2, " 1 < 2");
        Preconditions.checkArgument(1 < 2, " 1 < 2 actual arguments was %s %s", 1, 2);
        
        System.out.println("Preconditions.checkNotNull(notnull) : " + Preconditions.checkNotNull("notnull"));
        
        System.out.println("Preconditions.checkNotNull(notnull, obj should not be null) : " +
            Preconditions.checkNotNull("notnull", "obj should not be null")
        );
        
        //java.lang.NullPointerException
        //System.out.println("Objects.requireNonNull(null) = " + Objects.requireNonNull(null));
        
        //java.lang.NullPointerException: Object should not be null
        /*
        System.out.println("Objects.requireNonNull(null, Objects Should not be null) = " +
            Objects.requireNonNull(null, "Object should not be null")
        );
        */
        
        System.out.println("Objects.requireNonNull(nonNull) = " + Objects.requireNonNull("nonNull"));
        
        System.out.println("Objects.isNull(notnull) : " + Objects.isNull("notnull"));
        System.out.println("Objects.isNull(null) : " + Objects.isNull(null));
        
        System.out.println("Objects.nonNull(notnull) : " + Objects.nonNull("notnull"));
        System.out.println("Objects.nonNull(null) : " + Objects.nonNull(null));
        
        final String checkedString = Preconditions.checkNotNull("notnull", "obj %s should not be null", "notnull");
        System.out.println("checkedString = " + checkedString);
        
        Preconditions.checkState(1 < 2);
        
        //java.lang.IndexOutOfBoundsException: index (-1) must not be negative
        //Preconditions.checkElementIndex(-1, 3);
        
        System.out.println("Preconditions.checkElementIndex(0, 3) : "
            + Preconditions.checkElementIndex(0, 3)
        );
        
        Preconditions.checkElementIndex(1, 3);
        Preconditions.checkElementIndex(2, 3);
        
        //java.lang.IndexOutOfBoundsException: index (3) must be less than size (3)
        //Preconditions.checkElementIndex(3, 3);
        
        //java.lang.IndexOutOfBoundsException: index (-1) must not be negative
        //Preconditions.checkPositionIndex(-1, 3);
        
        System.out.println("Preconditions.checkPositionIndex(0, 3) : " +
            Preconditions.checkPositionIndex(0, 3)
        );
        
        Preconditions.checkPositionIndex(1, 3);
        Preconditions.checkPositionIndex(2, 3);
        Preconditions.checkPositionIndex(3, 3);
        
        Preconditions.checkPositionIndexes(0, 3, 3);
        
        //java.lang.IndexOutOfBoundsException: end index (4) must not be greater than size (3)
        //Preconditions.checkPositionIndexes(0, 4, 3);
    }
}
