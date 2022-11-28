package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when locking miniobjects
 */
public class LockFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstLockFlags";
    
    /**
     * lock for read access
     */
    public static final LockFlags READ = new LockFlags(1);
    
    /**
     * lock for write access
     */
    public static final LockFlags WRITE = new LockFlags(2);
    
    /**
     * lock for exclusive access
     */
    public static final LockFlags EXCLUSIVE = new LockFlags(4);
    
    /**
     * first flag that can be used for custom purposes
     */
    public static final LockFlags LAST = new LockFlags(256);
    
    public LockFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public LockFlags combined(LockFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static LockFlags combined(LockFlags mask, LockFlags... masks) {
        for (LockFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
