package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum GLQueryType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no query
     */
    NONE(0),
    
    /**
     * query the time elapsed
     */
    TIME_ELAPSED(1),
    
    /**
     * query the current time
     */
    TIMESTAMP(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLQueryType";
    
    private final int value;
    
    /**
     * Create a new GLQueryType for the provided value
     * @param numeric value the enum value
     */
    GLQueryType(int value) {
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
     * Create a new GLQueryType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLQueryType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> TIME_ELAPSED;
            case 2 -> TIMESTAMP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
