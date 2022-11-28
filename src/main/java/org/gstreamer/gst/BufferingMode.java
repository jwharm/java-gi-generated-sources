package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of buffering methods.
 */
public class BufferingMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferingMode";
    
    /**
     * a small amount of data is buffered
     */
    public static final BufferingMode STREAM = new BufferingMode(0);
    
    /**
     * the stream is being downloaded
     */
    public static final BufferingMode DOWNLOAD = new BufferingMode(1);
    
    /**
     * the stream is being downloaded in a ringbuffer
     */
    public static final BufferingMode TIMESHIFT = new BufferingMode(2);
    
    /**
     * the stream is a live stream
     */
    public static final BufferingMode LIVE = new BufferingMode(3);
    
    public BufferingMode(int value) {
        super(value);
    }
}
