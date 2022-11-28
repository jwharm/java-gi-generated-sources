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
public class TracerValueScope extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerValueScope";
    
    /**
     * the value is related to the process
     */
    public static final TracerValueScope PROCESS = new TracerValueScope(0);
    
    /**
     * the value is related to a thread
     */
    public static final TracerValueScope THREAD = new TracerValueScope(1);
    
    /**
     * the value is related to an {@link Element}
     */
    public static final TracerValueScope ELEMENT = new TracerValueScope(2);
    
    /**
     * the value is related to a {@link Pad}
     */
    public static final TracerValueScope PAD = new TracerValueScope(3);
    
    public TracerValueScope(int value) {
        super(value);
    }
}
