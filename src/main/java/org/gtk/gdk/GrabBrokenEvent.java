package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a broken windowing system grab.
 */
public class GrabBrokenEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkGrabBrokenEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public GrabBrokenEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to GrabBrokenEvent if its GType is a (or inherits from) "GdkGrabBrokenEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GrabBrokenEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkGrabBrokenEvent", a ClassCastException will be thrown.
     */
    public static GrabBrokenEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkGrabBrokenEvent"))) {
            return new GrabBrokenEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkGrabBrokenEvent");
        }
    }
    
    /**
     * Extracts the grab surface from a grab broken event.
     * @return the grab surface of {@code event}
     */
    public @NotNull org.gtk.gdk.Surface getGrabSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_grab_broken_event_get_grab_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks whether the grab broken event is for an implicit grab.
     * @return {@code true} if the an implicit grab was broken
     */
    public boolean getImplicit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_grab_broken_event_get_implicit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_grab_broken_event_get_grab_surface = Interop.downcallHandle(
            "gdk_grab_broken_event_get_grab_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_grab_broken_event_get_implicit = Interop.downcallHandle(
            "gdk_grab_broken_event_get_implicit",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
