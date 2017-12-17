package gvnavin.java.enum_enum_param;

/**
 * Created by gnavin on 6/13/16.
 */
public enum Modes {
    //i didn't like it
    MODE_1 (),
    MODE_2 (MODE_1),
    MODE_3 ();

    private final Modes name;

    private Modes(Modes mode) {
        name = mode;
    }

    private Modes() {
        name = null;
    }
}
