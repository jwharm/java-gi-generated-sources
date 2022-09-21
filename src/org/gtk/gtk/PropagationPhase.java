package org.gtk.gtk;

/**
 * Describes the stage at which events are fed into a {@link EventController}.
 */
public enum PropagationPhase {

    /**
     * Events are not delivered.
     */
    NONE,
    
    /**
     * Events are delivered in the capture phase. The
     *   capture phase happens before the bubble phase, runs from the toplevel down
     *   to the event widget. This option should only be used on containers that
     *   might possibly handle events before their children do.
     */
    CAPTURE,
    
    /**
     * Events are delivered in the bubble phase. The bubble
     *   phase happens after the capture phase, and before the default handlers
     *   are run. This phase runs from the event widget, up to the toplevel.
     */
    BUBBLE,
    
    /**
     * Events are delivered in the default widget event handlers,
     *   note that widget implementations must chain up on button, motion, touch and
     *   grab broken handlers for controllers in this phase to be run.
     */
    TARGET;
    
    public static PropagationPhase fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> CAPTURE;
            case 2 -> BUBBLE;
            case 3 -> TARGET;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case CAPTURE -> 1;
            case BUBBLE -> 2;
            case TARGET -> 3;
        };
    }

}
