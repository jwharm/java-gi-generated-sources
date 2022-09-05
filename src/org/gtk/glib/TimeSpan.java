package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A value representing an interval of time, in microseconds.
 */
public class TimeSpan {

    private final long value;
    
    public TimeSpan(long value) {
        this.value = value;
    }
    
    public long getValue() {
        return this.value;
    }
    
}
