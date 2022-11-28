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
    
    public BaseSrcFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BaseSrcFlags combined(BaseSrcFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BaseSrcFlags combined(BaseSrcFlags mask, BaseSrcFlags... masks) {
        for (BaseSrcFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
