package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a broken windowing system grab.
 */
public class GrabBrokenEvent extends Event {

    public GrabBrokenEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GrabBrokenEvent */
    public static GrabBrokenEvent castFrom(org.gtk.gobject.Object gobject) {
        return new GrabBrokenEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_grab_broken_event_get_grab_surface = Interop.downcallHandle(
        "gdk_grab_broken_event_get_grab_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the grab surface from a grab broken event.
     */
    public Surface getGrabSurface() {
        try {
            var RESULT = (MemoryAddress) gdk_grab_broken_event_get_grab_surface.invokeExact(handle());
            return new Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_grab_broken_event_get_implicit = Interop.downcallHandle(
        "gdk_grab_broken_event_get_implicit",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the grab broken event is for an implicit grab.
     */
    public boolean getImplicit() {
        try {
            var RESULT = (int) gdk_grab_broken_event_get_implicit.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
