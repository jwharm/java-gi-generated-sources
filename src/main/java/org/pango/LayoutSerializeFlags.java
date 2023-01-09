package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that influence the behavior of {@link Layout#serialize}.
 * <p>
 * New members may be added to this enumeration over time.
 * @version 1.50
 */
public class LayoutSerializeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutSerializeFlags";
    
    /**
     * Default behavior
     */
    public static final LayoutSerializeFlags DEFAULT = new LayoutSerializeFlags(0);
    
    /**
     * Include context information
     */
    public static final LayoutSerializeFlags CONTEXT = new LayoutSerializeFlags(1);
    
    /**
     * Include information about the formatted output
     */
    public static final LayoutSerializeFlags OUTPUT = new LayoutSerializeFlags(2);
    
    /**
     * Create a new LayoutSerializeFlags with the provided value
     */
    public LayoutSerializeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public LayoutSerializeFlags or(LayoutSerializeFlags... masks) {
        int value = this.getValue();
        for (LayoutSerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new LayoutSerializeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static LayoutSerializeFlags combined(LayoutSerializeFlags mask, LayoutSerializeFlags... masks) {
        int value = mask.getValue();
        for (LayoutSerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new LayoutSerializeFlags(value);
    }
}
