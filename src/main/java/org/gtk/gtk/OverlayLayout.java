package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkOverlayLayout} is the layout manager used by {@code GtkOverlay}.
 * <p>
 * It places widgets as overlays on top of the main child.
 * <p>
 * This is not a reusable layout manager, since it expects its widget
 * to be a {@code GtkOverlay}. It only listed here so that its layout
 * properties get documented.
 */
public class OverlayLayout extends LayoutManager {

    public OverlayLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to OverlayLayout */
    public static OverlayLayout castFrom(org.gtk.gobject.Object gobject) {
        return new OverlayLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_overlay_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkOverlayLayout} instance.
     */
    public OverlayLayout() {
        super(constructNew());
    }
    
}
