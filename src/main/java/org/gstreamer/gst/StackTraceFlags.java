package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class StackTraceFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstStackTraceFlags";
    
    /**
     * Try to retrieve the minimum information
     *                             available, which may be none on some platforms
     *                             (Since: 1.18)
     */
    public static final StackTraceFlags NONE = new StackTraceFlags(0);
    
    /**
     * Try to retrieve as much information as possible,
     *                             including source information when getting the
     *                             stack trace
     */
    public static final StackTraceFlags FULL = new StackTraceFlags(1);
    
    public StackTraceFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public StackTraceFlags or(StackTraceFlags mask) {
        return new StackTraceFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static StackTraceFlags combined(StackTraceFlags mask, StackTraceFlags... masks) {
        int value = mask.getValue();        for (StackTraceFlags arg : masks) {
            value |= arg.getValue();
        }
        return new StackTraceFlags(value);
    }
}
