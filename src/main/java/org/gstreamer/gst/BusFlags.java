package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The standard flags that a bus may have.
 */
public class BusFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBusFlags";
    
    /**
     * The bus is currently dropping all messages
     */
    public static final BusFlags FLUSHING = new BusFlags(16);
    
    /**
     * offset to define more flags
     */
    public static final BusFlags FLAG_LAST = new BusFlags(32);
    
    /**
     * Create a new BusFlags with the provided value
     */
    public BusFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BusFlags or(BusFlags... masks) {
        int value = this.getValue();
        for (BusFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BusFlags combined(BusFlags mask, BusFlags... masks) {
        int value = mask.getValue();
        for (BusFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusFlags(value);
    }
}
