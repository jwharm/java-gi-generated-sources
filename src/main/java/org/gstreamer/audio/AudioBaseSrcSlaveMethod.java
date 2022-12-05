package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different possible clock slaving algorithms when the internal audio clock was
 * not selected as the pipeline clock.
 */
public enum AudioBaseSrcSlaveMethod implements io.github.jwharm.javagi.Enumeration {
    /**
     * Resample to match the master clock.
     */
    RESAMPLE(0),
    /**
     * Retimestamp output buffers with master
     * clock time.
     */
    RE_TIMESTAMP(1),
    /**
     * Adjust capture pointer when master clock
     * drifts too much.
     */
    SKEW(2),
    /**
     * No adjustment is done.
     */
    NONE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSrcSlaveMethod";
    
    private final int value;
    AudioBaseSrcSlaveMethod(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AudioBaseSrcSlaveMethod of(int value) {
        return switch (value) {
            case 0 -> RESAMPLE;
            case 1 -> RE_TIMESTAMP;
            case 2 -> SKEW;
            case 3 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
