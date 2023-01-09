package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 * <p>
 * See {@link SpinButton#setUpdatePolicy}.
 */
public enum SpinButtonUpdatePolicy implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * When refreshing your {@code GtkSpinButton}, the value is
     *   always displayed
     */
    ALWAYS(0),
    
    /**
     * When refreshing your {@code GtkSpinButton}, the value is
     *   only displayed if it is valid within the bounds of the spin button's
     *   adjustment
     */
    IF_VALID(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSpinButtonUpdatePolicy";
    
    private final int value;
    
    /**
     * Create a new SpinButtonUpdatePolicy for the provided value
     * @param numeric value the enum value
     */
    SpinButtonUpdatePolicy(int value) {
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
     * Create a new SpinButtonUpdatePolicy for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SpinButtonUpdatePolicy of(int value) {
        return switch (value) {
            case 0 -> ALWAYS;
            case 1 -> IF_VALID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
