package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SatelliteRolloff implements io.github.jwharm.javagi.Enumeration {
    _35(0),
    _20(1),
    _25(2),
    RESERVED(3),
    AUTO(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSatelliteRolloff";
    
    private final int value;
    SatelliteRolloff(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SatelliteRolloff of(int value) {
        return switch (value) {
            case 0 -> _35;
            case 1 -> _20;
            case 2 -> _25;
            case 3 -> RESERVED;
            case 4 -> AUTO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
