package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of passing data to a pad.
 * <p>
 * Note that the custom return values should not be exposed outside of the
 * element scope.
 */
public class FlowReturn extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstFlowReturn";
    
    /**
     * Pre-defined custom success code.
     */
    public static final FlowReturn CUSTOM_SUCCESS_2 = new FlowReturn(102);
    
    /**
     * Pre-defined custom success code (define your
     *                               custom success code to this to avoid compiler
     *                               warnings).
     */
    public static final FlowReturn CUSTOM_SUCCESS_1 = new FlowReturn(101);
    
    /**
     * Elements can use values starting from
     *                               this (and higher) to define custom success
     *                               codes.
     */
    public static final FlowReturn CUSTOM_SUCCESS = new FlowReturn(100);
    
    /**
     * Data passing was ok.
     */
    public static final FlowReturn OK = new FlowReturn(0);
    
    /**
     * Pad is not linked.
     */
    public static final FlowReturn NOT_LINKED = new FlowReturn(0);
    
    /**
     * Pad is flushing.
     */
    public static final FlowReturn FLUSHING = new FlowReturn(0);
    
    /**
     * Pad is EOS.
     */
    public static final FlowReturn EOS = new FlowReturn(0);
    
    /**
     * Pad is not negotiated.
     */
    public static final FlowReturn NOT_NEGOTIATED = new FlowReturn(0);
    
    /**
     * Some (fatal) error occurred. Element generating
     *                               this error should post an error message using
     *                               GST_ELEMENT_ERROR() with more details.
     */
    public static final FlowReturn ERROR = new FlowReturn(0);
    
    /**
     * This operation is not supported.
     */
    public static final FlowReturn NOT_SUPPORTED = new FlowReturn(0);
    
    /**
     * Elements can use values starting from
     *                               this (and lower) to define custom error codes.
     */
    public static final FlowReturn CUSTOM_ERROR = new FlowReturn(0);
    
    /**
     * Pre-defined custom error code (define your
     *                               custom error code to this to avoid compiler
     *                               warnings).
     */
    public static final FlowReturn CUSTOM_ERROR_1 = new FlowReturn(0);
    
    /**
     * Pre-defined custom error code.
     */
    public static final FlowReturn CUSTOM_ERROR_2 = new FlowReturn(0);
    
    public FlowReturn(int value) {
        super(value);
    }
}
