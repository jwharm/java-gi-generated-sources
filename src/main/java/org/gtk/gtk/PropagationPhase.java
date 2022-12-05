package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the stage at which events are fed into a {@link EventController}.
 */
public enum PropagationPhase implements io.github.jwharm.javagi.Enumeration {
    /**
     * Events are not delivered.
     */
    NONE(0),
    /**
     * Events are delivered in the capture phase. The
     *   capture phase happens before the bubble phase, runs from the toplevel down
     *   to the event widget. This option should only be used on containers that
     *   might possibly handle events before their children do.
     */
    CAPTURE(1),
    /**
     * Events are delivered in the bubble phase. The bubble
     *   phase happens after the capture phase, and before the default handlers
     *   are run. This phase runs from the event widget, up to the toplevel.
     */
    BUBBLE(2),
    /**
     * Events are delivered in the default widget event handlers,
     *   note that widget implementations must chain up on button, motion, touch and
     *   grab broken handlers for controllers in this phase to be run.
     */
    TARGET(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPropagationPhase";
    
    private final int value;
    PropagationPhase(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PropagationPhase of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> CAPTURE;
            case 2 -> BUBBLE;
            case 3 -> TARGET;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
