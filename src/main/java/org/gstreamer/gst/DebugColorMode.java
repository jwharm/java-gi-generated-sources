package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum DebugColorMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Do not use colors in logs.
     */
    OFF(0),
    
    /**
     * Paint logs in a platform-specific way.
     */
    ON(1),
    
    /**
     * Paint logs with UNIX terminal color codes
     *                             no matter what platform GStreamer is running on.
     */
    UNIX(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugColorMode";
    
    private final int value;
    
    /**
     * Create a new DebugColorMode for the provided value
     * @param numeric value the enum value
     */
    DebugColorMode(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new DebugColorMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DebugColorMode of(int value) {
        return switch (value) {
            case 0 -> OFF;
            case 1 -> ON;
            case 2 -> UNIX;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
