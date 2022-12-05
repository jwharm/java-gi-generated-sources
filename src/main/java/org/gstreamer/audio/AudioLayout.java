package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Layout of the audio samples for the different channels.
 */
public enum AudioLayout implements io.github.jwharm.javagi.Enumeration {
    /**
     * interleaved audio
     */
    INTERLEAVED(0),
    /**
     * non-interleaved audio
     */
    NON_INTERLEAVED(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioLayout";
    
    private final int value;
    AudioLayout(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AudioLayout of(int value) {
        return switch (value) {
            case 0 -> INTERLEAVED;
            case 1 -> NON_INTERLEAVED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
