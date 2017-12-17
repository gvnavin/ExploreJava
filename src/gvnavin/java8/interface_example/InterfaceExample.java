package gvnavin.java8.interface_example;

import static java.lang.Math.sqrt;

/**
 * Created by gnavin on 5/13/16.
 */
public class InterfaceExample {
    public static void main(final String[] args) {
        final Formula formula = new Formula();
        System.out.println(formula.calculate(100));     // 100.0
        System.out.println(formula.squareRoot(16));           // 4.0

    }

    public void testInAccessibleDefaultInterfaceMethods() {
        IFormula formula1 = (a) -> {
            //accessing default method gives compiler error
            //squareRoot( a * 100);
            return Math.sqrt(25);
        };
    }
}
