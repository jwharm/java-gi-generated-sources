package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSymbolicPaintable} is an interface that support symbolic colors in
 * paintables.
 * <p>
 * {@code GdkPaintable}s implementing the interface will have the
 * {@link SymbolicPaintable#snapshotSymbolic} function called and
 * have the colors for drawing symbolic icons passed. At least 4 colors are guaranteed
 * to be passed every time.
 * <p>
 * These 4 colors are the foreground color, and the colors to use for errors, warnings
 * and success information in that order.
 * <p>
 * More colors may be added in the future.
 * @version 4.6
 */
public interface SymbolicPaintable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to SymbolicPaintable if its GType is a (or inherits from) "GtkSymbolicPaintable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SymbolicPaintable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSymbolicPaintable", a ClassCastException will be thrown.
     */
    public static SymbolicPaintable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SymbolicPaintable.getType())) {
            return new SymbolicPaintableImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSymbolicPaintable");
        }
    }
    
    /**
     * Snapshots the paintable with the given colors.
     * <p>
     * If less than 4 colors are provided, GTK will pad the array with default
     * colors.
     * @param snapshot a {@code GdkSnapshot} to snapshot to
     * @param width width to snapshot in
     * @param height height to snapshot in
     * @param colors a pointer to an array of colors
     * @param nColors The number of colors
     */
    default void snapshotSymbolic(@NotNull org.gtk.gdk.Snapshot snapshot, double width, double height, @NotNull org.gtk.gdk.RGBA[] colors, long nColors) {
        java.util.Objects.requireNonNull(snapshot, "Parameter 'snapshot' must not be null");
        java.util.Objects.requireNonNull(colors, "Parameter 'colors' must not be null");
        try {
            DowncallHandles.gtk_symbolic_paintable_snapshot_symbolic.invokeExact(
                    handle(),
                    snapshot.handle(),
                    width,
                    height,
                    Interop.allocateNativeArray(colors, org.gtk.gdk.RGBA.getMemoryLayout(), false),
                    nColors);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_symbolic_paintable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_symbolic_paintable_snapshot_symbolic = Interop.downcallHandle(
            "gtk_symbolic_paintable_snapshot_symbolic",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_symbolic_paintable_get_type = Interop.downcallHandle(
            "gtk_symbolic_paintable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class SymbolicPaintableImpl extends org.gtk.gobject.Object implements SymbolicPaintable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public SymbolicPaintableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
