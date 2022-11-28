package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a {@link MessageType#STREAM_STATUS}. The stream status messages inform the
 * application of new streaming threads and their status.
 */
public class StreamStatusType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamStatusType";
    
    /**
     * A new thread need to be created.
     */
    public static final StreamStatusType CREATE = new StreamStatusType(0);
    
    /**
     * a thread entered its loop function
     */
    public static final StreamStatusType ENTER = new StreamStatusType(1);
    
    /**
     * a thread left its loop function
     */
    public static final StreamStatusType LEAVE = new StreamStatusType(2);
    
    /**
     * a thread is destroyed
     */
    public static final StreamStatusType DESTROY = new StreamStatusType(3);
    
    /**
     * a thread is started
     */
    public static final StreamStatusType START = new StreamStatusType(8);
    
    /**
     * a thread is paused
     */
    public static final StreamStatusType PAUSE = new StreamStatusType(9);
    
    /**
     * a thread is stopped
     */
    public static final StreamStatusType STOP = new StreamStatusType(10);
    
    public StreamStatusType(int value) {
        super(value);
    }
}
