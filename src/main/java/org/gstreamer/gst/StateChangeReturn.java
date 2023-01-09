package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible return values from a state change function such as
 * gst_element_set_state(). Only {@code GST_STATE_CHANGE_FAILURE} is a real failure.
 */
public enum StateChangeReturn implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the state change failed
     */
    FAILURE(0),
    
    /**
     * the state change succeeded
     */
    SUCCESS(1),
    
    /**
     * the state change will happen asynchronously
     */
    ASYNC(2),
    
    /**
     * the state change succeeded but the element
     *                               cannot produce data in {@link State#PAUSED}.
     *                               This typically happens with live sources.
     */
    NO_PREROLL(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstStateChangeReturn";
    
    private final int value;
    
    /**
     * Create a new StateChangeReturn for the provided value
     * @param numeric value the enum value
     */
    StateChangeReturn(int value) {
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
     * Create a new StateChangeReturn for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static StateChangeReturn of(int value) {
        return switch (value) {
            case 0 -> FAILURE;
            case 1 -> SUCCESS;
            case 2 -> ASYNC;
            case 3 -> NO_PREROLL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
