package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TerrestrialTransmissionMode implements io.github.jwharm.javagi.Enumeration {
    
    _2K(0),
    
    _8K(1),
    
    AUTO(2),
    
    _4K(3),
    
    _1K(4),
    
    _16K(5),
    
    _32K(6),
    
    C1(7),
    
    C3780(8);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsTerrestrialTransmissionMode";
    
    private final int value;
    
    /**
     * Create a new TerrestrialTransmissionMode for the provided value
     * @param numeric value the enum value
     */
    TerrestrialTransmissionMode(int value) {
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
     * Create a new TerrestrialTransmissionMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TerrestrialTransmissionMode of(int value) {
        return switch (value) {
            case 0 -> _2K;
            case 1 -> _8K;
            case 2 -> AUTO;
            case 3 -> _4K;
            case 4 -> _1K;
            case 5 -> _16K;
            case 6 -> _32K;
            case 7 -> C1;
            case 8 -> C3780;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
