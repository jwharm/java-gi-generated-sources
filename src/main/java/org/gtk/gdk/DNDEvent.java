package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to drag and drop operations.
 */
public class DNDEvent extends Event {

    public DNDEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DNDEvent */
    public static DNDEvent castFrom(org.gtk.gobject.Object gobject) {
        return new DNDEvent(gobject.getReference());
    }
    
    /**
     * Gets the {@code GdkDrop} object from a DND event.
     */
    public Drop getDrop() {
        var RESULT = gtk_h.gdk_dnd_event_get_drop(handle());
        return new Drop(References.get(RESULT, false));
    }
    
}
