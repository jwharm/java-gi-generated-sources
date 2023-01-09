package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link org.gstreamer.gst.Element} flags that a basesrc element may have.
 */
public class BaseSrcFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseSrcFlags";
    
    /**
     * has source is starting
     */
    public static final BaseSrcFlags STARTING = new BaseSrcFlags(16384);
    
    /**
     * has source been started
     */
    public static final BaseSrcFlags STARTED = new BaseSrcFlags(32768);
    
    /**
     * offset to define more flags
     */
    public static final BaseSrcFlags LAST = new BaseSrcFlags(1048576);
    
    /**
     * Create a new BaseSrcFlags with the provided value
     */
    public BaseSrcFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BaseSrcFlags or(BaseSrcFlags... masks) {
        int value = this.getValue();
        for (BaseSrcFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BaseSrcFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BaseSrcFlags combined(BaseSrcFlags mask, BaseSrcFlags... masks) {
        int value = mask.getValue();
        for (BaseSrcFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BaseSrcFlags(value);
    }
}
