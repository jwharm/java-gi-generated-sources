package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags describing what parts of the URI to hide in
 * g_uri_to_string_partial(). Note that {@link UriHideFlags#PASSWORD} and
 * {@link UriHideFlags#AUTH_PARAMS} will only work if the {@link Uri} was parsed with
 * the corresponding flags.
 * @version 2.66
 */
public class UriHideFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GUriHideFlags";
    
    /**
     * No flags set.
     */
    public static final UriHideFlags NONE = new UriHideFlags(0);
    
    /**
     * Hide the userinfo.
     */
    public static final UriHideFlags USERINFO = new UriHideFlags(1);
    
    /**
     * Hide the password.
     */
    public static final UriHideFlags PASSWORD = new UriHideFlags(2);
    
    /**
     * Hide the auth_params.
     */
    public static final UriHideFlags AUTH_PARAMS = new UriHideFlags(4);
    
    /**
     * Hide the query.
     */
    public static final UriHideFlags QUERY = new UriHideFlags(8);
    
    /**
     * Hide the fragment.
     */
    public static final UriHideFlags FRAGMENT = new UriHideFlags(16);
    
    public UriHideFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public UriHideFlags or(UriHideFlags mask) {
        return new UriHideFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static UriHideFlags combined(UriHideFlags mask, UriHideFlags... masks) {
        int value = mask.getValue();        for (UriHideFlags arg : masks) {
            value |= arg.getValue();
        }
        return new UriHideFlags(value);
    }
}
