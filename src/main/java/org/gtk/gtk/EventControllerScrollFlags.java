package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the behavior of a {@code GtkEventControllerScroll}.
 */
public class EventControllerScrollFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerScrollFlags";
    
    /**
     * Don't emit scroll.
     */
    public static final EventControllerScrollFlags NONE = new EventControllerScrollFlags(0);
    
    /**
     * Emit scroll with vertical deltas.
     */
    public static final EventControllerScrollFlags VERTICAL = new EventControllerScrollFlags(1);
    
    /**
     * Emit scroll with horizontal deltas.
     */
    public static final EventControllerScrollFlags HORIZONTAL = new EventControllerScrollFlags(2);
    
    /**
     * Only emit deltas that are multiples of 1.
     */
    public static final EventControllerScrollFlags DISCRETE = new EventControllerScrollFlags(4);
    
    /**
     * Emit ::decelerate after continuous scroll finishes.
     */
    public static final EventControllerScrollFlags KINETIC = new EventControllerScrollFlags(8);
    
    /**
     * Emit scroll on both axes.
     */
    public static final EventControllerScrollFlags BOTH_AXES = new EventControllerScrollFlags(3);
    
    public EventControllerScrollFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public EventControllerScrollFlags or(EventControllerScrollFlags mask) {
        return new EventControllerScrollFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static EventControllerScrollFlags combined(EventControllerScrollFlags mask, EventControllerScrollFlags... masks) {
        int value = mask.getValue();        for (EventControllerScrollFlags arg : masks) {
            value |= arg.getValue();
        }
        return new EventControllerScrollFlags(value);
    }
}
