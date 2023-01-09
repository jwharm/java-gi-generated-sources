package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SCTESpliceDescriptor implements io.github.jwharm.javagi.Enumeration {
    
    AVAIL(0),
    
    DTMF(1),
    
    SEGMENTATION(2),
    
    TIME(3),
    
    AUDIO(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTESpliceDescriptor";
    
    private final int value;
    
    /**
     * Create a new SCTESpliceDescriptor for the provided value
     * @param numeric value the enum value
     */
    SCTESpliceDescriptor(int value) {
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
     * Create a new SCTESpliceDescriptor for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SCTESpliceDescriptor of(int value) {
        return switch (value) {
            case 0 -> AVAIL;
            case 1 -> DTMF;
            case 2 -> SEGMENTATION;
            case 3 -> TIME;
            case 4 -> AUDIO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
