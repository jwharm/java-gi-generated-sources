package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Types of navigation interface queries.
 */
public enum NavigationQueryType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * invalid query
     */
    INVALID(0),
    
    /**
     * command query
     */
    COMMANDS(1),
    
    /**
     * viewing angle query
     */
    ANGLES(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstNavigationQueryType";
    
    private final int value;
    
    /**
     * Create a new NavigationQueryType for the provided value
     * @param numeric value the enum value
     */
    NavigationQueryType(int value) {
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
     * Create a new NavigationQueryType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NavigationQueryType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> COMMANDS;
            case 2 -> ANGLES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
