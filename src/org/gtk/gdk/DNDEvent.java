package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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
     * Gets the <code>GdkDrop</code> object from a DND event.
     */
    public Drop getDrop() {
        var RESULT = gtk_h.gdk_dnd_event_get_drop(handle());
        return new Drop(References.get(RESULT, false));
    }
    
}
