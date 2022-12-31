package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra metadata flags.
 */
public class MetaFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstMetaFlags";
    
    /**
     * no flags
     */
    public static final MetaFlags NONE = new MetaFlags(0);
    
    /**
     * metadata should not be modified
     */
    public static final MetaFlags READONLY = new MetaFlags(1);
    
    /**
     * metadata is managed by a bufferpool
     */
    public static final MetaFlags POOLED = new MetaFlags(2);
    
    /**
     * metadata should not be removed
     */
    public static final MetaFlags LOCKED = new MetaFlags(4);
    
    /**
     * additional flags can be added starting from this flag.
     */
    public static final MetaFlags LAST = new MetaFlags(65536);
    
    public MetaFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MetaFlags or(MetaFlags... masks) {
        int value = this.getValue();
        for (MetaFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MetaFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MetaFlags combined(MetaFlags mask, MetaFlags... masks) {
        int value = mask.getValue();
        for (MetaFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MetaFlags(value);
    }
}
