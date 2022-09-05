package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSymbolicPaintable` is an interface that support symbolic colors in
 * paintables.
 * 
 * `GdkPaintable`s implementing the interface will have the
 * [vfunc@Gtk.SymbolicPaintable.snapshot_symbolic] function called and
 * have the colors for drawing symbolic icons passed. At least 4 colors are guaranteed
 * to be passed every time.
 * 
 * These 4 colors are the foreground color, and the colors to use for errors, warnings
 * and success information in that order.
 * 
 * More colors may be added in the future.
 */
public interface SymbolicPaintable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Snapshots the paintable with the given colors.
     * 
     * If less than 4 colors are provided, GTK will pad the array with default
     * colors.
     */
    public default void snapshotSymbolic(org.gtk.gdk.Snapshot snapshot, double width, double height, org.gtk.gdk.RGBA[] colors, long nColors) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_symbolic_paintable_snapshot_symbolic(HANDLE(), snapshot.HANDLE(), width, height, Interop.allocateNativeArray(colors), nColors);
    }
    
    class SymbolicPaintableImpl extends org.gtk.gobject.Object implements SymbolicPaintable {
        public SymbolicPaintableImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
