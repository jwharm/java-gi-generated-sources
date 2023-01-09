package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the panning direction of a {@link GesturePan}.
 */
public enum PanDirection implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * panned towards the left
     */
    LEFT(0),
    
    /**
     * panned towards the right
     */
    RIGHT(1),
    
    /**
     * panned upwards
     */
    UP(2),
    
    /**
     * panned downwards
     */
    DOWN(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPanDirection";
    
    private final int value;
    
    /**
     * Create a new PanDirection for the provided value
     * @param numeric value the enum value
     */
    PanDirection(int value) {
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
     * Create a new PanDirection for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PanDirection of(int value) {
        return switch (value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> UP;
            case 3 -> DOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
