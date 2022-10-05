package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a button on a pointer device.
 */
public class ButtonEvent extends Event {

    public ButtonEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ButtonEvent */
    public static ButtonEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ButtonEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_button_event_get_button = Interop.downcallHandle(
        "gdk_button_event_get_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extract the button number from a button event.
     */
    public int getButton() {
        try {
            var RESULT = (int) gdk_button_event_get_button.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
