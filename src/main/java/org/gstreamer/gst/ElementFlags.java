package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The standard flags that an element may have.
 */
public class ElementFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstElementFlags";
    
    /**
     * ignore state changes from parent
     */
    public static final ElementFlags LOCKED_STATE = new ElementFlags(16);
    
    /**
     * the element is a sink
     */
    public static final ElementFlags SINK = new ElementFlags(32);
    
    /**
     * the element is a source.
     */
    public static final ElementFlags SOURCE = new ElementFlags(64);
    
    /**
     * the element can provide a clock
     */
    public static final ElementFlags PROVIDE_CLOCK = new ElementFlags(128);
    
    /**
     * the element requires a clock
     */
    public static final ElementFlags REQUIRE_CLOCK = new ElementFlags(256);
    
    /**
     * the element can use an index
     */
    public static final ElementFlags INDEXABLE = new ElementFlags(512);
    
    /**
     * offset to define more flags
     */
    public static final ElementFlags LAST = new ElementFlags(16384);
    
    /**
     * Create a new ElementFlags with the provided value
     */
    public ElementFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ElementFlags or(ElementFlags... masks) {
        int value = this.getValue();
        for (ElementFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ElementFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ElementFlags combined(ElementFlags mask, ElementFlags... masks) {
        int value = mask.getValue();
        for (ElementFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ElementFlags(value);
    }
}
