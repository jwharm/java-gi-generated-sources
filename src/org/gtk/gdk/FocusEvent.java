package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a keyboard focus change.
 */
public class FocusEvent extends Event {

    public FocusEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FocusEvent */
    public static FocusEvent castFrom(org.gtk.gobject.Object gobject) {
        return new FocusEvent(gobject.getReference());
    }
    
    /**
     * Extracts whether this event is about focus entering or
     * leaving the surface.
     */
    public boolean getIn() {
        var RESULT = gtk_h.gdk_focus_event_get_in(handle());
        return RESULT != 0;
    }
    
}
