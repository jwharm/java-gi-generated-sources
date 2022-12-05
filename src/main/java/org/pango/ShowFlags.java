package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These flags affect how Pango treats characters that are normally
 * not visible in the output.
 * @version 1.44
 */
public class ShowFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "PangoShowFlags";
    
    /**
     * No special treatment for invisible characters
     */
    public static final ShowFlags NONE = new ShowFlags(0);
    
    /**
     * Render spaces, tabs and newlines visibly
     */
    public static final ShowFlags SPACES = new ShowFlags(1);
    
    /**
     * Render line breaks visibly
     */
    public static final ShowFlags LINE_BREAKS = new ShowFlags(2);
    
    /**
     * Render default-ignorable Unicode
     *   characters visibly
     */
    public static final ShowFlags IGNORABLES = new ShowFlags(4);
    
    public ShowFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ShowFlags or(ShowFlags mask) {
        return new ShowFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ShowFlags combined(ShowFlags mask, ShowFlags... masks) {
        int value = mask.getValue();        for (ShowFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShowFlags(value);
    }
}
