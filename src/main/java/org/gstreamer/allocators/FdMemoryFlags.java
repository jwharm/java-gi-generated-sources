package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Various flags to control the operation of the fd backed memory.
 * @version 1.6
 */
public class FdMemoryFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstFdMemoryFlags";
    
    /**
     * no flag
     */
    public static final FdMemoryFlags NONE = new FdMemoryFlags(0);
    
    /**
     * once the memory is mapped,
     *        keep it mapped until the memory is destroyed.
     */
    public static final FdMemoryFlags KEEP_MAPPED = new FdMemoryFlags(1);
    
    /**
     * do a private mapping instead of
     *        the default shared mapping.
     */
    public static final FdMemoryFlags MAP_PRIVATE = new FdMemoryFlags(2);
    
    /**
     * don't close the file descriptor when
     *        the memory is freed. Since: 1.10
     */
    public static final FdMemoryFlags DONT_CLOSE = new FdMemoryFlags(4);
    
    public FdMemoryFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FdMemoryFlags or(FdMemoryFlags... masks) {
        int value = this.getValue();
        for (FdMemoryFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FdMemoryFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FdMemoryFlags combined(FdMemoryFlags mask, FdMemoryFlags... masks) {
        int value = mask.getValue();
        for (FdMemoryFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FdMemoryFlags(value);
    }
}
