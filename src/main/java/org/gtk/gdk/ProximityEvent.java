package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to the proximity of a tool to a device.
 */
public class ProximityEvent extends Event {

    public ProximityEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ProximityEvent */
    public static ProximityEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ProximityEvent(gobject.refcounted());
    }
    
}
