package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The various interpolation modes available.
 */
public enum InterpolationMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * steps-like interpolation, default
     */
    NONE(0),
    /**
     * linear interpolation
     */
    LINEAR(1),
    /**
     * cubic interpolation (natural), may overshoot
     *   the min or max values set by the control point, but is more 'curvy'
     */
    CUBIC(2),
    /**
     * monotonic cubic interpolation, will not
     *   produce any values outside of the min-max range set by the control points
     *   (Since: 1.8)
     */
    CUBIC_MONOTONIC(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstInterpolationMode";
    
    private final int value;
    InterpolationMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static InterpolationMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> LINEAR;
            case 2 -> CUBIC;
            case 3 -> CUBIC_MONOTONIC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
