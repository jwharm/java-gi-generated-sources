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
    
    public SerializeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SerializeFlags combined(SerializeFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SerializeFlags combined(SerializeFlags mask, SerializeFlags... masks) {
        for (SerializeFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
