package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a pad-based device.
 */
public class PadEvent extends Event {

    public PadEvent(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PadEvent */
    public static PadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new PadEvent(gobject.getReference());
    }
    
    /**
     * Extracts information about the pressed button from
     * a pad event.
     */
    public int getButton() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pad_event_get_button(HANDLE());
        return RESULT;
    }
    
}
