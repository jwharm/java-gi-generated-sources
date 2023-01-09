package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SerializeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstSerializeFlags";
    
    /**
     * No special flags specified.
     */
    public static final SerializeFlags NONE = new SerializeFlags(0);
    
    /**
     * Serialize using the old format for
     *                                      nested structures.
     */
    public static final SerializeFlags BACKWARD_COMPAT = new SerializeFlags(1);
    
    /**
     * Create a new SerializeFlags with the provided value
     */
    public SerializeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SerializeFlags or(SerializeFlags... masks) {
        int value = this.getValue();
        for (SerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SerializeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SerializeFlags combined(SerializeFlags mask, SerializeFlags... masks) {
        int value = mask.getValue();
        for (SerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SerializeFlags(value);
    }
}
