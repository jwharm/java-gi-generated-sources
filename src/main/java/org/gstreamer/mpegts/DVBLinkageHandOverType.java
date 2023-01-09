package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum DVBLinkageHandOverType implements io.github.jwharm.javagi.Enumeration {
    
    RESERVED(0),
    
    IDENTICAL(1),
    
    LOCAL_VARIATION(2),
    
    ASSOCIATED(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageHandOverType";
    
    private final int value;
    
    /**
     * Create a new DVBLinkageHandOverType for the provided value
     * @param numeric value the enum value
     */
    DVBLinkageHandOverType(int value) {
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
     * Create a new DVBLinkageHandOverType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DVBLinkageHandOverType of(int value) {
        return switch (value) {
            case 0 -> RESERVED;
            case 1 -> IDENTICAL;
            case 2 -> LOCAL_VARIATION;
            case 3 -> ASSOCIATED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
