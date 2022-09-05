package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to drag and drop operations.
 */
public class DNDEvent extends Event {

    public DNDEvent(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DNDEvent */
    public static DNDEvent castFrom(org.gtk.gobject.Object gobject) {
        return new DNDEvent(gobject.getProxy());
    }
    
    /**
     * Gets the `GdkDrop` object from a DND event.
     */
    public Drop getDrop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_dnd_event_get_drop(HANDLE());
        return new Drop(ProxyFactory.getProxy(RESULT, false));
    }
    
}
