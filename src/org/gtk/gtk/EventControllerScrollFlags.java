package org.gtk.gtk;

/**
 * Describes the behavior of a `GtkEventControllerScroll`.
 */
public class EventControllerScrollFlags {

    /**
     * Don't emit scroll.
     */
    public static final int NONE = 0;
    
    /**
     * Emit scroll with vertical deltas.
     */
    public static final int VERTICAL = 1;
    
    /**
     * Emit scroll with horizontal deltas.
     */
    public static final int HORIZONTAL = 2;
    
    /**
     * Only emit deltas that are multiples of 1.
     */
    public static final int DISCRETE = 4;
    
    /**
     * Emit ::decelerate after continuous scroll finishes.
     */
    public static final int KINETIC = 8;
    
    /**
     * Emit scroll on both axes.
     */
    public static final int BOTH_AXES = 3;
    
}
