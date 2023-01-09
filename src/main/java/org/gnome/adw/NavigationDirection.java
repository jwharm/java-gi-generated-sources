package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the direction of a swipe navigation gesture.
 * @version 1.0
 */
public enum NavigationDirection implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Corresponds to start or top, depending on orientation and text direction
     */
    BACK(0),
    
    /**
     * Corresponds to end or bottom, depending on orientation and text direction
     */
    FORWARD(1);
    
    private static final java.lang.String C_TYPE_NAME = "AdwNavigationDirection";
    
    private final int value;
    
    /**
     * Create a new NavigationDirection for the provided value
     * @param numeric value the enum value
     */
    NavigationDirection(int value) {
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
     * Create a new NavigationDirection for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NavigationDirection of(int value) {
        return switch (value) {
            case 0 -> BACK;
            case 1 -> FORWARD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
