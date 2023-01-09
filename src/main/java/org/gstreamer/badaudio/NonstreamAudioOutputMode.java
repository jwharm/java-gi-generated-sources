package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The output mode defines how the output behaves with regards to looping. Either the playback position is
 * moved back to the beginning of the loop, acting like a backwards seek, or it increases steadily, as if
 * loop were "unrolled".
 */
public enum NonstreamAudioOutputMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Playback position is moved back to the beginning of the loop
     */
    LOOPING(0),
    
    /**
     * Playback position increases steadily, even when looping
     */
    STEADY(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstNonstreamAudioOutputMode";
    
    private final int value;
    
    /**
     * Create a new NonstreamAudioOutputMode for the provided value
     * @param numeric value the enum value
     */
    NonstreamAudioOutputMode(int value) {
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
     * Create a new NonstreamAudioOutputMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NonstreamAudioOutputMode of(int value) {
        return switch (value) {
            case 0 -> LOOPING;
            case 1 -> STEADY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
