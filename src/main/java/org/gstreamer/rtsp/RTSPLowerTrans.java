package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different transport methods.
 */
public class RTSPLowerTrans extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPLowerTrans";
    
    /**
     * invalid transport flag
     */
    public static final RTSPLowerTrans UNKNOWN = new RTSPLowerTrans(0);
    
    /**
     * stream data over UDP
     */
    public static final RTSPLowerTrans UDP = new RTSPLowerTrans(1);
    
    /**
     * stream data over UDP multicast
     */
    public static final RTSPLowerTrans UDP_MCAST = new RTSPLowerTrans(2);
    
    /**
     * stream data over TCP
     */
    public static final RTSPLowerTrans TCP = new RTSPLowerTrans(4);
    
    /**
     * stream data tunneled over HTTP.
     */
    public static final RTSPLowerTrans HTTP = new RTSPLowerTrans(16);
    
    /**
     * encrypt TCP and HTTP with TLS
     */
    public static final RTSPLowerTrans TLS = new RTSPLowerTrans(32);
    
    /**
     * Create a new RTSPLowerTrans with the provided value
     */
    public RTSPLowerTrans(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTSPLowerTrans or(RTSPLowerTrans... masks) {
        int value = this.getValue();
        for (RTSPLowerTrans arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPLowerTrans(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTSPLowerTrans combined(RTSPLowerTrans mask, RTSPLowerTrans... masks) {
        int value = mask.getValue();
        for (RTSPLowerTrans arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPLowerTrans(value);
    }
}
