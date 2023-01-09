package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Iso639AudioType implements io.github.jwharm.javagi.Enumeration {
    
    UNDEFINED(0),
    
    CLEAN_EFFECTS(1),
    
    HEARING_IMPAIRED(2),
    
    VISUAL_IMPAIRED_COMMENTARY(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsIso639AudioType";
    
    private final int value;
    
    /**
     * Create a new Iso639AudioType for the provided value
     * @param numeric value the enum value
     */
    Iso639AudioType(int value) {
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
     * Create a new Iso639AudioType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Iso639AudioType of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> CLEAN_EFFECTS;
            case 2 -> HEARING_IMPAIRED;
            case 3 -> VISUAL_IMPAIRED_COMMENTARY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
