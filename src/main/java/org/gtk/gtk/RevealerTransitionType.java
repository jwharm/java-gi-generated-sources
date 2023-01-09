package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These enumeration values describe the possible transitions
 * when the child of a {@code GtkRevealer} widget is shown or hidden.
 */
public enum RevealerTransitionType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No transition
     */
    NONE(0),
    
    /**
     * Fade in
     */
    CROSSFADE(1),
    
    /**
     * Slide in from the left
     */
    SLIDE_RIGHT(2),
    
    /**
     * Slide in from the right
     */
    SLIDE_LEFT(3),
    
    /**
     * Slide in from the bottom
     */
    SLIDE_UP(4),
    
    /**
     * Slide in from the top
     */
    SLIDE_DOWN(5),
    
    /**
     * Floop in from the left
     */
    SWING_RIGHT(6),
    
    /**
     * Floop in from the right
     */
    SWING_LEFT(7),
    
    /**
     * Floop in from the bottom
     */
    SWING_UP(8),
    
    /**
     * Floop in from the top
     */
    SWING_DOWN(9);
    
    private static final java.lang.String C_TYPE_NAME = "GtkRevealerTransitionType";
    
    private final int value;
    
    /**
     * Create a new RevealerTransitionType for the provided value
     * @param numeric value the enum value
     */
    RevealerTransitionType(int value) {
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
     * Create a new RevealerTransitionType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RevealerTransitionType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> CROSSFADE;
            case 2 -> SLIDE_RIGHT;
            case 3 -> SLIDE_LEFT;
            case 4 -> SLIDE_UP;
            case 5 -> SLIDE_DOWN;
            case 6 -> SWING_RIGHT;
            case 7 -> SWING_LEFT;
            case 8 -> SWING_UP;
            case 9 -> SWING_DOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
