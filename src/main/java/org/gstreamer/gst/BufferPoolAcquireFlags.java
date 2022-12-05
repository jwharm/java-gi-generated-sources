package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Additional flags to control the allocation of a buffer
 */
public class BufferPoolAcquireFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferPoolAcquireFlags";
    
    /**
     * no flags
     */
    public static final BufferPoolAcquireFlags NONE = new BufferPoolAcquireFlags(0);
    
    /**
     * buffer is keyframe
     */
    public static final BufferPoolAcquireFlags KEY_UNIT = new BufferPoolAcquireFlags(1);
    
    /**
     * when the bufferpool is empty, acquire_buffer
     * will by default block until a buffer is released into the pool again. Setting
     * this flag makes acquire_buffer return {@code GST_FLOW_EOS} instead of blocking.
     */
    public static final BufferPoolAcquireFlags DONTWAIT = new BufferPoolAcquireFlags(2);
    
    /**
     * buffer is discont
     */
    public static final BufferPoolAcquireFlags DISCONT = new BufferPoolAcquireFlags(4);
    
    /**
     * last flag, subclasses can use private flags
     *    starting from this value.
     */
    public static final BufferPoolAcquireFlags LAST = new BufferPoolAcquireFlags(65536);
    
    public BufferPoolAcquireFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BufferPoolAcquireFlags or(BufferPoolAcquireFlags mask) {
        return new BufferPoolAcquireFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BufferPoolAcquireFlags combined(BufferPoolAcquireFlags mask, BufferPoolAcquireFlags... masks) {
        int value = mask.getValue();        for (BufferPoolAcquireFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BufferPoolAcquireFlags(value);
    }
}
