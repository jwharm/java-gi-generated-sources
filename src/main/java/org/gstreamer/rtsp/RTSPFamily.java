package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible network families.
 */
public enum RTSPFamily implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown network family
     */
    NONE(0),
    /**
     * internet
     */
    INET(1),
    /**
     * internet V6
     */
    INET6(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPFamily";
    
    private final int value;
    RTSPFamily(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RTSPFamily of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> INET;
            case 2 -> INET6;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
