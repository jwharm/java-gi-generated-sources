package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These values correspond to the ones defined by SCTE (amongst other in ANSI/SCTE 57)
 * @version 1.20
 */
public enum SCTEDescriptorType implements io.github.jwharm.javagi.Enumeration {
    
    STUFFING(128),
    
    AC3(129),
    
    FRAME_RATE(130),
    
    EXTENDED_VIDEO(131),
    
    COMPONENT_NAME(132),
    
    FREQUENCY_SPEC(144),
    
    MODULATION_PARAMS(145),
    
    TRANSPORT_STREAM_ID(146);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTEDescriptorType";
    
    private final int value;
    
    /**
     * Create a new SCTEDescriptorType for the provided value
     * @param numeric value the enum value
     */
    SCTEDescriptorType(int value) {
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
     * Create a new SCTEDescriptorType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SCTEDescriptorType of(int value) {
        return switch (value) {
            case 128 -> STUFFING;
            case 129 -> AC3;
            case 130 -> FRAME_RATE;
            case 131 -> EXTENDED_VIDEO;
            case 132 -> COMPONENT_NAME;
            case 144 -> FREQUENCY_SPEC;
            case 145 -> MODULATION_PARAMS;
            case 146 -> TRANSPORT_STREAM_ID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
