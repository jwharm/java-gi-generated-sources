package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different possible reasons for discontinuities. This enum is useful for the custom
 * slave method.
 * @version 1.6
 */
public enum AudioBaseSinkDiscontReason implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No discontinuity occurred
     */
    NO_DISCONT(0),
    
    /**
     * New caps are set, causing renegotiotion
     */
    NEW_CAPS(1),
    
    /**
     * Samples have been flushed
     */
    FLUSH(2),
    
    /**
     * Sink was synchronized to the estimated latency (occurs during initialization)
     */
    SYNC_LATENCY(3),
    
    /**
     * Aligning buffers failed because the timestamps are too discontinuous
     */
    ALIGNMENT(4),
    
    /**
     * Audio output device experienced and recovered from an error but introduced latency in the process (see also gst_audio_base_sink_report_device_failure())
     */
    DEVICE_FAILURE(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSinkDiscontReason";
    
    private final int value;
    
    /**
     * Create a new AudioBaseSinkDiscontReason for the provided value
     * @param numeric value the enum value
     */
    AudioBaseSinkDiscontReason(int value) {
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
     * Create a new AudioBaseSinkDiscontReason for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioBaseSinkDiscontReason of(int value) {
        return switch (value) {
            case 0 -> NO_DISCONT;
            case 1 -> NEW_CAPS;
            case 2 -> FLUSH;
            case 3 -> SYNC_LATENCY;
            case 4 -> ALIGNMENT;
            case 5 -> DEVICE_FAILURE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
