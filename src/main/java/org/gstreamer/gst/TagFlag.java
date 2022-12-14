package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra tag flags used when registering tags.
 */
public enum TagFlag implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * undefined flag
     */
    UNDEFINED(0),
    
    /**
     * tag is meta data
     */
    META(1),
    
    /**
     * tag is encoded
     */
    ENCODED(2),
    
    /**
     * tag is decoded
     */
    DECODED(3),
    
    /**
     * number of tag flags
     */
    COUNT(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstTagFlag";
    
    private final int value;
    
    /**
     * Create a new TagFlag for the provided value
     * @param numeric value the enum value
     */
    TagFlag(int value) {
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
     * Create a new TagFlag for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TagFlag of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> META;
            case 2 -> ENCODED;
            case 3 -> DECODED;
            case 4 -> COUNT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
