package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstTagScope specifies if a taglist applies to the complete
 * medium or only to one single stream.
 */
public enum TagScope implements io.github.jwharm.javagi.Enumeration {
    /**
     * tags specific to this single stream
     */
    STREAM(0),
    /**
     * global tags for the complete medium
     */
    GLOBAL(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstTagScope";
    
    private final int value;
    TagScope(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TagScope of(int value) {
        return switch (value) {
            case 0 -> STREAM;
            case 1 -> GLOBAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
