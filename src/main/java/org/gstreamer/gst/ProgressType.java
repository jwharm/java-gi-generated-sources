package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a {@link MessageType#PROGRESS}. The progress messages inform the
 * application of the status of asynchronous tasks.
 */
public enum ProgressType implements io.github.jwharm.javagi.Enumeration {
    /**
     * A new task started.
     */
    START(0),
    /**
     * A task completed and a new one continues.
     */
    CONTINUE(1),
    /**
     * A task completed.
     */
    COMPLETE(2),
    /**
     * A task was canceled.
     */
    CANCELED(3),
    /**
     * A task caused an error. An error message is also
     *          posted on the bus.
     */
    ERROR(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstProgressType";
    
    private final int value;
    ProgressType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ProgressType of(int value) {
        return switch (value) {
            case 0 -> START;
            case 1 -> CONTINUE;
            case 2 -> COMPLETE;
            case 3 -> CANCELED;
            case 4 -> ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
