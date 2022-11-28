package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of seek events. When constructing a seek event with
 * gst_event_new_seek() or when doing gst_segment_do_seek ().
 */
public class SeekType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstSeekType";
    
    /**
     * no change in position is required
     */
    public static final SeekType NONE = new SeekType(0);
    
    /**
     * absolute position is requested
     */
    public static final SeekType SET = new SeekType(1);
    
    /**
     * relative position to duration is requested
     */
    public static final SeekType END = new SeekType(2);
    
    public SeekType(int value) {
        super(value);
    }
}
