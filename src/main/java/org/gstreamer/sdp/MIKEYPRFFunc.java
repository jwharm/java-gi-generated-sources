package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The PRF function that has been/will be used for key derivation
 */
public enum MIKEYPRFFunc implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * MIKEY-1 PRF function
     */
    MIKEY_PRF_MIKEY_1(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPRFFunc";
    
    private final int value;
    
    /**
     * Create a new MIKEYPRFFunc for the provided value
     * @param numeric value the enum value
     */
    MIKEYPRFFunc(int value) {
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
     * Create a new MIKEYPRFFunc for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYPRFFunc of(int value) {
        return switch (value) {
            case 0 -> MIKEY_PRF_MIKEY_1;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
