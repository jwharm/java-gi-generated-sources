package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The strength of a constraint, expressed as a symbolic constant.
 * <p>
 * The strength of a {@link Constraint} can be expressed with any positive
 * integer; the values of this enumeration can be used for readability.
 */
public enum ConstraintStrength implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The constraint is required towards solving the layout
     */
    REQUIRED(1001001000),
    
    /**
     * A strong constraint
     */
    STRONG(1000000000),
    
    /**
     * A medium constraint
     */
    MEDIUM(1000),
    
    /**
     * A weak constraint
     */
    WEAK(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintStrength";
    
    private final int value;
    
    /**
     * Create a new ConstraintStrength for the provided value
     * @param numeric value the enum value
     */
    ConstraintStrength(int value) {
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
     * Create a new ConstraintStrength for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ConstraintStrength of(int value) {
        return switch (value) {
            case 1001001000 -> REQUIRED;
            case 1000000000 -> STRONG;
            case 1000 -> MEDIUM;
            case 1 -> WEAK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
