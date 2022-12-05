package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes limits of a {@link EventController} for handling events
 * targeting other widgets.
 */
public enum PropagationLimit implements io.github.jwharm.javagi.Enumeration {
    /**
     * Events are handled regardless of what their
     *   target is.
     */
    NONE(0),
    /**
     * Events are only handled if their target
     *   is in the same {@code Native} as the event controllers widget. Note
     *   that some event types have two targets (origin and destination).
     */
    SAME_NATIVE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPropagationLimit";
    
    private final int value;
    PropagationLimit(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PropagationLimit of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SAME_NATIVE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
