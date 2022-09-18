package org.gtk.glib;

/**
 * The {@link org.gtk.glib.OptionArg} enum values determine which type of extra argument the
 * options expect to find. If an option expects an extra argument, it can
 * be specified in several ways; with a short option: <code>-x arg</code>, with a long
 * option: <code>--name arg</code> or combined in a single argument: <code>--name=arg</code>.
 */
public enum OptionArg {

    /**
     * No extra argument. This is useful for simple flags.
     */
    NONE,
    
    /**
     * The option takes a UTF-8 string argument.
     */
    STRING,
    
    /**
     * The option takes an integer argument.
     */
    INT,
    
    /**
     * The option provides a callback (of type
     *     {@link org.gtk.glib.OptionArgFunc}  to parse the extra argument.
     */
    CALLBACK,
    
    /**
     * The option takes a filename as argument, which will
     *        be in the GLib filename encoding rather than UTF-8.
     */
    FILENAME,
    
    /**
     * The option takes a string argument, multiple
     *     uses of the option are collected into an array of strings.
     */
    STRING_ARRAY,
    
    /**
     * The option takes a filename as argument,
     *     multiple uses of the option are collected into an array of strings.
     */
    FILENAME_ARRAY,
    
    /**
     * The option takes a double argument. The argument
     *     can be formatted either for the user&<code>#39</code> s locale or for the &<code>#34</code> C&<code>#34</code>  locale.
     *     Since 2.12
     */
    DOUBLE,
    
    /**
     * The option takes a 64-bit integer. Like
     *     {@link org.gtk.glib.OptionArg<code>#INT</code>  but for larger numbers. The number can be in
     *     decimal base, or in hexadecimal (when prefixed with <code>0x</code>, for
     *     example, <code>0xffffffff</code>). Since 2.12
     */
    INT64;
    
    public static OptionArg fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> STRING;
            case 2 -> INT;
            case 3 -> CALLBACK;
            case 4 -> FILENAME;
            case 5 -> STRING_ARRAY;
            case 6 -> FILENAME_ARRAY;
            case 7 -> DOUBLE;
            case 8 -> INT64;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case STRING -> 1;
            case INT -> 2;
            case CALLBACK -> 3;
            case FILENAME -> 4;
            case STRING_ARRAY -> 5;
            case FILENAME_ARRAY -> 6;
            case DOUBLE -> 7;
            case INT64 -> 8;
        };
    }

}
