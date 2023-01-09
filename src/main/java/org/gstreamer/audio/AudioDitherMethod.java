package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Set of available dithering methods.
 */
public enum AudioDitherMethod implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No dithering
     */
    NONE(0),
    
    /**
     * Rectangular dithering
     */
    RPDF(1),
    
    /**
     * Triangular dithering (default)
     */
    TPDF(2),
    
    /**
     * High frequency triangular dithering
     */
    TPDF_HF(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioDitherMethod";
    
    private final int value;
    
    /**
     * Create a new AudioDitherMethod for the provided value
     * @param numeric value the enum value
     */
    AudioDitherMethod(int value) {
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
     * Create a new AudioDitherMethod for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioDitherMethod of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> RPDF;
            case 2 -> TPDF;
            case 3 -> TPDF_HF;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
