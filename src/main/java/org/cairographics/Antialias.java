package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Antialias implements io.github.jwharm.javagi.Enumeration {
    
    DEFAULT(0),
    
    NONE(1),
    
    GRAY(2),
    
    SUBPIXEL(3),
    
    FAST(4),
    
    GOOD(5),
    
    BEST(6);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_antialias_t";
    
    private final int value;
    
    /**
     * Create a new Antialias for the provided value
     * @param numeric value the enum value
     */
    Antialias(int value) {
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
     * Create a new Antialias for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Antialias of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> NONE;
            case 2 -> GRAY;
            case 3 -> SUBPIXEL;
            case 4 -> FAST;
            case 5 -> GOOD;
            case 6 -> BEST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
