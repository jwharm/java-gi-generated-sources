package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different primaries conversion modes
 * @version 1.6
 */
public enum VideoPrimariesMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * disable conversion between primaries
     */
    NONE(0),
    
    /**
     * do conversion between primaries only
     *   when it can be merged with color matrix conversion.
     */
    MERGE_ONLY(1),
    
    /**
     * fast conversion between primaries
     */
    FAST(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoPrimariesMode";
    
    private final int value;
    
    /**
     * Create a new VideoPrimariesMode for the provided value
     * @param numeric value the enum value
     */
    VideoPrimariesMode(int value) {
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
     * Create a new VideoPrimariesMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoPrimariesMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> MERGE_ONLY;
            case 2 -> FAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
