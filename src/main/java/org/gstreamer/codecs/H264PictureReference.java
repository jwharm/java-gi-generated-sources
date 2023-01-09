package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum H264PictureReference implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Not used for reference picture
     */
    NONE(0),
    
    /**
     * Used for short-term reference picture
     */
    SHORT_TERM(1),
    
    /**
     * Used for long-term reference picture
     */
    LONG_TERM(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstH264PictureReference";
    
    private final int value;
    
    /**
     * Create a new H264PictureReference for the provided value
     * @param numeric value the enum value
     */
    H264PictureReference(int value) {
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
     * Create a new H264PictureReference for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static H264PictureReference of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SHORT_TERM;
            case 2 -> LONG_TERM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
