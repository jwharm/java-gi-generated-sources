package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkDragSurface} is an interface for surfaces used during DND.
 */
public interface DragSurface extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to DragSurface if its GType is a (or inherits from) "GdkDragSurface".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DragSurface" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDragSurface", a ClassCastException will be thrown.
     */
    public static DragSurface castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkDragSurface"))) {
            return new DragSurfaceImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDragSurface");
        }
    }
    
    /**
     * Present {@code drag_surface}.
     * @param width the unconstrained drag_surface width to layout
     * @param height the unconstrained drag_surface height to layout
     * @return {@code false} if it failed to be presented, otherwise {@code true}.
     */
    default boolean present(int width, int height) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_drag_surface_present.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gdk_drag_surface_present = Interop.downcallHandle(
            "gdk_drag_surface_present",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
    
    class DragSurfaceImpl extends org.gtk.gobject.Object implements DragSurface {
        
        static {
            Gdk.javagi$ensureInitialized();
        }
        
        public DragSurfaceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
