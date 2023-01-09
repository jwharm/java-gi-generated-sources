package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * TxMode: Specifies how the transform size is determined
 * @version 1.20
 */
public enum Vp9TxMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Only 4x4
     */
    ONLY_4X4(0),
    
    /**
     * Allow 8x8
     */
    ALLOW_8X8(1),
    
    /**
     * Allow 16x16
     */
    ALLOW_16X16(2),
    
    /**
     * Allow 32x32
     */
    ALLOW_32X32(3),
    
    /**
     * The choice is specified explicitly for each block
     */
    SELECT(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9TxMode";
    
    private final int value;
    
    /**
     * Create a new Vp9TxMode for the provided value
     * @param numeric value the enum value
     */
    Vp9TxMode(int value) {
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
     * Create a new Vp9TxMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Vp9TxMode of(int value) {
        return switch (value) {
            case 0 -> ONLY_4X4;
            case 1 -> ALLOW_8X8;
            case 2 -> ALLOW_16X16;
            case 3 -> ALLOW_32X32;
            case 4 -> SELECT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
