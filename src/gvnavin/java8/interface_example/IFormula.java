package gvnavin.java8.interface_example;

/**
 * Created by gnavin on 5/13/16.
 */
public interface IFormula {
    double calculate(final int a);

    default double squareRoot(final int a) {
        return Math.sqrt(a);
    }
}
