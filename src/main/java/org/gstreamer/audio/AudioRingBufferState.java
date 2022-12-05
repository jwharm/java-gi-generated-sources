package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The state of the ringbuffer.
 */
public enum AudioRingBufferState implements io.github.jwharm.javagi.Enumeration {
    /**
     * The ringbuffer is stopped
     */
    STOPPED(0),
    /**
     * The ringbuffer is paused
     */
    PAUSED(1),
    /**
     * The ringbuffer is started
     */
    STARTED(2),
    /**
     * The ringbuffer has encountered an
     *     error after it has been started, e.g. because the device was
     *     disconnected (Since: 1.2)
     */
    ERROR(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioRingBufferState";
    
    private final int value;
    AudioRingBufferState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AudioRingBufferState of(int value) {
        return switch (value) {
            case 0 -> STOPPED;
            case 1 -> PAUSED;
            case 2 -> STARTED;
            case 3 -> ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
