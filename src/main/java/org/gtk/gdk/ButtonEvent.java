package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a button on a pointer device.
 */
public class ButtonEvent extends Event {

    public ButtonEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ButtonEvent */
    public static ButtonEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ButtonEvent(gobject.getReference());
    }
    
    /**
     * Extract the button number from a button event.
     */
    public int getButton() {
        var RESULT = gtk_h.gdk_button_event_get_button(handle());
        return RESULT;
    }
    
}
