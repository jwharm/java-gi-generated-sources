package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes transitions types of a {@link Flap} widget.
 * <p>
 * It determines the type of animation when transitioning between children in a
 * {@link Flap} widget, as well as which areas can be swiped via
 * {@code Flap:swipe-to-open] and [property@Flap:swipe-to-close}.
 * <p>
 * New values may be added to this enum over time.
 * @version 1.0
 */
public enum FlapTransitionType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The flap slides over the content, which is
     *   dimmed. When folded, only the flap can be swiped.
     */
    OVER(0),
    
    /**
     * The content slides over the flap. Only the
     *   content can be swiped.
     */
    UNDER(1),
    
    /**
     * The flap slides offscreen when hidden,
     *   neither the flap nor content overlap each other. Both widgets can be
     *   swiped.
     */
    SLIDE(2);
    
    private static final java.lang.String C_TYPE_NAME = "AdwFlapTransitionType";
    
    private final int value;
    
    /**
     * Create a new FlapTransitionType for the provided value
     * @param numeric value the enum value
     */
    FlapTransitionType(int value) {
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
     * Create a new FlapTransitionType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FlapTransitionType of(int value) {
        return switch (value) {
            case 0 -> OVER;
            case 1 -> UNDER;
            case 2 -> SLIDE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
