package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The direction of a pad.
 */
public enum PadDirection implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * direction is unknown.
     */
    UNKNOWN(0),
    
    /**
     * the pad is a source pad.
     */
    SRC(1),
    
    /**
     * the pad is a sink pad.
     */
    SINK(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstPadDirection";
    
    private final int value;
    
    /**
     * Create a new PadDirection for the provided value
     * @param numeric value the enum value
     */
    PadDirection(int value) {
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
     * Create a new PadDirection for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PadDirection of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> SRC;
            case 2 -> SINK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
