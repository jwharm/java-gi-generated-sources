package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_grab_broken_event_get_grab_surface = Interop.downcallHandle(
        "gdk_grab_broken_event_get_grab_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the grab surface from a grab broken event.
     */
    public @NotNull Surface getGrabSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_grab_broken_event_get_grab_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Surface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_grab_broken_event_get_implicit = Interop.downcallHandle(
        "gdk_grab_broken_event_get_implicit",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the grab broken event is for an implicit grab.
     */
    public boolean getImplicit() {
        int RESULT;
        try {
            RESULT = (int) gdk_grab_broken_event_get_implicit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
