package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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
