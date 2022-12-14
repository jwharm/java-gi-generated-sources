package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different cache types
 */
public enum MIKEYCacheType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The envelope key MUST NOT be cached
     */
    NONE(0),
    
    /**
     * The envelope key MUST be cached
     */
    ALWAYS(1),
    
    /**
     * The envelope key MUST be cached, but only
     *                           to be used for the specific CSB.
     */
    FOR_CSB(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYCacheType";
    
    private final int value;
    
    /**
     * Create a new MIKEYCacheType for the provided value
     * @param numeric value the enum value
     */
    MIKEYCacheType(int value) {
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
     * Create a new MIKEYCacheType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYCacheType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ALWAYS;
            case 2 -> FOR_CSB;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
