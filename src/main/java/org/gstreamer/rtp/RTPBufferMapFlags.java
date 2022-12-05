package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Additional mapping flags for gst_rtp_buffer_map().
 * @version 1.6.1
 */
public class RTPBufferMapFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBufferMapFlags";
    
    /**
     * Skip mapping and validation of RTP
     *           padding and RTP pad count when present. Useful for buffers where
     *           the padding may be encrypted.
     */
    public static final RTPBufferMapFlags SKIP_PADDING = new RTPBufferMapFlags(65536);
    
    /**
     * Offset to define more flags
     */
    public static final RTPBufferMapFlags LAST = new RTPBufferMapFlags(16777216);
    
    public RTPBufferMapFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTPBufferMapFlags or(RTPBufferMapFlags mask) {
        return new RTPBufferMapFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTPBufferMapFlags combined(RTPBufferMapFlags mask, RTPBufferMapFlags... masks) {
        int value = mask.getValue();        for (RTPBufferMapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new RTPBufferMapFlags(value);
    }
}
