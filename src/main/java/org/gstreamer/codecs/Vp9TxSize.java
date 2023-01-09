package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * TxSize: Specifies the transform size
 * @version 1.20
 */
public enum Vp9TxSize implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * 4x4
     */
    _4X4(0),
    
    /**
     * 8x8
     */
    _8X8(1),
    
    /**
     * 16x16
     */
    _16X16(2),
    
    /**
     * 32x32
     */
    _32X32(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9TxSize";
    
    private final int value;
    
    /**
     * Create a new Vp9TxSize for the provided value
     * @param numeric value the enum value
     */
    Vp9TxSize(int value) {
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
     * Create a new Vp9TxSize for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Vp9TxSize of(int value) {
        return switch (value) {
            case 0 -> _4X4;
            case 1 -> _8X8;
            case 2 -> _16X16;
            case 3 -> _32X32;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
