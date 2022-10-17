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
 */
public interface SymbolicPaintable extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_symbolic_paintable_snapshot_symbolic = Interop.downcallHandle(
        "gtk_symbolic_paintable_snapshot_symbolic",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Snapshots the paintable with the given colors.
     * <p>
     * If less than 4 colors are provided, GTK will pad the array with default
     * colors.
     */
    default @NotNull void snapshotSymbolic(@NotNull org.gtk.gdk.Snapshot snapshot, @NotNull double width, @NotNull double height, @NotNull org.gtk.gdk.RGBA[] colors, @NotNull long nColors) {
        try {
            gtk_symbolic_paintable_snapshot_symbolic.invokeExact(handle(), snapshot.handle(), width, height, Interop.allocateNativeArray(colors), nColors);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class SymbolicPaintableImpl extends org.gtk.gobject.Object implements SymbolicPaintable {
        public SymbolicPaintableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
