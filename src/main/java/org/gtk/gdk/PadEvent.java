package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a pad-based device.
 */
public class PadEvent extends Event {

    public PadEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PadEvent */
    public static PadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new PadEvent(gobject.getReference());
    }
    
    /**
     * Extracts the information from a pad strip or ring event.
     */
    public void getAxisValue(PointerInteger index, PointerDouble value) {
        gtk_h.gdk_pad_event_get_axis_value(handle(), index.handle(), value.handle());
    }
    
    /**
     * Extracts information about the pressed button from
     * a pad event.
     */
    public int getButton() {
        var RESULT = gtk_h.gdk_pad_event_get_button(handle());
        return RESULT;
    }
    
    /**
     * Extracts group and mode information from a pad event.
     */
    public void getGroupMode(PointerInteger group, PointerInteger mode) {
        gtk_h.gdk_pad_event_get_group_mode(handle(), group.handle(), mode.handle());
    }
    
}
