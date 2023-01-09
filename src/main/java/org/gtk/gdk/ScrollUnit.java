package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the unit of scroll deltas.
 * <p>
 * When you get {@link ScrollUnit#WHEEL}, a delta of 1.0 means 1 wheel detent
 * click in the south direction, 2.0 means 2 wheel detent clicks in the south
 * direction... This is the same logic for negative values but in the north
 * direction.
 * <p>
 * If you get {@link ScrollUnit#SURFACE}, are managing a scrollable view and get a
 * value of 123, you have to scroll 123 surface logical pixels right if it's
 * {@code delta_x} or down if it's {@code delta_y}. This is the same logic for negative values
 * but you have to scroll left instead of right if it's {@code delta_x} and up instead
 * of down if it's {@code delta_y}.
 * <p>
 * 1 surface logical pixel is equal to 1 real screen pixel multiplied by the
 * final scale factor of your graphical interface (the product of the desktop
 * scale factor and eventually a custom scale factor in your app).
 * @version 4.8
 */
public enum ScrollUnit implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The delta is in number of wheel clicks.
     */
    WHEEL(0),
    
    /**
     * The delta is in surface pixels to scroll directly
     *   on screen.
     */
    SURFACE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GdkScrollUnit";
    
    private final int value;
    
    /**
     * Create a new ScrollUnit for the provided value
     * @param numeric value the enum value
     */
    ScrollUnit(int value) {
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
     * Create a new ScrollUnit for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ScrollUnit of(int value) {
        return switch (value) {
            case 0 -> WHEEL;
            case 1 -> SURFACE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
