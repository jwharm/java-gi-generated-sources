package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The filters used when scaling texture data.
 * <p>
 * The actual implementation of each filter is deferred to the
 * rendering pipeline.
 */
public enum ScalingFilter implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * linear interpolation filter
     */
    LINEAR(0),
    
    /**
     * nearest neighbor interpolation filter
     */
    NEAREST(1),
    
    /**
     * linear interpolation along each axis,
     *   plus mipmap generation, with linear interpolation along the mipmap
     *   levels
     */
    TRILINEAR(2);
    
    private static final java.lang.String C_TYPE_NAME = "GskScalingFilter";
    
    private final int value;
    
    /**
     * Create a new ScalingFilter for the provided value
     * @param numeric value the enum value
     */
    ScalingFilter(int value) {
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
     * Create a new ScalingFilter for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ScalingFilter of(int value) {
        return switch (value) {
            case 0 -> LINEAR;
            case 1 -> NEAREST;
            case 2 -> TRILINEAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
