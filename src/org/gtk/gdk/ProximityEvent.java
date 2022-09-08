package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to the proximity of a tool to a device.
 */
public class ProximityEvent extends Event {

    public ProximityEvent(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ProximityEvent */
    public static ProximityEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ProximityEvent(gobject.getReference());
    }
    
}
