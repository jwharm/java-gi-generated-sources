package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Select for the filter tables should be set up.
 * @version 1.10
 */
public enum AudioResamplerFilterMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Use interpolated filter tables. This
     *     uses less memory but more CPU and is slightly less accurate but it allows for more
     *     efficient variable rate resampling with gst_audio_resampler_update().
     */
    INTERPOLATED(0),
    
    /**
     * Use full filter table. This uses more memory
     *     but less CPU.
     */
    FULL(1),
    
    /**
     * Automatically choose between interpolated
     *     and full filter tables.
     */
    AUTO(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioResamplerFilterMode";
    
    private final int value;
    
    /**
     * Create a new AudioResamplerFilterMode for the provided value
     * @param numeric value the enum value
     */
    AudioResamplerFilterMode(int value) {
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
     * Create a new AudioResamplerFilterMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioResamplerFilterMode of(int value) {
        return switch (value) {
            case 0 -> INTERPOLATED;
            case 1 -> FULL;
            case 2 -> AUTO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
