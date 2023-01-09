package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The values of the GtkSpinType enumeration are used to specify the
 * change to make in gtk_spin_button_spin().
 */
public enum SpinType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Increment by the adjustments step increment.
     */
    STEP_FORWARD(0),
    
    /**
     * Decrement by the adjustments step increment.
     */
    STEP_BACKWARD(1),
    
    /**
     * Increment by the adjustments page increment.
     */
    PAGE_FORWARD(2),
    
    /**
     * Decrement by the adjustments page increment.
     */
    PAGE_BACKWARD(3),
    
    /**
     * Go to the adjustments lower bound.
     */
    HOME(4),
    
    /**
     * Go to the adjustments upper bound.
     */
    END(5),
    
    /**
     * Change by a specified amount.
     */
    USER_DEFINED(6);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSpinType";
    
    private final int value;
    
    /**
     * Create a new SpinType for the provided value
     * @param numeric value the enum value
     */
    SpinType(int value) {
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
     * Create a new SpinType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SpinType of(int value) {
        return switch (value) {
            case 0 -> STEP_FORWARD;
            case 1 -> STEP_BACKWARD;
            case 2 -> PAGE_FORWARD;
            case 3 -> PAGE_BACKWARD;
            case 4 -> HOME;
            case 5 -> END;
            case 6 -> USER_DEFINED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
