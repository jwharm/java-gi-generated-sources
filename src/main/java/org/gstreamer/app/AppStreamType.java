package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The stream type.
 */
public enum AppStreamType implements io.github.jwharm.javagi.Enumeration {
    /**
     * No seeking is supported in the stream, such as a
     * live stream.
     */
    STREAM(0),
    /**
     * The stream is seekable but seeking might not
     * be very fast, such as data from a webserver.
     */
    SEEKABLE(1),
    /**
     * The stream is seekable and seeking is fast,
     * such as in a local file.
     */
    RANDOM_ACCESS(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstAppStreamType";
    
    private final int value;
    AppStreamType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AppStreamType of(int value) {
        return switch (value) {
            case 0 -> STREAM;
            case 1 -> SEEKABLE;
            case 2 -> RANDOM_ACCESS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
