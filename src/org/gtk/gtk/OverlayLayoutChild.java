package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkLayoutChild</code> subclass for children in a <code>GtkOverlayLayout</code>.
 */
public class OverlayLayoutChild extends LayoutChild {

    public OverlayLayoutChild(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to OverlayLayoutChild */
    public static OverlayLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new OverlayLayoutChild(gobject.getReference());
    }
    
    /**
     * Retrieves whether the child is clipped.
     */
    public boolean getClipOverlay() {
        var RESULT = gtk_h.gtk_overlay_layout_child_get_clip_overlay(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves whether the child is measured.
     */
    public boolean getMeasure() {
        var RESULT = gtk_h.gtk_overlay_layout_child_get_measure(handle());
        return (RESULT != 0);
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
