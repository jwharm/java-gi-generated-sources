package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DebugColorMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugColorMode";
    
    /**
     * Do not use colors in logs.
     */
    public static final DebugColorMode OFF = new DebugColorMode(0);
    
    /**
     * Paint logs in a platform-specific way.
     */
    public static final DebugColorMode ON = new DebugColorMode(1);
    
    /**
     * Paint logs with UNIX terminal color codes
     *                             no matter what platform GStreamer is running on.
     */
    public static final DebugColorMode UNIX = new DebugColorMode(2);
    
    public DebugColorMode(int value) {
        super(value);
    }
}
