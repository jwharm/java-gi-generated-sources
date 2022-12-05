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
    CableOuterFECScheme(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static CableOuterFECScheme of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> NONE;
            case 2 -> RS_204_188;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
