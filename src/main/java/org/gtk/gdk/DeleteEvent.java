package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to closing a top-level surface.
 */
public class DeleteEvent extends Event {

    public DeleteEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DeleteEvent */
    public static DeleteEvent castFrom(org.gtk.gobject.Object gobject) {
        return new DeleteEvent(gobject.refcounted());
    }
    
}
