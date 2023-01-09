package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum FontWeight implements io.github.jwharm.javagi.Enumeration {
    
    NORMAL(0),
    
    BOLD(1);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_font_weight_t";
    
    private final int value;
    
    /**
     * Create a new FontWeight for the provided value
     * @param numeric value the enum value
     */
    FontWeight(int value) {
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
     * Create a new FontWeight for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FontWeight of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> BOLD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
