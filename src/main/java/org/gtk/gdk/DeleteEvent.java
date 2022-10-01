package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to closing a top-level surface.
 */
public class DeleteEvent extends Event {

    public DeleteEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DeleteEvent */
    public static DeleteEvent castFrom(org.gtk.gobject.Object gobject) {
        return new DeleteEvent(gobject.getReference());
    }
    
}
