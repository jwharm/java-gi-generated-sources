package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of key.
 */
public enum MIKEYKeyDataType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * a TEK Generation Key
     */
    TGK(0),
    
    /**
     * Traffic-Encrypting Key
     */
    TEK(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYKeyDataType";
    
    private final int value;
    
    /**
     * Create a new MIKEYKeyDataType for the provided value
     * @param numeric value the enum value
     */
    MIKEYKeyDataType(int value) {
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
     * Create a new MIKEYKeyDataType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYKeyDataType of(int value) {
        return switch (value) {
            case 0 -> TGK;
            case 2 -> TEK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
