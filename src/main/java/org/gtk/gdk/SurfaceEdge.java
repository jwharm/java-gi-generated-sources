package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines a surface edge or corner.
 */
public enum SurfaceEdge implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the top left corner.
     */
    NORTH_WEST(0),
    
    /**
     * the top edge.
     */
    NORTH(1),
    
    /**
     * the top right corner.
     */
    NORTH_EAST(2),
    
    /**
     * the left edge.
     */
    WEST(3),
    
    /**
     * the right edge.
     */
    EAST(4),
    
    /**
     * the lower left corner.
     */
    SOUTH_WEST(5),
    
    /**
     * the lower edge.
     */
    SOUTH(6),
    
    /**
     * the lower right corner.
     */
    SOUTH_EAST(7);
    
    private static final java.lang.String C_TYPE_NAME = "GdkSurfaceEdge";
    
    private final int value;
    
    /**
     * Create a new SurfaceEdge for the provided value
     * @param numeric value the enum value
     */
    SurfaceEdge(int value) {
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
     * Create a new SurfaceEdge for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SurfaceEdge of(int value) {
        return switch (value) {
            case 0 -> NORTH_WEST;
            case 1 -> NORTH;
            case 2 -> NORTH_EAST;
            case 3 -> WEST;
            case 4 -> EAST;
            case 5 -> SOUTH_WEST;
            case 6 -> SOUTH;
            case 7 -> SOUTH_EAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
