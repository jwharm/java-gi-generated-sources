package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a touch-based device.
 */
public class TouchEvent extends Event {

    public TouchEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TouchEvent */
    public static TouchEvent castFrom(org.gtk.gobject.Object gobject) {
        return new TouchEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_touch_event_get_emulating_pointer = Interop.downcallHandle(
        "gdk_touch_event_get_emulating_pointer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts whether a touch event is emulating a pointer event.
     */
    public boolean getEmulatingPointer() {
        try {
            var RESULT = (int) gdk_touch_event_get_emulating_pointer.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
