package gvnavin.java.enum_constants;

/**
 * Created by gnavin on 6/13/16.
 */
public enum Modes {
    //i didn't like it
    MODE_1("Mode1"),
    MODE_2("Mode2"),
    MODE_3("Mode3");
    
    private final String name;
    
    private Modes(final String s) {
        name = s;
    }
    
}
