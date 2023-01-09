package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes which edge of a widget a certain feature is positioned at.
 * <p>
 * For examples, see the tabs of a {@link Notebook}, or the label
 * of a {@link Scale}.
 */
public enum PositionType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The feature is at the left edge.
     */
    LEFT(0),
    
    /**
     * The feature is at the right edge.
     */
    RIGHT(1),
    
    /**
     * The feature is at the top edge.
     */
    TOP(2),
    
    /**
     * The feature is at the bottom edge.
     */
    BOTTOM(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPositionType";
    
    private final int value;
    
    /**
     * Create a new PositionType for the provided value
     * @param numeric value the enum value
     */
    PositionType(int value) {
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
     * Create a new PositionType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PositionType of(int value) {
        return switch (value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> TOP;
            case 3 -> BOTTOM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
