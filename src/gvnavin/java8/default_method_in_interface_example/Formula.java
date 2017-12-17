package gvnavin.java8.default_method_in_interface_example;

/**
 * Created by gnavin on 5/13/16.
 */
public class Formula implements IFormula {
    
    @Override
    public double calculate(final int a) {
        return squareRoot(a * 100);
    }
    
}
