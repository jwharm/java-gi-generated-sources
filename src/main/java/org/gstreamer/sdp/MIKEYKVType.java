package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The key validity type
 */
public enum MIKEYKVType implements io.github.jwharm.javagi.Enumeration {
    /**
     * No specific usage rule
     */
    NULL(0),
    /**
     * The key is associated with the SPI/MKI
     */
    SPI(1),
    /**
     * The key has a start and expiration time
     */
    INTERVAL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYKVType";
    
    private final int value;
    MIKEYKVType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MIKEYKVType of(int value) {
        return switch (value) {
            case 0 -> NULL;
            case 1 -> SPI;
            case 2 -> INTERVAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
