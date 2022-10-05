package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a pad-based device.
 */
public class PadEvent extends Event {

    public PadEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PadEvent */
    public static PadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new PadEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_pad_event_get_axis_value = Interop.downcallHandle(
        "gdk_pad_event_get_axis_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the information from a pad strip or ring event.
     */
    public void getAxisValue(PointerInteger index, PointerDouble value) {
        try {
            gdk_pad_event_get_axis_value.invokeExact(handle(), index.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pad_event_get_button = Interop.downcallHandle(
        "gdk_pad_event_get_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts information about the pressed button from
     * a pad event.
     */
    public int getButton() {
        try {
            var RESULT = (int) gdk_pad_event_get_button.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pad_event_get_group_mode = Interop.downcallHandle(
        "gdk_pad_event_get_group_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts group and mode information from a pad event.
     */
    public void getGroupMode(PointerInteger group, PointerInteger mode) {
        try {
            gdk_pad_event_get_group_mode.invokeExact(handle(), group.handle(), mode.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
