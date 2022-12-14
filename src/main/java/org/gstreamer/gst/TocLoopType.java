package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * How a {@link TocEntry} should be repeated. By default, entries are played a
 * single time.
 * @version 1.4
 */
public enum TocLoopType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * single forward playback
     */
    NONE(0),
    
    /**
     * repeat forward
     */
    FORWARD(1),
    
    /**
     * repeat backward
     */
    REVERSE(2),
    
    /**
     * repeat forward and backward
     */
    PING_PONG(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstTocLoopType";
    
    private final int value;
    
    /**
     * Create a new TocLoopType for the provided value
     * @param numeric value the enum value
     */
    TocLoopType(int value) {
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
     * Create a new TocLoopType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TocLoopType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> FORWARD;
            case 2 -> REVERSE;
            case 3 -> PING_PONG;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
