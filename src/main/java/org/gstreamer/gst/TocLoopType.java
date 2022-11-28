package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * How a {@link TocEntry} should be repeated. By default, entries are played a
 * single time.
 * @version 1.4
 */
public class TocLoopType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTocLoopType";
    
    /**
     * single forward playback
     */
    public static final TocLoopType NONE = new TocLoopType(0);
    
    /**
     * repeat forward
     */
    public static final TocLoopType FORWARD = new TocLoopType(1);
    
    /**
     * repeat backward
     */
    public static final TocLoopType REVERSE = new TocLoopType(2);
    
    /**
     * repeat forward and backward
     */
    public static final TocLoopType PING_PONG = new TocLoopType(3);
    
    public TocLoopType(int value) {
        super(value);
    }
}
