package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSymbolicPaintable</code> is an interface that support symbolic colors in
 * paintables.
 * <p><code>GdkPaintable</code>s implementing the interface will have the
 * {@link org.gtk.gtk.SymbolicPaintable#snapshotSymbolic} function called and
 * have the colors for drawing symbolic icons passed. At least 4 colors are guaranteed
 * to be passed every time.
 * 
 * These 4 colors are the foreground color, and the colors to use for errors, warnings
 * and success information in that order.
 * 
 * More colors may be added in the future.
 */
public interface SymbolicPaintable extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Snapshots the paintable with the given colors.
     * 
     * If less than 4 colors are provided, GTK will pad the array with default
     * colors.
     */
    public default void snapshotSymbolic(org.gtk.gdk.Snapshot snapshot, double width, double height, org.gtk.gdk.RGBA[] colors, long nColors) {
        gtk_h.gtk_symbolic_paintable_snapshot_symbolic(handle(), snapshot.handle(), width, height, Interop.allocateNativeArray(colors).handle(), nColors);
    }
    
    class SymbolicPaintableImpl extends org.gtk.gobject.Object implements SymbolicPaintable {
        public SymbolicPaintableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
