package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Filter implements io.github.jwharm.javagi.Enumeration {
    
    FAST(0),
    
    GOOD(1),
    
    BEST(2),
    
    NEAREST(3),
    
    BILINEAR(4),
    
    GAUSSIAN(5);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_filter_t";
    
    private final int value;
    
    /**
     * Create a new Filter for the provided value
     * @param numeric value the enum value
     */
    Filter(int value) {
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
     * Create a new Filter for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Filter of(int value) {
        return switch (value) {
            case 0 -> FAST;
            case 1 -> GOOD;
            case 2 -> BEST;
            case 3 -> NEAREST;
            case 4 -> BILINEAR;
            case 5 -> GAUSSIAN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
