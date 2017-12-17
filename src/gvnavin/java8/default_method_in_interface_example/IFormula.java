package gvnavin.java8.default_method_in_interface_example;

/**
 * Created by gnavin on 5/13/16.
 */
public interface IFormula {
    double calculate(final int a);

    default double squareRoot(final int a) {
        return Math.sqrt(a);
    }
}
