package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a touch-based device.
 */
public class TouchEvent extends Event {

    public TouchEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TouchEvent */
    public static TouchEvent castFrom(org.gtk.gobject.Object gobject) {
        return new TouchEvent(gobject.getReference());
    }
    
    /**
     * Extracts whether a touch event is emulating a pointer event.
     */
    public boolean getEmulatingPointer() {
        var RESULT = gtk_h.gdk_touch_event_get_emulating_pointer(handle());
        return (RESULT != 0);
    }
    
}
