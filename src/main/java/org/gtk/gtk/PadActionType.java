package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a pad action.
 */
public enum PadActionType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Action is triggered by a pad button
     */
    BUTTON(0),
    
    /**
     * Action is triggered by a pad ring
     */
    RING(1),
    
    /**
     * Action is triggered by a pad strip
     */
    STRIP(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPadActionType";
    
    private final int value;
    
    /**
     * Create a new PadActionType for the provided value
     * @param numeric value the enum value
     */
    PadActionType(int value) {
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
     * Create a new PadActionType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PadActionType of(int value) {
        return switch (value) {
            case 0 -> BUTTON;
            case 1 -> RING;
            case 2 -> STRIP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
