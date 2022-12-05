package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Tracing record will contain fields that contain a measured value or extra
 * meta-data. One such meta data are values that tell where a measurement was
 * taken. This enumerating declares to which scope such a meta data field
 * relates to. If it is e.g. {@link TracerValueScope#PAD}, then each of the log
 * events may contain values for different {@code GstPads}.
 * @version 1.8
 */
public enum TracerValueScope implements io.github.jwharm.javagi.Enumeration {
    /**
     * the value is related to the process
     */
    PROCESS(0),
    /**
     * the value is related to a thread
     */
    THREAD(1),
    /**
     * the value is related to an {@link Element}
     */
    ELEMENT(2),
    /**
     * the value is related to a {@link Pad}
     */
    PAD(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerValueScope";
    
    private final int value;
    TracerValueScope(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TracerValueScope of(int value) {
        return switch (value) {
            case 0 -> PROCESS;
            case 1 -> THREAD;
            case 2 -> ELEMENT;
            case 3 -> PAD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
