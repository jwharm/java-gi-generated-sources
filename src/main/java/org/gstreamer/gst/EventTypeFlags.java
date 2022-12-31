package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link EventTypeFlags} indicate the aspects of the different {@link EventType}
 * values. You can get the type flags of a {@link EventType} with the
 * gst_event_type_get_flags() function.
 */
public class EventTypeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstEventTypeFlags";
    
    /**
     * Set if the event can travel upstream.
     */
    public static final EventTypeFlags UPSTREAM = new EventTypeFlags(1);
    
    /**
     * Set if the event can travel downstream.
     */
    public static final EventTypeFlags DOWNSTREAM = new EventTypeFlags(2);
    
    /**
     * Set if the event should be serialized with data
     *                               flow.
     */
    public static final EventTypeFlags SERIALIZED = new EventTypeFlags(4);
    
    /**
     * Set if the event is sticky on the pads.
     */
    public static final EventTypeFlags STICKY = new EventTypeFlags(8);
    
    /**
     * Multiple sticky events can be on a pad, each
     *                               identified by the event name.
     */
    public static final EventTypeFlags STICKY_MULTI = new EventTypeFlags(16);
    
    public EventTypeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public EventTypeFlags or(EventTypeFlags... masks) {
        int value = this.getValue();
        for (EventTypeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new EventTypeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static EventTypeFlags combined(EventTypeFlags mask, EventTypeFlags... masks) {
        int value = mask.getValue();
        for (EventTypeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new EventTypeFlags(value);
    }
}
