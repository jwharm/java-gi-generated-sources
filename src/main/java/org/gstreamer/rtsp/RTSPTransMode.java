package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The transfer mode to use.
 */
public class RTSPTransMode extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTransMode";
    
    /**
     * invalid tansport mode
     */
    public static final RTSPTransMode UNKNOWN = new RTSPTransMode(0);
    
    /**
     * transfer RTP data
     */
    public static final RTSPTransMode RTP = new RTSPTransMode(1);
    
    /**
     * transfer RDT (RealMedia) data
     */
    public static final RTSPTransMode RDT = new RTSPTransMode(2);
    
    /**
     * Create a new RTSPTransMode with the provided value
     */
    public RTSPTransMode(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTSPTransMode or(RTSPTransMode... masks) {
        int value = this.getValue();
        for (RTSPTransMode arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPTransMode(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTSPTransMode combined(RTSPTransMode mask, RTSPTransMode... masks) {
        int value = mask.getValue();
        for (RTSPTransMode arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPTransMode(value);
    }
}
