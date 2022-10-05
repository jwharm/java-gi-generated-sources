package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a keyboard focus change.
 */
public class FocusEvent extends Event {

    public FocusEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FocusEvent */
    public static FocusEvent castFrom(org.gtk.gobject.Object gobject) {
        return new FocusEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_focus_event_get_in = Interop.downcallHandle(
        "gdk_focus_event_get_in",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts whether this event is about focus entering or
     * leaving the surface.
     */
    public boolean getIn() {
        try {
            var RESULT = (int) gdk_focus_event_get_in.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}