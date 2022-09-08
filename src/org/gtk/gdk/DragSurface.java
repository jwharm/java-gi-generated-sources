package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkDragSurface` is an interface for surfaces used during DND.
 */
public interface DragSurface extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Present @drag_surface.
     */
    public default boolean present(int width, int height) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_drag_surface_present(HANDLE(), width, height);
        return (RESULT != 0);
    }
    
    class DragSurfaceImpl extends org.gtk.gobject.Object implements DragSurface {
        public DragSurfaceImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
