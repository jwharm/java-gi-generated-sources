package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum DVBScramblingModeType implements io.github.jwharm.javagi.Enumeration {
    
    RESERVED(0),
    
    CSA1(1),
    
    CSA2(2),
    
    CSA3_STANDARD(3),
    
    CSA3_MINIMAL_ENHANCED(4),
    
    CSA3_FULL_ENHANCED(5),
    
    CISSA(16),
    
    ATIS_0(112),
    
    ATIS_F(127);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBScramblingModeType";
    
    private final int value;
    
    /**
     * Create a new DVBScramblingModeType for the provided value
     * @param numeric value the enum value
     */
    DVBScramblingModeType(int value) {
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
     * Create a new DVBScramblingModeType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DVBScramblingModeType of(int value) {
        return switch (value) {
            case 0 -> RESERVED;
            case 1 -> CSA1;
            case 2 -> CSA2;
            case 3 -> CSA3_STANDARD;
            case 4 -> CSA3_MINIMAL_ENHANCED;
            case 5 -> CSA3_FULL_ENHANCED;
            case 16 -> CISSA;
            case 112 -> ATIS_0;
            case 127 -> ATIS_F;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
