package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SatellitePolarizationType implements io.github.jwharm.javagi.Enumeration {
    LINEAR_HORIZONTAL(0),
    LINEAR_VERTICAL(1),
    CIRCULAR_LEFT(2),
    CIRCULAR_RIGHT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSatellitePolarizationType";
    
    private final int value;
    SatellitePolarizationType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SatellitePolarizationType of(int value) {
        return switch (value) {
            case 0 -> LINEAR_HORIZONTAL;
            case 1 -> LINEAR_VERTICAL;
            case 2 -> CIRCULAR_LEFT;
            case 3 -> CIRCULAR_RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
