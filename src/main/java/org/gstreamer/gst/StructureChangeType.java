package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a {@link MessageType#STRUCTURE_CHANGE}.
 */
public enum StructureChangeType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Pad linking is starting or done.
     */
    LINK(0),
    /**
     * Pad unlinking is starting or done.
     */
    UNLINK(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstStructureChangeType";
    
    private final int value;
    StructureChangeType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static StructureChangeType of(int value) {
        return switch (value) {
            case 0 -> LINK;
            case 1 -> UNLINK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
