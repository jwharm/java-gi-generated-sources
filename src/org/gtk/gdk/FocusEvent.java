package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a keyboard focus change.
 */
public class FocusEvent extends Event {

    public FocusEvent(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FocusEvent */
    public static FocusEvent castFrom(org.gtk.gobject.Object gobject) {
        return new FocusEvent(gobject.getProxy());
    }
    
    /**
     * Extracts whether this event is about focus entering or
     * leaving the surface.
     */
    public boolean getIn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_focus_event_get_in(HANDLE());
        return (RESULT != 0);
    }
    
}
