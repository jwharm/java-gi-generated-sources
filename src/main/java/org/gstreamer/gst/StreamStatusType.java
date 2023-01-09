package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a {@link MessageType#STREAM_STATUS}. The stream status messages inform the
 * application of new streaming threads and their status.
 */
public enum StreamStatusType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * A new thread need to be created.
     */
    CREATE(0),
    
    /**
     * a thread entered its loop function
     */
    ENTER(1),
    
    /**
     * a thread left its loop function
     */
    LEAVE(2),
    
    /**
     * a thread is destroyed
     */
    DESTROY(3),
    
    /**
     * a thread is started
     */
    START(8),
    
    /**
     * a thread is paused
     */
    PAUSE(9),
    
    /**
     * a thread is stopped
     */
    STOP(10);
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamStatusType";
    
    private final int value;
    
    /**
     * Create a new StreamStatusType for the provided value
     * @param numeric value the enum value
     */
    StreamStatusType(int value) {
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
     * Create a new StreamStatusType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static StreamStatusType of(int value) {
        return switch (value) {
            case 0 -> CREATE;
            case 1 -> ENTER;
            case 2 -> LEAVE;
            case 3 -> DESTROY;
            case 8 -> START;
            case 9 -> PAUSE;
            case 10 -> STOP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
