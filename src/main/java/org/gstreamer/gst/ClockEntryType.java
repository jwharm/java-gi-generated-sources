package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the clock entry
 */
public class ClockEntryType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstClockEntryType";
    
    /**
     * a single shot timeout
     */
    public static final ClockEntryType SINGLE = new ClockEntryType(0);
    
    /**
     * a periodic timeout request
     */
    public static final ClockEntryType PERIODIC = new ClockEntryType(1);
    
    public ClockEntryType(int value) {
        super(value);
    }
}
