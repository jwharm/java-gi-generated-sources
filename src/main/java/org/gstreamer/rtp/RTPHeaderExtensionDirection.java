package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Direction to which to apply the RTP Header Extension
 * @version 1.20
 */
public class RTPHeaderExtensionDirection extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPHeaderExtensionDirection";
    
    /**
     * Neither send nor
     * receive RTP Header Extensions
     */
    public static final RTPHeaderExtensionDirection INACTIVE = new RTPHeaderExtensionDirection(0);
    
    /**
     * Only send RTP Header
     * Extensions {@code GST_RTP_HEADER_EXTENSION_DIRECTION_RECVONLY}: Only
     * receive RTP Header Extensions
     */
    public static final RTPHeaderExtensionDirection SENDONLY = new RTPHeaderExtensionDirection(1);
    
    public static final RTPHeaderExtensionDirection RECVONLY = new RTPHeaderExtensionDirection(2);
    
    /**
     * Send and receive RTP
     * Header Extensions ext
     */
    public static final RTPHeaderExtensionDirection SENDRECV = new RTPHeaderExtensionDirection(3);
    
    /**
     * RTP header extension
     * direction is inherited from the stream
     */
    public static final RTPHeaderExtensionDirection INHERITED = new RTPHeaderExtensionDirection(4);
    
    public RTPHeaderExtensionDirection(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTPHeaderExtensionDirection or(RTPHeaderExtensionDirection mask) {
        return new RTPHeaderExtensionDirection(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTPHeaderExtensionDirection combined(RTPHeaderExtensionDirection mask, RTPHeaderExtensionDirection... masks) {
        int value = mask.getValue();        for (RTPHeaderExtensionDirection arg : masks) {
            value |= arg.getValue();
        }
        return new RTPHeaderExtensionDirection(value);
    }
}
