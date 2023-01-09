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
public enum FlowReturn implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Pre-defined custom success code.
     */
    CUSTOM_SUCCESS_2(102),
    
    /**
     * Pre-defined custom success code (define your
     *                               custom success code to this to avoid compiler
     *                               warnings).
     */
    CUSTOM_SUCCESS_1(101),
    
    /**
     * Elements can use values starting from
     *                               this (and higher) to define custom success
     *                               codes.
     */
    CUSTOM_SUCCESS(100),
    
    /**
     * Data passing was ok.
     */
    OK(0),
    
    /**
     * Pad is not linked.
     */
    NOT_LINKED(-1),
    
    /**
     * Pad is flushing.
     */
    FLUSHING(-2),
    
    /**
     * Pad is EOS.
     */
    EOS(-3),
    
    /**
     * Pad is not negotiated.
     */
    NOT_NEGOTIATED(-4),
    
    /**
     * Some (fatal) error occurred. Element generating
     *                               this error should post an error message using
     *                               GST_ELEMENT_ERROR() with more details.
     */
    ERROR(-5),
    
    /**
     * This operation is not supported.
     */
    NOT_SUPPORTED(-6),
    
    /**
     * Elements can use values starting from
     *                               this (and lower) to define custom error codes.
     */
    CUSTOM_ERROR(-100),
    
    /**
     * Pre-defined custom error code (define your
     *                               custom error code to this to avoid compiler
     *                               warnings).
     */
    CUSTOM_ERROR_1(-101),
    
    /**
     * Pre-defined custom error code.
     */
    CUSTOM_ERROR_2(-102);
    
    private static final java.lang.String C_TYPE_NAME = "GstFlowReturn";
    
    private final int value;
    
    /**
     * Create a new FlowReturn for the provided value
     * @param numeric value the enum value
     */
    FlowReturn(int value) {
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
     * Create a new FlowReturn for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FlowReturn of(int value) {
        return switch (value) {
            case 102 -> CUSTOM_SUCCESS_2;
            case 101 -> CUSTOM_SUCCESS_1;
            case 100 -> CUSTOM_SUCCESS;
            case 0 -> OK;
            case -1 -> NOT_LINKED;
            case -2 -> FLUSHING;
            case -3 -> EOS;
            case -4 -> NOT_NEGOTIATED;
            case -5 -> ERROR;
            case -6 -> NOT_SUPPORTED;
            case -100 -> CUSTOM_ERROR;
            case -101 -> CUSTOM_ERROR_1;
            case -102 -> CUSTOM_ERROR_2;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
