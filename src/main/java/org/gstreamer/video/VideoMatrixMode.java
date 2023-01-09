package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different color matrix conversion modes
 * @version 1.6
 */
public enum VideoMatrixMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * do conversion between color matrices
     */
    FULL(0),
    
    /**
     * use the input color matrix to convert
     *   to and from R'G'B
     */
    INPUT_ONLY(1),
    
    /**
     * use the output color matrix to convert
     *   to and from R'G'B
     */
    OUTPUT_ONLY(2),
    
    /**
     * disable color matrix conversion.
     */
    NONE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMatrixMode";
    
    private final int value;
    
    /**
     * Create a new VideoMatrixMode for the provided value
     * @param numeric value the enum value
     */
    VideoMatrixMode(int value) {
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
     * Create a new VideoMatrixMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoMatrixMode of(int value) {
        return switch (value) {
            case 0 -> FULL;
            case 1 -> INPUT_ONLY;
            case 2 -> OUTPUT_ONLY;
            case 3 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
