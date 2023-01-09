package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible time types.
 */
public enum RTSPTimeType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * seconds
     */
    SECONDS(0),
    
    /**
     * now
     */
    NOW(1),
    
    /**
     * end
     */
    END(2),
    
    /**
     * frames and subframes
     */
    FRAMES(3),
    
    /**
     * UTC time
     */
    UTC(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTimeType";
    
    private final int value;
    
    /**
     * Create a new RTSPTimeType for the provided value
     * @param numeric value the enum value
     */
    RTSPTimeType(int value) {
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
     * Create a new RTSPTimeType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPTimeType of(int value) {
        return switch (value) {
            case 0 -> SECONDS;
            case 1 -> NOW;
            case 2 -> END;
            case 3 -> FRAMES;
            case 4 -> UTC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
