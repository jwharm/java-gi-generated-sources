package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible events for the connection.
 */
public class RTSPEvent extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPEvent";
    
    /**
     * connection is readable
     */
    public static final RTSPEvent READ = new RTSPEvent(1);
    
    /**
     * connection is writable
     */
    public static final RTSPEvent WRITE = new RTSPEvent(2);
    
    /**
     * Create a new RTSPEvent with the provided value
     */
    public RTSPEvent(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTSPEvent or(RTSPEvent... masks) {
        int value = this.getValue();
        for (RTSPEvent arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPEvent(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTSPEvent combined(RTSPEvent mask, RTSPEvent... masks) {
        int value = mask.getValue();
        for (RTSPEvent arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPEvent(value);
    }
}
