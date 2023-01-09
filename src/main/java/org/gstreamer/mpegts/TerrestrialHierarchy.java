package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TerrestrialHierarchy implements io.github.jwharm.javagi.Enumeration {
    
    NONE(0),
    
    _1(1),
    
    _2(2),
    
    _4(3),
    
    AUTO(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsTerrestrialHierarchy";
    
    private final int value;
    
    /**
     * Create a new TerrestrialHierarchy for the provided value
     * @param numeric value the enum value
     */
    TerrestrialHierarchy(int value) {
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
     * Create a new TerrestrialHierarchy for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TerrestrialHierarchy of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> _1;
            case 2 -> _2;
            case 3 -> _4;
            case 4 -> AUTO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
