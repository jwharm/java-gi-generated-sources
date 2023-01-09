package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Extend implements io.github.jwharm.javagi.Enumeration {
    
    NONE(0),
    
    REPEAT(1),
    
    REFLECT(2),
    
    PAD(3);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_extend_t";
    
    private final int value;
    
    /**
     * Create a new Extend for the provided value
     * @param numeric value the enum value
     */
    Extend(int value) {
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
     * Create a new Extend for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Extend of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> REPEAT;
            case 2 -> REFLECT;
            case 3 -> PAD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
