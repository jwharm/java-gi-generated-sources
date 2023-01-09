package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VideoGammaMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * disable gamma handling
     */
    NONE(0),
    
    /**
     * convert between input and output gamma
     * Different gamma conversion modes
     */
    REMAP(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoGammaMode";
    
    private final int value;
    
    /**
     * Create a new VideoGammaMode for the provided value
     * @param numeric value the enum value
     */
    VideoGammaMode(int value) {
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
     * Create a new VideoGammaMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoGammaMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> REMAP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
