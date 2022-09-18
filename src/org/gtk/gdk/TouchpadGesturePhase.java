package org.gtk.gdk;

/**
 * Specifies the current state of a touchpad gesture.
 * 
 * All gestures are guaranteed to begin with an event with phase
 * {@link org.gtk.gdk.TouchpadGesturePhase<code>#BEGIN</code>   followed by 0 or several events
 * with phase {@link org.gtk.gdk.TouchpadGesturePhase<code>#UPDATE</code>  
 * 
 * A finished gesture may have 2 possible outcomes, an event with phase
 * {@link org.gtk.gdk.TouchpadGesturePhase<code>#END</code>  will be emitted when the gesture is
 * considered successful, this should be used as the hint to perform any
 * permanent changes.
 * 
 * Cancelled gestures may be so for a variety of reasons, due to hardware
 * or the compositor, or due to the gesture recognition layers hinting the
 * gesture did not finish resolutely (eg. a 3rd finger being added during
 * a pinch gesture). In these cases, the last event will report the phase
 * {@link org.gtk.gdk.TouchpadGesturePhase<code>#CANCEL</code>   this should be used as a hint
 * to undo any visible/permanent changes that were done throughout the
 * progress of the gesture.
 */
public enum TouchpadGesturePhase {

    /**
     * The gesture has begun.
     */
    BEGIN,
    
    /**
     * The gesture has been updated.
     */
    UPDATE,
    
    /**
     * The gesture was finished, changes
     *   should be permanently applied.
     */
    END,
    
    /**
     * The gesture was cancelled, all
     *   changes should be undone.
     */
    CANCEL;
    
    public static TouchpadGesturePhase fromValue(int value) {
        return switch(value) {
            case 0 -> BEGIN;
            case 1 -> UPDATE;
            case 2 -> END;
            case 3 -> CANCEL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BEGIN -> 0;
            case UPDATE -> 1;
            case END -> 2;
            case CANCEL -> 3;
        };
    }

}
