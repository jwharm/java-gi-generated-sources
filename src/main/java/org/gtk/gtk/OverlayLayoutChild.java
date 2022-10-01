package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkOverlayLayout}.
 */
public class OverlayLayoutChild extends LayoutChild {

    public OverlayLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to OverlayLayoutChild */
    public static OverlayLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new OverlayLayoutChild(gobject.refcounted());
    }
    
    /**
     * Retrieves whether the child is clipped.
     */
    public boolean getClipOverlay() {
        var RESULT = gtk_h.gtk_overlay_layout_child_get_clip_overlay(handle());
        return RESULT != 0;
    }
    
    /**
     * Retrieves whether the child is measured.
     */
    public boolean getMeasure() {
        var RESULT = gtk_h.gtk_overlay_layout_child_get_measure(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets whether to clip this child.
     */
    public void setClipOverlay(boolean clipOverlay) {
        gtk_h.gtk_overlay_layout_child_set_clip_overlay(handle(), clipOverlay ? 1 : 0);
    }
    
    /**
     * Sets whether to measure this child.
     */
    public void setMeasure(boolean measure) {
        gtk_h.gtk_overlay_layout_child_set_measure(handle(), measure ? 1 : 0);
    }
    
}
