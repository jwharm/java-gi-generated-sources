package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkDragSurface} is an interface for surfaces used during DND.
 */
public interface DragSurface extends io.github.jwharm.javagi.Proxy {

    /**
     * Present {@code drag_surface}.
     */
    public default boolean present(int width, int height) {
        var RESULT = gtk_h.gdk_drag_surface_present(handle(), width, height);
        return RESULT != 0;
    }
    
    class DragSurfaceImpl extends org.gtk.gobject.Object implements DragSurface {
        public DragSurfaceImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
