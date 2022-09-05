package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLayoutChild` subclass for children in a `GtkOverlayLayout`.
 */
public class OverlayLayoutChild extends LayoutChild {

    public OverlayLayoutChild(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to OverlayLayoutChild */
    public static OverlayLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new OverlayLayoutChild(gobject.getProxy());
    }
    
    /**
     * Retrieves whether the child is clipped.
     */
    public boolean getClipOverlay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_layout_child_get_clip_overlay(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves whether the child is measured.
     */
    public boolean getMeasure() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_layout_child_get_measure(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether to clip this child.
     */
    public void setClipOverlay(boolean clipOverlay) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_layout_child_set_clip_overlay(HANDLE(), clipOverlay ? 1 : 0);
    }
    
    /**
     * Sets whether to measure this child.
     */
    public void setMeasure(boolean measure) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_layout_child_set_measure(HANDLE(), measure ? 1 : 0);
    }
    
}
