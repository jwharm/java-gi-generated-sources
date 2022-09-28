package org.gtk.gtk;

/**
 * Describes limits of a {@link EventController} for handling events
 * targeting other widgets.
 */
public class PropagationLimit extends io.github.jwharm.javagi.Enumeration {

    /**
     * Events are handled regardless of what their
     *   target is.
     */
    public static final PropagationLimit NONE = new PropagationLimit(0);
    
    /**
     * Events are only handled if their target
     *   is in the same {@code Native} as the event controllers widget. Note
     *   that some event types have two targets (origin and destination).
     */
    public static final PropagationLimit SAME_NATIVE = new PropagationLimit(1);
    
    public PropagationLimit(int value) {
        super(value);
    }
    
}
