package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Additional RTP buffer flags. These flags can potentially be used on any
 * buffers carrying RTP packets.
 * <p>
 * Note that these are only valid for {@link org.gstreamer.gst.Caps} of type: application/x-rtp (x-rtcp).
 * They can conflict with other extended buffer flags.
 * @version 1.10
 */
public class RTPBufferFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBufferFlags";
    
    /**
     * The {@link org.gstreamer.gst.Buffer} was once wrapped
     *           in a retransmitted packet as specified by RFC 4588.
     */
    public static final RTPBufferFlags RETRANSMISSION = new RTPBufferFlags(1048576);
    
    /**
     * The packet represents redundant RTP packet.
     *           The flag is used in gstrtpstorage to be able to hold the packetback
     *           and use it only for recovery from packet loss.
     *           Since: 1.14
     */
    public static final RTPBufferFlags REDUNDANT = new RTPBufferFlags(2097152);
    
    /**
     * Offset to define more flags.
     */
    public static final RTPBufferFlags LAST = new RTPBufferFlags(268435456);
    
    public RTPBufferFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTPBufferFlags or(RTPBufferFlags mask) {
        return new RTPBufferFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTPBufferFlags combined(RTPBufferFlags mask, RTPBufferFlags... masks) {
        int value = mask.getValue();        for (RTPBufferFlags arg : masks) {
            value |= arg.getValue();
        }
        return new RTPBufferFlags(value);
    }
}
