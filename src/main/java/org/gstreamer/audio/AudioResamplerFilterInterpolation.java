package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different filter interpolation methods.
 * @version 1.10
 */
public enum AudioResamplerFilterInterpolation implements io.github.jwharm.javagi.Enumeration {
    /**
     * no interpolation
     */
    NONE(0),
    /**
     * linear interpolation of the
     *   filter coefficients.
     */
    LINEAR(1),
    /**
     * cubic interpolation of the
     *   filter coefficients.
     */
    CUBIC(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioResamplerFilterInterpolation";
    
    private final int value;
    AudioResamplerFilterInterpolation(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AudioResamplerFilterInterpolation of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> LINEAR;
            case 2 -> CUBIC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
