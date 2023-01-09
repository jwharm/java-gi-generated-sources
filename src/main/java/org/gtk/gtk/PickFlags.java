package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that influence the behavior of {@code Widget#pick}.
 */
public class PickFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPickFlags";
    
    /**
     * The default behavior, include widgets that are receiving events
     */
    public static final PickFlags DEFAULT = new PickFlags(0);
    
    /**
     * Include widgets that are insensitive
     */
    public static final PickFlags INSENSITIVE = new PickFlags(1);
    
    /**
     * Include widgets that are marked as non-targetable. See {@code Widget:can-target}
     */
    public static final PickFlags NON_TARGETABLE = new PickFlags(2);
    
    /**
     * Create a new PickFlags with the provided value
     */
    public PickFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PickFlags or(PickFlags... masks) {
        int value = this.getValue();
        for (PickFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PickFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PickFlags combined(PickFlags mask, PickFlags... masks) {
        int value = mask.getValue();
        for (PickFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PickFlags(value);
    }
}
