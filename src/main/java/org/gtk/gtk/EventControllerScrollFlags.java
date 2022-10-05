package org.gtk.gtk;

/**
 * Describes the behavior of a {@code GtkEventControllerScroll}.
 */
public class EventControllerScrollFlags extends io.github.jwharm.javagi.Bitfield {

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
    
}