package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of buffering methods.
 */
public enum BufferingMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * a small amount of data is buffered
     */
    STREAM(0),
    
    /**
     * the stream is being downloaded
     */
    DOWNLOAD(1),
    
    /**
     * the stream is being downloaded in a ringbuffer
     */
    TIMESHIFT(2),
    
    /**
     * the stream is a live stream
     */
    LIVE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferingMode";
    
    private final int value;
    
    /**
     * Create a new BufferingMode for the provided value
     * @param numeric value the enum value
     */
    BufferingMode(int value) {
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
     * Create a new BufferingMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static BufferingMode of(int value) {
        return switch (value) {
            case 0 -> STREAM;
            case 1 -> DOWNLOAD;
            case 2 -> TIMESHIFT;
            case 3 -> LIVE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
