package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum LineJoin implements io.github.jwharm.javagi.Enumeration {
    
    MITER(0),
    
    ROUND(1),
    
    BEVEL(2);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_line_join_t";
    
    private final int value;
    
    /**
     * Create a new LineJoin for the provided value
     * @param numeric value the enum value
     */
    LineJoin(int value) {
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
     * Create a new LineJoin for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static LineJoin of(int value) {
        return switch (value) {
            case 0 -> MITER;
            case 1 -> ROUND;
            case 2 -> BEVEL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
