package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags modifying the way parameters are handled by g_uri_parse_params() and
 * {@link UriParamsIter}.
 * @version 2.66
 */
public class UriParamsFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GUriParamsFlags";
    
    /**
     * No flags set.
     */
    public static final UriParamsFlags NONE = new UriParamsFlags(0);
    
    /**
     * Parameter names are case insensitive.
     */
    public static final UriParamsFlags CASE_INSENSITIVE = new UriParamsFlags(1);
    
    /**
     * Replace {@code +} with space character. Only useful for
     *     URLs on the web, using the {@code https} or {@code http} schemas.
     */
    public static final UriParamsFlags WWW_FORM = new UriParamsFlags(2);
    
    /**
     * See {@link UriFlags#PARSE_RELAXED}.
     */
    public static final UriParamsFlags PARSE_RELAXED = new UriParamsFlags(4);
    
    /**
     * Create a new UriParamsFlags with the provided value
     */
    public UriParamsFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public UriParamsFlags or(UriParamsFlags... masks) {
        int value = this.getValue();
        for (UriParamsFlags arg : masks) {
            value |= arg.getValue();
        }
        return new UriParamsFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static UriParamsFlags combined(UriParamsFlags mask, UriParamsFlags... masks) {
        int value = mask.getValue();
        for (UriParamsFlags arg : masks) {
            value |= arg.getValue();
        }
        return new UriParamsFlags(value);
    }
}
