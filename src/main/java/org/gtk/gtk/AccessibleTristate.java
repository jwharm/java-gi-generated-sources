package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values for the {@link AccessibleState#PRESSED}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleTristate#FALSE} and
 * {@link AccessibleTristate#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public enum AccessibleTristate implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The state is {@code false}
     */
    FALSE(0),
    
    /**
     * The state is {@code true}
     */
    TRUE(1),
    
    /**
     * The state is {@code mixed}
     */
    MIXED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleTristate";
    
    private final int value;
    
    /**
     * Create a new AccessibleTristate for the provided value
     * @param numeric value the enum value
     */
    AccessibleTristate(int value) {
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
     * Create a new AccessibleTristate for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AccessibleTristate of(int value) {
        return switch (value) {
            case 0 -> FALSE;
            case 1 -> TRUE;
            case 2 -> MIXED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
