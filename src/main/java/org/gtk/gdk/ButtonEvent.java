package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_button_event_get_button = Interop.downcallHandle(
        "gdk_button_event_get_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extract the button number from a button event.
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) gdk_button_event_get_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
