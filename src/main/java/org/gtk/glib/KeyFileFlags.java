package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags which influence the parsing.
 */
public class KeyFileFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GKeyFileFlags";
    
    /**
     * No flags, default behaviour
     */
    public static final KeyFileFlags NONE = new KeyFileFlags(0);
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise all comments will be lost when the key file is
     *   written back.
     */
    public static final KeyFileFlags KEEP_COMMENTS = new KeyFileFlags(1);
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise only the translations for the current language will be
     *   written back.
     */
    public static final KeyFileFlags KEEP_TRANSLATIONS = new KeyFileFlags(2);
    
    /**
     * Create a new KeyFileFlags with the provided value
     */
    public KeyFileFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public KeyFileFlags or(KeyFileFlags... masks) {
        int value = this.getValue();
        for (KeyFileFlags arg : masks) {
            value |= arg.getValue();
        }
        return new KeyFileFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static KeyFileFlags combined(KeyFileFlags mask, KeyFileFlags... masks) {
        int value = mask.getValue();
        for (KeyFileFlags arg : masks) {
            value |= arg.getValue();
        }
        return new KeyFileFlags(value);
    }
}
