package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a broken windowing system grab.
 */
public class GrabBrokenEvent extends Event {

    public GrabBrokenEvent(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GrabBrokenEvent */
    public static GrabBrokenEvent castFrom(org.gtk.gobject.Object gobject) {
        return new GrabBrokenEvent(gobject.getProxy());
    }
    
    /**
     * Extracts the grab surface from a grab broken event.
     */
    public Surface getGrabSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_grab_broken_event_get_grab_surface(HANDLE());
        return new Surface(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks whether the grab broken event is for an implicit grab.
     */
    public boolean getImplicit() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_grab_broken_event_get_implicit(HANDLE());
        return (RESULT != 0);
    }
    
}
