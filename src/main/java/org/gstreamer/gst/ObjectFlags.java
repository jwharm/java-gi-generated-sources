package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The standard flags that an gstobject may have.
 */
public class ObjectFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstObjectFlags";
    
    /**
     * the object is expected to stay alive even
     * after gst_deinit() has been called and so should be ignored by leak
     * detection tools. (Since: 1.10)
     */
    public static final ObjectFlags MAY_BE_LEAKED = new ObjectFlags(1);
    
    /**
     * subclasses can add additional flags starting from this flag
     */
    public static final ObjectFlags LAST = new ObjectFlags(16);
    
    public ObjectFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ObjectFlags or(ObjectFlags mask) {
        return new ObjectFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ObjectFlags combined(ObjectFlags mask, ObjectFlags... masks) {
        int value = mask.getValue();        for (ObjectFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ObjectFlags(value);
    }
}
