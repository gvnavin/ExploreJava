package gvnavin.java8.functional_interface;

/**
 * Created by gnavin on 5/13/16.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(final F from);

    //show error in the functional interface annotation
    //because of adding second method in the functional interface which is not allowed
    //void ramdomMethod(String str);
}
