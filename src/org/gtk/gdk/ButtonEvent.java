package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a button on a pointer device.
 */
public class ButtonEvent extends Event {

    public ButtonEvent(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ButtonEvent */
    public static ButtonEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ButtonEvent(gobject.getProxy());
    }
    
    /**
     * Extract the button number from a button event.
     */
    public int getButton() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_button_event_get_button(HANDLE());
        return RESULT;
    }
    
}