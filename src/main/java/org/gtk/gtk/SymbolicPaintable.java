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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SymbolicPaintable" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSymbolicPaintable", a ClassCastException will be thrown.
     */
    public static SymbolicPaintable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSymbolicPaintable"))) {
            return new SymbolicPaintableImpl(gobject.refcounted());
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
    default void snapshotSymbolic(@NotNull org.gtk.gdk.Snapshot snapshot, double width, double height, org.gtk.gdk.RGBA[] colors, long nColors) {
        java.util.Objects.requireNonNull(snapshot, "Parameter 'snapshot' must not be null");
        java.util.Objects.requireNonNull(colors, "Parameter 'colors' must not be null");
        try {
            DowncallHandles.gtk_symbolic_paintable_snapshot_symbolic.invokeExact(
                    handle(),
                    snapshot.handle(),
                    width,
                    height,
                    Interop.allocateNativeArray(colors, false),
                    nColors);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_symbolic_paintable_snapshot_symbolic = Interop.downcallHandle(
            "gtk_symbolic_paintable_snapshot_symbolic",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
    
    class SymbolicPaintableImpl extends org.gtk.gobject.Object implements SymbolicPaintable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public SymbolicPaintableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
