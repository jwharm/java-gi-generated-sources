package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum FillRule implements io.github.jwharm.javagi.Enumeration {
    
    WINDING(0),
    
    EVEN_ODD(1);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_fill_rule_t";
    
    private final int value;
    
    /**
     * Create a new FillRule for the provided value
     * @param numeric value the enum value
     */
    FillRule(int value) {
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
     * Create a new FillRule for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FillRule of(int value) {
        return switch (value) {
            case 0 -> WINDING;
            case 1 -> EVEN_ODD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
