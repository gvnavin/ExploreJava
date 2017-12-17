package gvnavin.java8.constructor_reference;

/**
 * Created by gnavin on 5/14/16.
 */
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
