package org.gtk.gtk;

/**
 * Describes limits of a {@link [class@EventController]} for handling events
 * targeting other widgets.
 */
public enum PropagationLimit {

    /**
     * Events are handled regardless of what their
     *   target is.
     */
    NONE,
    
    /**
     * Events are only handled if their target
     *   is in the same {@link [iface@Native] (ref=iface)} as the event controllers widget. Note
     *   that some event types have two targets (origin and destination).
     */
    SAME_NATIVE;
    
    public static PropagationLimit fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> SAME_NATIVE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case SAME_NATIVE -> 1;
        };
    }

}
