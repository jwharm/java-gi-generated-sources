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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SymbolicPaintableImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SymbolicPaintableImpl(input);
    
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_symbolic_paintable_snapshot_symbolic.invokeExact(
                        handle(),
                        snapshot.handle(),
                        width,
                        height,
                        Interop.allocateNativeArray(colors, org.gtk.gdk.RGBA.getMemoryLayout(), false, SCOPE),
                        nColors);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    
    /**
     * The SymbolicPaintableImpl type represents a native instance of the SymbolicPaintable interface.
     */
    class SymbolicPaintableImpl extends org.gtk.gobject.GObject implements SymbolicPaintable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of SymbolicPaintable for the provided memory address.
         * @param address the memory address of the instance
         */
        public SymbolicPaintableImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_symbolic_paintable_get_type != null;
    }
}
