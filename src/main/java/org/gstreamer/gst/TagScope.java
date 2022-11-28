package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstTagScope specifies if a taglist applies to the complete
 * medium or only to one single stream.
 */
public class TagScope extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTagScope";
    
    /**
     * tags specific to this single stream
     */
    public static final TagScope STREAM = new TagScope(0);
    
    /**
     * global tags for the complete medium
     */
    public static final TagScope GLOBAL = new TagScope(1);
    
    public TagScope(int value) {
        super(value);
    }
}
