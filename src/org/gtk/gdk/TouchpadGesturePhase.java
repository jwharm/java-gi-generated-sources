package org.gtk.gdk;

/**
 * Specifies the current state of a touchpad gesture.
 * <p>
 * All gestures are guaranteed to begin with an event with phase
 * {@link TouchpadGesturePhase#BEGIN}, followed by 0 or several events
 * with phase {@link TouchpadGesturePhase#UPDATE}.
 * <p>
 * A finished gesture may have 2 possible outcomes, an event with phase
 * {@link TouchpadGesturePhase#END} will be emitted when the gesture is
 * considered successful, this should be used as the hint to perform any
 * permanent changes.
 * <p>
 * Cancelled gestures may be so for a variety of reasons, due to hardware
 * or the compositor, or due to the gesture recognition layers hinting the
 * gesture did not finish resolutely (eg. a 3rd finger being added during
 * a pinch gesture). In these cases, the last event will report the phase
 * {@link TouchpadGesturePhase#CANCEL}, this should be used as a hint
 * to undo any visible/permanent changes that were done throughout the
 * progress of the gesture.
 */
public class TouchpadGesturePhase {

    /**
     * The gesture has begun.
     */
    public static final TouchpadGesturePhase BEGIN = new TouchpadGesturePhase(0);
    
    /**
     * The gesture has been updated.
     */
    public static final TouchpadGesturePhase UPDATE = new TouchpadGesturePhase(1);
    
    /**
     * The gesture was finished, changes
     *   should be permanently applied.
     */
    public static final TouchpadGesturePhase END = new TouchpadGesturePhase(2);
    
    /**
     * The gesture was cancelled, all
     *   changes should be undone.
     */
    public static final TouchpadGesturePhase CANCEL = new TouchpadGesturePhase(3);
    
    private int value;
    
    public TouchpadGesturePhase(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TouchpadGesturePhase[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
