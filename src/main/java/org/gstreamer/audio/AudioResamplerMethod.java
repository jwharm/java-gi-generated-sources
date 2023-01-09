package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different subsampling and upsampling methods
 * @version 1.10
 */
public enum AudioResamplerMethod implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Duplicates the samples when
     *    upsampling and drops when downsampling
     */
    NEAREST(0),
    
    /**
     * Uses linear interpolation to reconstruct
     *    missing samples and averaging to downsample
     */
    LINEAR(1),
    
    /**
     * Uses cubic interpolation
     */
    CUBIC(2),
    
    /**
     * Uses Blackman-Nuttall windowed sinc interpolation
     */
    BLACKMAN_NUTTALL(3),
    
    /**
     * Uses Kaiser windowed sinc interpolation
     */
    KAISER(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioResamplerMethod";
    
    private final int value;
    
    /**
     * Create a new AudioResamplerMethod for the provided value
     * @param numeric value the enum value
     */
    AudioResamplerMethod(int value) {
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
     * Create a new AudioResamplerMethod for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioResamplerMethod of(int value) {
        return switch (value) {
            case 0 -> NEAREST;
            case 1 -> LINEAR;
            case 2 -> CUBIC;
            case 3 -> BLACKMAN_NUTTALL;
            case 4 -> KAISER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
