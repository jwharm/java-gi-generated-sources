package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for wrapped memory.
 */
public class MemoryFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstMemoryFlags";
    
    /**
     * memory is readonly. It is not allowed to map the
     * memory with {@code GST_MAP_WRITE}.
     */
    public static final MemoryFlags READONLY = new MemoryFlags(2);
    
    /**
     * memory must not be shared. Copies will have to be
     * made when this memory needs to be shared between buffers. (DEPRECATED:
     * do not use in new code, instead you should create a custom GstAllocator for
     * memory pooling instead of relying on the GstBuffer they were originally
     * attached to.)
     */
    public static final MemoryFlags NO_SHARE = new MemoryFlags(16);
    
    /**
     * the memory prefix is filled with 0 bytes
     */
    public static final MemoryFlags ZERO_PREFIXED = new MemoryFlags(32);
    
    /**
     * the memory padding is filled with 0 bytes
     */
    public static final MemoryFlags ZERO_PADDED = new MemoryFlags(64);
    
    /**
     * the memory is physically
     * contiguous. (Since: 1.2)
     */
    public static final MemoryFlags PHYSICALLY_CONTIGUOUS = new MemoryFlags(128);
    
    /**
     * the memory can't be mapped via
     * gst_memory_map() without any preconditions. (Since: 1.2)
     */
    public static final MemoryFlags NOT_MAPPABLE = new MemoryFlags(256);
    
    /**
     * first flag that can be used for custom purposes
     */
    public static final MemoryFlags LAST = new MemoryFlags(1048576);
    
    public MemoryFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MemoryFlags or(MemoryFlags... masks) {
        int value = this.getValue();
        for (MemoryFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MemoryFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MemoryFlags combined(MemoryFlags mask, MemoryFlags... masks) {
        int value = mask.getValue();
        for (MemoryFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MemoryFlags(value);
    }
}
