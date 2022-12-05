package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flag that describe the value. These flags help applications processing the
 * logs to understand the values.
 */
public class TracerValueFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerValueFlags";
    
    /**
     * no flags
     */
    public static final TracerValueFlags NONE = new TracerValueFlags(0);
    
    /**
     * the value is optional. When using this flag
     *   one need to have an additional boolean arg before this value in the
     *   var-args list passed to  gst_tracer_record_log().
     */
    public static final TracerValueFlags OPTIONAL = new TracerValueFlags(1);
    
    /**
     * the value is a combined figure, since the
     *   start of tracing. Examples are averages or timestamps.
     */
    public static final TracerValueFlags AGGREGATED = new TracerValueFlags(2);
    
    public TracerValueFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TracerValueFlags or(TracerValueFlags mask) {
        return new TracerValueFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TracerValueFlags combined(TracerValueFlags mask, TracerValueFlags... masks) {
        int value = mask.getValue();        for (TracerValueFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TracerValueFlags(value);
    }
}
