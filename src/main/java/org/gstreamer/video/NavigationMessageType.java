package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of notifications that may be received on the bus when navigation
 * related status changes.
 */
public enum NavigationMessageType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Returned from
     * gst_navigation_message_get_type() when the passed message is not a
     * navigation message.
     */
    INVALID(0),
    /**
     * Sent when the mouse moves over or leaves a
     * clickable region of the output, such as a DVD menu button.
     */
    MOUSE_OVER(1),
    /**
     * Sent when the set of available commands
     * changes and should re-queried by interested applications.
     */
    COMMANDS_CHANGED(2),
    /**
     * Sent when display angles in a multi-angle
     * feature (such as a multiangle DVD) change - either angles have appeared or
     * disappeared.
     */
    ANGLES_CHANGED(3),
    /**
     * Sent when a navigation event was not handled
     * by any element in the pipeline (Since: 1.6)
     */
    EVENT(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstNavigationMessageType";
    
    private final int value;
    NavigationMessageType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static NavigationMessageType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> MOUSE_OVER;
            case 2 -> COMMANDS_CHANGED;
            case 3 -> ANGLES_CHANGED;
            case 4 -> EVENT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
