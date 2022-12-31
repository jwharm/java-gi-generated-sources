package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for the mini object
 */
public class MiniObjectFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstMiniObjectFlags";
    
    /**
     * the object can be locked and unlocked with
     * gst_mini_object_lock() and gst_mini_object_unlock().
     */
    public static final MiniObjectFlags LOCKABLE = new MiniObjectFlags(1);
    
    /**
     * the object is permanently locked in
     * READONLY mode. Only read locks can be performed on the object.
     */
    public static final MiniObjectFlags LOCK_READONLY = new MiniObjectFlags(2);
    
    /**
     * the object is expected to stay alive
     * even after gst_deinit() has been called and so should be ignored by leak
     * detection tools. (Since: 1.10)
     */
    public static final MiniObjectFlags MAY_BE_LEAKED = new MiniObjectFlags(4);
    
    /**
     * first flag that can be used by subclasses.
     */
    public static final MiniObjectFlags LAST = new MiniObjectFlags(16);
    
    public MiniObjectFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MiniObjectFlags or(MiniObjectFlags... masks) {
        int value = this.getValue();
        for (MiniObjectFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MiniObjectFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MiniObjectFlags combined(MiniObjectFlags mask, MiniObjectFlags... masks) {
        int value = mask.getValue();
        for (MiniObjectFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MiniObjectFlags(value);
    }
}
