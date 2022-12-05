package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PatternType implements io.github.jwharm.javagi.Enumeration {
    SOLID(0),
    SURFACE(1),
    LINEAR(2),
    RADIAL(3),
    MESH(4),
    RASTER_SOURCE(5);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_pattern_type_t";
    
    private final int value;
    PatternType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PatternType of(int value) {
        return switch (value) {
            case 0 -> SOLID;
            case 1 -> SURFACE;
            case 2 -> LINEAR;
            case 3 -> RADIAL;
            case 4 -> MESH;
            case 5 -> RASTER_SOURCE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
