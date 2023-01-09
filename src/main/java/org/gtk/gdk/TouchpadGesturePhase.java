package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public enum TouchpadGesturePhase implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The gesture has begun.
     */
    BEGIN(0),
    
    /**
     * The gesture has been updated.
     */
    UPDATE(1),
    
    /**
     * The gesture was finished, changes
     *   should be permanently applied.
     */
    END(2),
    
    /**
     * The gesture was cancelled, all
     *   changes should be undone.
     */
    CANCEL(3);
    
    private static final java.lang.String C_TYPE_NAME = "GdkTouchpadGesturePhase";
    
    private final int value;
    
    /**
     * Create a new TouchpadGesturePhase for the provided value
     * @param numeric value the enum value
     */
    TouchpadGesturePhase(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TouchpadGesturePhase for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TouchpadGesturePhase of(int value) {
        return switch (value) {
            case 0 -> BEGIN;
            case 1 -> UPDATE;
            case 2 -> END;
            case 3 -> CANCEL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
