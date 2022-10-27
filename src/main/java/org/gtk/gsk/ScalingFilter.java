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
public class ScalingFilter extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * linear interpolation filter
     */
    public static final ScalingFilter LINEAR = new ScalingFilter(0);
    
    /**
     * nearest neighbor interpolation filter
     */
    public static final ScalingFilter NEAREST = new ScalingFilter(1);
    
    /**
     * linear interpolation along each axis,
     *   plus mipmap generation, with linear interpolation along the mipmap
     *   levels
     */
    public static final ScalingFilter TRILINEAR = new ScalingFilter(2);
    
    public ScalingFilter(int value) {
        super(value);
    }
}
