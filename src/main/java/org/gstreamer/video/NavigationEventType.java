package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enum values for the various events that an element implementing the
 * GstNavigation interface might send up the pipeline.
 */
public enum NavigationEventType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Returned from
     * gst_navigation_event_get_type() when the passed event is not a navigation event.
     */
    INVALID(0),
    
    /**
     * A key press event. Use
     * gst_navigation_event_parse_key_event() to extract the details from the event.
     */
    KEY_PRESS(1),
    
    /**
     * A key release event. Use
     * gst_navigation_event_parse_key_event() to extract the details from the event.
     */
    KEY_RELEASE(2),
    
    /**
     * A mouse button press event. Use
     * gst_navigation_event_parse_mouse_button_event() to extract the details from the
     * event.
     */
    MOUSE_BUTTON_PRESS(3),
    
    /**
     * A mouse button release event. Use
     * gst_navigation_event_parse_mouse_button_event() to extract the details from the
     * event.
     */
    MOUSE_BUTTON_RELEASE(4),
    
    /**
     * A mouse movement event. Use
     * gst_navigation_event_parse_mouse_move_event() to extract the details from the
     * event.
     */
    MOUSE_MOVE(5),
    
    /**
     * A navigation command event. Use
     * gst_navigation_event_parse_command() to extract the details from the event.
     */
    COMMAND(6),
    
    /**
     * A mouse scroll event. Use gst_navigation_event_parse_mouse_scroll_event()
     * to extract the details from the event.
     */
    MOUSE_SCROLL(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstNavigationEventType";
    
    private final int value;
    
    /**
     * Create a new NavigationEventType for the provided value
     * @param numeric value the enum value
     */
    NavigationEventType(int value) {
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
     * Create a new NavigationEventType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NavigationEventType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> KEY_PRESS;
            case 2 -> KEY_RELEASE;
            case 3 -> MOUSE_BUTTON_PRESS;
            case 4 -> MOUSE_BUTTON_RELEASE;
            case 5 -> MOUSE_MOVE;
            case 6 -> COMMAND;
            case 7 -> MOUSE_SCROLL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
