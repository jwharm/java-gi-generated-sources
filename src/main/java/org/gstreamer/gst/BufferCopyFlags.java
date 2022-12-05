package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of flags that can be provided to the gst_buffer_copy_into()
 * function to specify which items should be copied.
 */
public class BufferCopyFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferCopyFlags";
    
    /**
     * copy nothing
     */
    public static final BufferCopyFlags NONE = new BufferCopyFlags(0);
    
    /**
     * flag indicating that buffer flags should be copied
     */
    public static final BufferCopyFlags FLAGS = new BufferCopyFlags(1);
    
    /**
     * flag indicating that buffer pts, dts,
     *   duration, offset and offset_end should be copied
     */
    public static final BufferCopyFlags TIMESTAMPS = new BufferCopyFlags(2);
    
    /**
     * flag indicating that buffer meta should be
     *   copied
     */
    public static final BufferCopyFlags META = new BufferCopyFlags(4);
    
    /**
     * flag indicating that buffer memory should be reffed
     *   and appended to already existing memory. Unless the memory is marked as
     *   NO_SHARE, no actual copy of the memory is made but it is simply reffed.
     *   Add {@code GST_BUFFER_COPY_DEEP} to force a real copy.
     */
    public static final BufferCopyFlags MEMORY = new BufferCopyFlags(8);
    
    /**
     * flag indicating that buffer memory should be
     *   merged
     */
    public static final BufferCopyFlags MERGE = new BufferCopyFlags(16);
    
    /**
     * flag indicating that memory should always be copied instead of reffed
     */
    public static final BufferCopyFlags DEEP = new BufferCopyFlags(32);
    
    public BufferCopyFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BufferCopyFlags or(BufferCopyFlags mask) {
        return new BufferCopyFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BufferCopyFlags combined(BufferCopyFlags mask, BufferCopyFlags... masks) {
        int value = mask.getValue();        for (BufferCopyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BufferCopyFlags(value);
    }
}
