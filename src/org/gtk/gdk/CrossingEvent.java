package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event caused by a pointing device moving between surfaces.
 */
public class CrossingEvent extends Event {

    public CrossingEvent(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CrossingEvent */
    public static CrossingEvent castFrom(org.gtk.gobject.Object gobject) {
        return new CrossingEvent(gobject.getProxy());
    }
    
    /**
     * Extracts the notify detail from a crossing event.
     */
    public NotifyType getDetail() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_crossing_event_get_detail(HANDLE());
        return NotifyType.fromValue(RESULT);
    }
    
    /**
     * Checks if the @event surface is the focus surface.
     */
    public boolean getFocus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_crossing_event_get_focus(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Extracts the crossing mode from a crossing event.
     */
    public CrossingMode getMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_crossing_event_get_mode(HANDLE());
        return CrossingMode.fromValue(RESULT);
    }
    
}
