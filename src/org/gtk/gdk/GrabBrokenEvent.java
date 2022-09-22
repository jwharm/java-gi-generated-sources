package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a broken windowing system grab.
 */
public class GrabBrokenEvent extends Event {

    public GrabBrokenEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GrabBrokenEvent */
    public static GrabBrokenEvent castFrom(org.gtk.gobject.Object gobject) {
        return new GrabBrokenEvent(gobject.getReference());
    }
    
    /**
     * Extracts the grab surface from a grab broken event.
     */
    public Surface getGrabSurface() {
        var RESULT = gtk_h.gdk_grab_broken_event_get_grab_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the grab broken event is for an implicit grab.
     */
    public boolean getImplicit() {
        var RESULT = gtk_h.gdk_grab_broken_event_get_implicit(handle());
        return (RESULT != 0);
    }
    
}
