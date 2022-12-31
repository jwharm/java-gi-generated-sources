package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The transfer profile to use.
 */
public class RTSPProfile extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPProfile";
    
    /**
     * invalid profile
     */
    public static final RTSPProfile UNKNOWN = new RTSPProfile(0);
    
    /**
     * the Audio/Visual profile (RFC 3551)
     */
    public static final RTSPProfile AVP = new RTSPProfile(1);
    
    /**
     * the secure Audio/Visual profile (RFC 3711)
     */
    public static final RTSPProfile SAVP = new RTSPProfile(2);
    
    /**
     * the Audio/Visual profile with feedback (RFC 4585)
     */
    public static final RTSPProfile AVPF = new RTSPProfile(4);
    
    /**
     * the secure Audio/Visual profile with feedback (RFC 5124)
     */
    public static final RTSPProfile SAVPF = new RTSPProfile(8);
    
    public RTSPProfile(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTSPProfile or(RTSPProfile... masks) {
        int value = this.getValue();
        for (RTSPProfile arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPProfile(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTSPProfile combined(RTSPProfile mask, RTSPProfile... masks) {
        int value = mask.getValue();
        for (RTSPProfile arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPProfile(value);
    }
}
