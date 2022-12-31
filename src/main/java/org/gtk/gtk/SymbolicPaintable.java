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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SymbolicPaintableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SymbolicPaintableImpl(input, ownership);
    
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
    default void snapshotSymbolic(org.gtk.gdk.Snapshot snapshot, double width, double height, org.gtk.gdk.RGBA[] colors, long nColors) {
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
    public static org.gtk.glib.Type getType() {
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
    
    class SymbolicPaintableImpl extends org.gtk.gobject.GObject implements SymbolicPaintable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public SymbolicPaintableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
