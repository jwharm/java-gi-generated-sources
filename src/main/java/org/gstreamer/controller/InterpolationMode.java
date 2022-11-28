package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The various interpolation modes available.
 */
public class InterpolationMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstInterpolationMode";
    
    /**
     * steps-like interpolation, default
     */
    public static final InterpolationMode NONE = new InterpolationMode(0);
    
    /**
     * linear interpolation
     */
    public static final InterpolationMode LINEAR = new InterpolationMode(1);
    
    /**
     * cubic interpolation (natural), may overshoot
     *   the min or max values set by the control point, but is more 'curvy'
     */
    public static final InterpolationMode CUBIC = new InterpolationMode(2);
    
    /**
     * monotonic cubic interpolation, will not
     *   produce any values outside of the min-max range set by the control points
     *   (Since: 1.8)
     */
    public static final InterpolationMode CUBIC_MONOTONIC = new InterpolationMode(3);
    
    public InterpolationMode(int value) {
        super(value);
    }
}
