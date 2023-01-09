package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of URI direction.
 */
public enum URIType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The URI direction is unknown
     */
    UNKNOWN(0),
    
    /**
     * The URI is a consumer.
     */
    SINK(1),
    
    /**
     * The URI is a producer.
     */
    SRC(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstURIType";
    
    private final int value;
    
    /**
     * Create a new URIType for the provided value
     * @param numeric value the enum value
     */
    URIType(int value) {
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
     * Create a new URIType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static URIType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> SINK;
            case 2 -> SRC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
