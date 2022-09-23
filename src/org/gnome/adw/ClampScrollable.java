package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A scrollable {@link Clamp}.
 * <p>
 * {@code AdwClampScrollable} is a variant of {@link Clamp} that implements the
 * {@code Gtk.Scrollable} interface.
 * <p>
 * The primary use case for {@code AdwClampScrollable} is clamping
 * {@link org.gtk.gtk.ListView}.
 */
public class ClampScrollable extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable, org.gtk.gtk.Scrollable {

    public ClampScrollable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ClampScrollable */
    public static ClampScrollable castFrom(org.gtk.gobject.Object gobject) {
        return new ClampScrollable(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_clamp_scrollable_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwClampScrollable}.
     */
    public ClampScrollable() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_clamp_scrollable_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum size allocated to the child.
     */
    public int getMaximumSize() {
        var RESULT = gtk_h.adw_clamp_scrollable_get_maximum_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the size above which the child is clamped.
     */
    public int getTighteningThreshold() {
        var RESULT = gtk_h.adw_clamp_scrollable_get_tightening_threshold(handle());
        return RESULT;
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_clamp_scrollable_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the maximum size allocated to the child.
     */
    public void setMaximumSize(int maximumSize) {
        gtk_h.adw_clamp_scrollable_set_maximum_size(handle(), maximumSize);
    }
    
    /**
     * Sets the size above which the child is clamped.
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        gtk_h.adw_clamp_scrollable_set_tightening_threshold(handle(), tighteningThreshold);
    }
    
}
