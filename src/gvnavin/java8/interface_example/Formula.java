package gvnavin.java8.interface_example;

/**
 * Created by gnavin on 5/13/16.
 */
public class Formula implements IFormula {
    
    @Override
    public double calculate(final int a) {
        return squareRoot(a * 100);
    }
    
}
