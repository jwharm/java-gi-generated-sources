package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different possible clock slaving algorithms used when the internal audio
 * clock is not selected as the pipeline master clock.
 */
public enum AudioBaseSinkSlaveMethod implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Resample to match the master clock
     */
    RESAMPLE(0),
    
    /**
     * Adjust playout pointer when master clock
     * drifts too much.
     */
    SKEW(1),
    
    /**
     * No adjustment is done.
     */
    NONE(2),
    
    /**
     * Use custom clock slaving algorithm (Since: 1.6)
     */
    CUSTOM(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSinkSlaveMethod";
    
    private final int value;
    
    /**
     * Create a new AudioBaseSinkSlaveMethod for the provided value
     * @param numeric value the enum value
     */
    AudioBaseSinkSlaveMethod(int value) {
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
     * Create a new AudioBaseSinkSlaveMethod for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioBaseSinkSlaveMethod of(int value) {
        return switch (value) {
            case 0 -> RESAMPLE;
            case 1 -> SKEW;
            case 2 -> NONE;
            case 3 -> CUSTOM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
