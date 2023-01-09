package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TerrestrialGuardInterval implements io.github.jwharm.javagi.Enumeration {
    
    _1_32(0),
    
    _1_16(1),
    
    _1_8(2),
    
    _1_4(3),
    
    AUTO(4),
    
    _1_128(5),
    
    _19_128(6),
    
    _19_256(7),
    
    PN420(8),
    
    PN595(9),
    
    PN945(10);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsTerrestrialGuardInterval";
    
    private final int value;
    
    /**
     * Create a new TerrestrialGuardInterval for the provided value
     * @param numeric value the enum value
     */
    TerrestrialGuardInterval(int value) {
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
     * Create a new TerrestrialGuardInterval for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TerrestrialGuardInterval of(int value) {
        return switch (value) {
            case 0 -> _1_32;
            case 1 -> _1_16;
            case 2 -> _1_8;
            case 3 -> _1_4;
            case 4 -> AUTO;
            case 5 -> _1_128;
            case 6 -> _19_128;
            case 7 -> _19_256;
            case 8 -> PN420;
            case 9 -> PN595;
            case 10 -> PN945;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
