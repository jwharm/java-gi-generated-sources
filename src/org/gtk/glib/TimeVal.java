package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a precise time, with seconds and microseconds.
 * <p>
 * Similar to the struct timeval returned by the {@code gettimeofday()}
 * UNIX system call.
 * <p>
 * GLib is attempting to unify around the use of 64-bit integers to
 * represent microsecond-precision time. As such, this type will be
 * removed from a future version of GLib. A consequence of using {@code glong} for
 * {@code tv_sec} is that on 32-bit systems {@code GTimeVal} is subject to the year 2038
 * problem.
 */
public class TimeVal extends io.github.jwharm.javagi.ResourceBase {

    public TimeVal(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TimeVal() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTimeVal.allocate(Interop.getAllocator()).address()));
    }
    
}
