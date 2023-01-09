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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DragSurfaceImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DragSurfaceImpl(input);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_drag_surface_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gdk_drag_surface_present = Interop.downcallHandle(
                "gdk_drag_surface_present",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_drag_surface_get_type = Interop.downcallHandle(
                "gdk_drag_surface_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The DragSurfaceImpl type represents a native instance of the DragSurface interface.
     */
    class DragSurfaceImpl extends org.gtk.gobject.GObject implements DragSurface {
        
        static {
            Gdk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DragSurface for the provided memory address.
         * @param address the memory address of the instance
         */
        public DragSurfaceImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_drag_surface_get_type != null;
    }
}
