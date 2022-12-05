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
    RegionOverlap(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RegionOverlap of(int value) {
        return switch (value) {
            case 0 -> IN;
            case 1 -> OUT;
            case 2 -> PART;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
