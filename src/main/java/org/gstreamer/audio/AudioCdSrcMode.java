package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Mode in which the CD audio source operates. Influences timestamping,
 * EOS handling and seeking.
 */
public enum AudioCdSrcMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * each single track is a stream
     */
    NORMAL(0),
    /**
     * the entire disc is a single stream
     */
    CONTINUOUS(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioCdSrcMode";
    
    private final int value;
    AudioCdSrcMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AudioCdSrcMode of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> CONTINUOUS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
