package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for allocators.
 */
public class AllocatorFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAllocatorFlags";
    
    /**
     * The allocator has a custom alloc function.
     */
    public static final AllocatorFlags CUSTOM_ALLOC = new AllocatorFlags(16);
    
    /**
     * first flag that can be used for custom purposes
     */
    public static final AllocatorFlags LAST = new AllocatorFlags(1048576);
    
    public AllocatorFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AllocatorFlags combined(AllocatorFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AllocatorFlags combined(AllocatorFlags mask, AllocatorFlags... masks) {
        for (AllocatorFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
