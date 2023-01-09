package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents the orientation of widgets and other objects.
 * <p>
 * Typical examples are {@link Box}.
 */
public enum Orientation implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The element is in horizontal orientation.
     */
    HORIZONTAL(0),
    
    /**
     * The element is in vertical orientation.
     */
    VERTICAL(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkOrientation";
    
    private final int value;
    
    /**
     * Create a new Orientation for the provided value
     * @param numeric value the enum value
     */
    Orientation(int value) {
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
     * Create a new Orientation for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Orientation of(int value) {
        return switch (value) {
            case 0 -> HORIZONTAL;
            case 1 -> VERTICAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
