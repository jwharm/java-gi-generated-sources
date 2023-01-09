package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum AtscMGTTableType implements io.github.jwharm.javagi.Enumeration {
    
    EIT0(256),
    
    EIT127(383),
    
    ETT0(512),
    
    ETT127(639);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscMGTTableType";
    
    private final int value;
    
    /**
     * Create a new AtscMGTTableType for the provided value
     * @param numeric value the enum value
     */
    AtscMGTTableType(int value) {
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
     * Create a new AtscMGTTableType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AtscMGTTableType of(int value) {
        return switch (value) {
            case 256 -> EIT0;
            case 383 -> EIT127;
            case 512 -> ETT0;
            case 639 -> ETT127;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
