package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkDragSurface} is an interface for surfaces used during DND.
 */
public interface DragSurface extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gdk_drag_surface_present = Interop.downcallHandle(
        "gdk_drag_surface_present",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Present {@code drag_surface}.
     */
    default boolean present(@NotNull int width, @NotNull int height) {
        int RESULT;
        try {
            RESULT = (int) gdk_drag_surface_present.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    class DragSurfaceImpl extends org.gtk.gobject.Object implements DragSurface {
        public DragSurfaceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
