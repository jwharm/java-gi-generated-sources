package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link OptionArg} enum values determine which type of extra argument the
 * options expect to find. If an option expects an extra argument, it can
 * be specified in several ways; with a short option: {@code -x arg}, with a long
 * option: {@code --name arg} or combined in a single argument: {@code --name=arg}.
 */
public enum OptionArg implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No extra argument. This is useful for simple flags or booleans.
     */
    NONE(0),
    
    /**
     * The option takes a UTF-8 string argument.
     */
    STRING(1),
    
    /**
     * The option takes an integer argument.
     */
    INT(2),
    
    /**
     * The option provides a callback (of type
     *     {@link OptionArgFunc}) to parse the extra argument.
     */
    CALLBACK(3),
    
    /**
     * The option takes a filename as argument, which will
     *        be in the GLib filename encoding rather than UTF-8.
     */
    FILENAME(4),
    
    /**
     * The option takes a string argument, multiple
     *     uses of the option are collected into an array of strings.
     */
    STRING_ARRAY(5),
    
    /**
     * The option takes a filename as argument,
     *     multiple uses of the option are collected into an array of strings.
     */
    FILENAME_ARRAY(6),
    
    /**
     * The option takes a double argument. The argument
     *     can be formatted either for the user's locale or for the "C" locale.
     *     Since 2.12
     */
    DOUBLE(7),
    
    /**
     * The option takes a 64-bit integer. Like
     *     {@link OptionArg#INT} but for larger numbers. The number can be in
     *     decimal base, or in hexadecimal (when prefixed with {@code 0x}, for
     *     example, {@code 0xffffffff}). Since 2.12
     */
    INT64(8);
    
    private static final java.lang.String C_TYPE_NAME = "GOptionArg";
    
    private final int value;
    
    /**
     * Create a new OptionArg for the provided value
     * @param numeric value the enum value
     */
    OptionArg(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new OptionArg for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static OptionArg of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> STRING;
            case 2 -> INT;
            case 3 -> CALLBACK;
            case 4 -> FILENAME;
            case 5 -> STRING_ARRAY;
            case 6 -> FILENAME_ARRAY;
            case 7 -> DOUBLE;
            case 8 -> INT64;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
