package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The subsong mode defines how the decoder shall handle subsongs.
 */
public enum NonstreamAudioSubsongMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Only the current subsong is played
     */
    SINGLE(0),
    
    /**
     * All subsongs are played (current subsong index is ignored)
     */
    ALL(1),
    
    /**
     * Use decoder specific default behavior
     */
    DECODER_DEFAULT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstNonstreamAudioSubsongMode";
    
    private final int value;
    
    /**
     * Create a new NonstreamAudioSubsongMode for the provided value
     * @param numeric value the enum value
     */
    NonstreamAudioSubsongMode(int value) {
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
     * Create a new NonstreamAudioSubsongMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NonstreamAudioSubsongMode of(int value) {
        return switch (value) {
            case 0 -> SINGLE;
            case 1 -> ALL;
            case 2 -> DECODER_DEFAULT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
