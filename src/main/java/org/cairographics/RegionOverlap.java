package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum RegionOverlap implements io.github.jwharm.javagi.Enumeration {
    
    IN(0),
    
    OUT(1),
    
    PART(2);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_region_overlap_t";
    
    private final int value;
    
    /**
     * Create a new RegionOverlap for the provided value
     * @param numeric value the enum value
     */
    RegionOverlap(int value) {
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
     * Create a new RegionOverlap for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RegionOverlap of(int value) {
        return switch (value) {
            case 0 -> IN;
            case 1 -> OUT;
            case 2 -> PART;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
