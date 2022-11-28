package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A datatype to hold a time, measured in nanoseconds.
 */
public class ClockTime extends io.github.jwharm.javagi.Alias<Long> {
    
    public ClockTime(long value) {
        super(value);
    }
}
