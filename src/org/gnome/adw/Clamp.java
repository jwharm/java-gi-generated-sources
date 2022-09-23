package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget constraining its child to a given size.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="clamp-wide-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="clamp-wide.png" alt="clamp-wide"&gt;
 * &lt;/picture&gt;
 * &lt;picture&gt;
 *   &lt;source srcset="clamp-narrow-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="clamp-narrow.png" alt="clamp-narrow"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwClamp} widget constrains the size of the widget it contains to a
 * given maximum size. It will constrain the width if it is horizontal, or the
 * height if it is vertical. The expansion of the child from its minimum to its
 * maximum size is eased out for a smooth transition.
 * <p>
 * If the child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwClamp} has a single CSS node with name {@code clamp}.
 * <p>
 * Its children will receive the style classes {@code .large} when the child reached
 * its maximum size, {@code .small} when the clamp allocates its full size to the
 * child, {@code .medium} in-between, or none if it hasn't computed its size yet.
 */
public class Clamp extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public Clamp(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Clamp */
    public static Clamp castFrom(org.gtk.gobject.Object gobject) {
        return new Clamp(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_clamp_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwClamp}.
     */
    public Clamp() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_clamp_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum size allocated to the child.
     */
    public int getMaximumSize() {
        var RESULT = gtk_h.adw_clamp_get_maximum_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the size above which the child is clamped.
     */
    public int getTighteningThreshold() {
        var RESULT = gtk_h.adw_clamp_get_tightening_threshold(handle());
        return RESULT;
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_clamp_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the maximum size allocated to the child.
     */
    public void setMaximumSize(int maximumSize) {
        gtk_h.adw_clamp_set_maximum_size(handle(), maximumSize);
    }
    
    /**
     * Sets the size above which the child is clamped.
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        gtk_h.adw_clamp_set_tightening_threshold(handle(), tighteningThreshold);
    }
    
}
