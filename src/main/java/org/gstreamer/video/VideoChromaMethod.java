package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different subsampling and upsampling methods
 */
public enum VideoChromaMethod implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Duplicates the chroma samples when
     *    upsampling and drops when subsampling
     */
    NEAREST(0),
    
    /**
     * Uses linear interpolation to reconstruct
     *    missing chroma and averaging to subsample
     */
    LINEAR(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoChromaMethod";
    
    private final int value;
    
    /**
     * Create a new VideoChromaMethod for the provided value
     * @param numeric value the enum value
     */
    VideoChromaMethod(int value) {
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
     * Create a new VideoChromaMethod for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoChromaMethod of(int value) {
        return switch (value) {
            case 0 -> NEAREST;
            case 1 -> LINEAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
