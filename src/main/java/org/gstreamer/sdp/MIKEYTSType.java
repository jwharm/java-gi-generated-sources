package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the timestamp type.
 */
public enum MIKEYTSType implements io.github.jwharm.javagi.Enumeration {
    /**
     * an NTP time in UTC timezone
     */
    NTP_UTC(0),
    /**
     * an NTP time
     */
    NTP(1),
    /**
     * a counter
     */
    COUNTER(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYTSType";
    
    private final int value;
    MIKEYTSType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MIKEYTSType of(int value) {
        return switch (value) {
            case 0 -> NTP_UTC;
            case 1 -> NTP;
            case 2 -> COUNTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
