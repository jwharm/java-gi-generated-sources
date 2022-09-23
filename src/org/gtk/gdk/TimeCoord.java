package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkTimeCoord} stores a single event in a motion history.
 */
public class TimeCoord extends io.github.jwharm.javagi.ResourceBase {

    public TimeCoord(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TimeCoord() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GdkTimeCoord.allocate(Interop.getAllocator()).address()));
    }
    
}
