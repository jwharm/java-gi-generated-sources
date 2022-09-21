package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkDragSurface} is an interface for surfaces used during DND.
 */
public interface DragSurface extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Present {@code drag_surface}.
     */
    public default boolean present(int width, int height) {
        var RESULT = gtk_h.gdk_drag_surface_present(handle(), width, height);
        return (RESULT != 0);
    }
    
    class DragSurfaceImpl extends org.gtk.gobject.Object implements DragSurface {
        public DragSurfaceImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
