package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that influence the behavior of {@link Layout#deserialize}.
 * <p>
 * New members may be added to this enumeration over time.
 * @version 1.50
 */
public class LayoutDeserializeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutDeserializeFlags";
    
    /**
     * Default behavior
     */
    public static final LayoutDeserializeFlags DEFAULT = new LayoutDeserializeFlags(0);
    
    /**
     * Apply context information
     *   from the serialization to the {@code PangoContext}
     */
    public static final LayoutDeserializeFlags CONTEXT = new LayoutDeserializeFlags(1);
    
    public LayoutDeserializeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public LayoutDeserializeFlags or(LayoutDeserializeFlags mask) {
        return new LayoutDeserializeFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static LayoutDeserializeFlags combined(LayoutDeserializeFlags mask, LayoutDeserializeFlags... masks) {
        int value = mask.getValue();        for (LayoutDeserializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new LayoutDeserializeFlags(value);
    }
}
