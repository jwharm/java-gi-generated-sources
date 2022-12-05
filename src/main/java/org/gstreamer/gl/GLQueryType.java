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
    GLQueryType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLQueryType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> TIME_ELAPSED;
            case 2 -> TIMESTAMP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
