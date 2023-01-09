package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines the direction of a sort.
 */
public enum SortType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Sorting is in ascending order.
     */
    ASCENDING(0),
    
    /**
     * Sorting is in descending order.
     */
    DESCENDING(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSortType";
    
    private final int value;
    
    /**
     * Create a new SortType for the provided value
     * @param numeric value the enum value
     */
    SortType(int value) {
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
     * Create a new SortType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SortType of(int value) {
        return switch (value) {
            case 0 -> ASCENDING;
            case 1 -> DESCENDING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
