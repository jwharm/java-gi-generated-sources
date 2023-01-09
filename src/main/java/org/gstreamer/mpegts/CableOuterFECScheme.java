package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum CableOuterFECScheme implements io.github.jwharm.javagi.Enumeration {
    
    UNDEFINED(0),
    
    NONE(1),
    
    RS_204_188(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsCableOuterFECScheme";
    
    private final int value;
    
    /**
     * Create a new CableOuterFECScheme for the provided value
     * @param numeric value the enum value
     */
    CableOuterFECScheme(int value) {
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
     * Create a new CableOuterFECScheme for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CableOuterFECScheme of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> NONE;
            case 2 -> RS_204_188;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
