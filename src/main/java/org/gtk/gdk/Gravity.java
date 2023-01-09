package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the reference point of a surface and is used in {@code GdkPopupLayout}.
 */
public enum Gravity implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the reference point is at the top left corner.
     */
    NORTH_WEST(1),
    
    /**
     * the reference point is in the middle of the top edge.
     */
    NORTH(2),
    
    /**
     * the reference point is at the top right corner.
     */
    NORTH_EAST(3),
    
    /**
     * the reference point is at the middle of the left edge.
     */
    WEST(4),
    
    /**
     * the reference point is at the center of the surface.
     */
    CENTER(5),
    
    /**
     * the reference point is at the middle of the right edge.
     */
    EAST(6),
    
    /**
     * the reference point is at the lower left corner.
     */
    SOUTH_WEST(7),
    
    /**
     * the reference point is at the middle of the lower edge.
     */
    SOUTH(8),
    
    /**
     * the reference point is at the lower right corner.
     */
    SOUTH_EAST(9),
    
    /**
     * the reference point is at the top left corner of the
     *  surface itself, ignoring window manager decorations.
     */
    STATIC(10);
    
    private static final java.lang.String C_TYPE_NAME = "GdkGravity";
    
    private final int value;
    
    /**
     * Create a new Gravity for the provided value
     * @param numeric value the enum value
     */
    Gravity(int value) {
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
     * Create a new Gravity for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Gravity of(int value) {
        return switch (value) {
            case 1 -> NORTH_WEST;
            case 2 -> NORTH;
            case 3 -> NORTH_EAST;
            case 4 -> WEST;
            case 5 -> CENTER;
            case 6 -> EAST;
            case 7 -> SOUTH_WEST;
            case 8 -> SOUTH;
            case 9 -> SOUTH_EAST;
            case 10 -> STATIC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
