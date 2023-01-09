package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum HintMetrics implements io.github.jwharm.javagi.Enumeration {
    
    DEFAULT(0),
    
    OFF(1),
    
    ON(2);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_hint_metrics_t";
    
    private final int value;
    
    /**
     * Create a new HintMetrics for the provided value
     * @param numeric value the enum value
     */
    HintMetrics(int value) {
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
     * Create a new HintMetrics for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static HintMetrics of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> OFF;
            case 2 -> ON;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
