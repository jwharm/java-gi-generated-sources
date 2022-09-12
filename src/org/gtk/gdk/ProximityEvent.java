package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to the proximity of a tool to a device.
 */
public class ProximityEvent extends Event {

    public ProximityEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ProximityEvent */
    public static ProximityEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ProximityEvent(gobject.getReference());
    }
    
}
