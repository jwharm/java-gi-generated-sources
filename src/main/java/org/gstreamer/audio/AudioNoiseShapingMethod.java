package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Set of available noise shaping methods
 */
public enum AudioNoiseShapingMethod implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No noise shaping (default)
     */
    NONE(0),
    
    /**
     * Error feedback
     */
    ERROR_FEEDBACK(1),
    
    /**
     * Simple 2-pole noise shaping
     */
    SIMPLE(2),
    
    /**
     * Medium 5-pole noise shaping
     */
    MEDIUM(3),
    
    /**
     * High 8-pole noise shaping
     */
    HIGH(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioNoiseShapingMethod";
    
    private final int value;
    
    /**
     * Create a new AudioNoiseShapingMethod for the provided value
     * @param numeric value the enum value
     */
    AudioNoiseShapingMethod(int value) {
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
     * Create a new AudioNoiseShapingMethod for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioNoiseShapingMethod of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ERROR_FEEDBACK;
            case 2 -> SIMPLE;
            case 3 -> MEDIUM;
            case 4 -> HIGH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
