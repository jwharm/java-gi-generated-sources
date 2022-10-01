package org.gtk.glib;

/**
 * The {@link OptionArg} enum values determine which type of extra argument the
 * options expect to find. If an option expects an extra argument, it can
 * be specified in several ways; with a short option: {@code -x arg}, with a long
 * option: {@code --name arg} or combined in a single argument: {@code --name=arg}.
 */
public class OptionArg extends io.github.jwharm.javagi.Enumeration {

    /**
     * No extra argument. This is useful for simple flags.
     */
    public static final OptionArg NONE = new OptionArg(0);
    
    /**
     * The option takes a UTF-8 string argument.
     */
    public static final OptionArg STRING = new OptionArg(1);
    
    /**
     * The option takes an integer argument.
     */
    public static final OptionArg INT = new OptionArg(2);
    
    /**
     * The option provides a callback (of type
     *     {@link OptionArgFunc}) to parse the extra argument.
     */
    public static final OptionArg CALLBACK = new OptionArg(3);
    
    /**
     * The option takes a filename as argument, which will
     *        be in the GLib filename encoding rather than UTF-8.
     */
    public static final OptionArg FILENAME = new OptionArg(4);
    
    /**
     * The option takes a string argument, multiple
     *     uses of the option are collected into an array of strings.
     */
    public static final OptionArg STRING_ARRAY = new OptionArg(5);
    
    /**
     * The option takes a filename as argument,
     *     multiple uses of the option are collected into an array of strings.
     */
    public static final OptionArg FILENAME_ARRAY = new OptionArg(6);
    
    /**
     * The option takes a double argument. The argument
     *     can be formatted either for the user's locale or for the "C" locale.
     *     Since 2.12
     */
    public static final OptionArg DOUBLE = new OptionArg(7);
    
    /**
     * The option takes a 64-bit integer. Like
     *     {@link OptionArg#INT} but for larger numbers. The number can be in
     *     decimal base, or in hexadecimal (when prefixed with {@code 0x}, for
     *     example, {@code 0xffffffff}). Since 2.12
     */
    public static final OptionArg INT64 = new OptionArg(8);
    
    public OptionArg(int value) {
        super(value);
    }
    
}
