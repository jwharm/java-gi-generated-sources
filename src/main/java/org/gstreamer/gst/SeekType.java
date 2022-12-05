package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of seek events. When constructing a seek event with
 * gst_event_new_seek() or when doing gst_segment_do_seek ().
 */
public enum SeekType implements io.github.jwharm.javagi.Enumeration {
    /**
     * no change in position is required
     */
    NONE(0),
    /**
     * absolute position is requested
     */
    SET(1),
    /**
     * relative position to duration is requested
     */
    END(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstSeekType";
    
    private final int value;
    SeekType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SeekType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SET;
            case 2 -> END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
