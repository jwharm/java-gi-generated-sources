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
    BufferingMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
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
