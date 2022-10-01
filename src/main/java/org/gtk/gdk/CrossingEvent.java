package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event caused by a pointing device moving between surfaces.
 */
public class CrossingEvent extends Event {

    public CrossingEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CrossingEvent */
    public static CrossingEvent castFrom(org.gtk.gobject.Object gobject) {
        return new CrossingEvent(gobject.refcounted());
    }
    
    /**
     * Extracts the notify detail from a crossing event.
     */
    public NotifyType getDetail() {
        var RESULT = gtk_h.gdk_crossing_event_get_detail(handle());
        return new NotifyType(RESULT);
    }
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     */
    public boolean getFocus() {
        var RESULT = gtk_h.gdk_crossing_event_get_focus(handle());
        return RESULT != 0;
    }
    
    /**
     * Extracts the crossing mode from a crossing event.
     */
    public CrossingMode getMode() {
        var RESULT = gtk_h.gdk_crossing_event_get_mode(handle());
        return new CrossingMode(RESULT);
    }
    
}
