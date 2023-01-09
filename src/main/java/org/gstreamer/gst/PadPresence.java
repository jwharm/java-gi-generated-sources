package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates when this pad will become available.
 */
public enum PadPresence implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the pad is always available
     */
    ALWAYS(0),
    
    /**
     * the pad will become available depending on the media stream
     */
    SOMETIMES(1),
    
    /**
     * the pad is only available on request with
     *  gst_element_request_pad().
     */
    REQUEST(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstPadPresence";
    
    private final int value;
    
    /**
     * Create a new PadPresence for the provided value
     * @param numeric value the enum value
     */
    PadPresence(int value) {
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
     * Create a new PadPresence for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PadPresence of(int value) {
        return switch (value) {
            case 0 -> ALWAYS;
            case 1 -> SOMETIMES;
            case 2 -> REQUEST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
