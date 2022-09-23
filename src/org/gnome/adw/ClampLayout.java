package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A layout manager constraining its children to a given size.
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
 * {@code AdwClampLayout} constraints the size of the widgets it contains to a given
 * maximum size. It will constrain the width if it is horizontal, or the height
 * if it is vertical. The expansion of the children from their minimum to their
 * maximum size is eased out for a smooth transition.
 * <p>
 * If a child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 * <p>
 * Each child will get the style  classes .large when it reached its maximum
 * size, .small when it's allocated the full size, .medium in-between, or none
 * if it hasn't been allocated yet.
 */
public class ClampLayout extends org.gtk.gtk.LayoutManager implements org.gtk.gtk.Orientable {

    public ClampLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ClampLayout */
    public static ClampLayout castFrom(org.gtk.gobject.Object gobject) {
        return new ClampLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_clamp_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwClampLayout}.
     */
    public ClampLayout() {
        super(constructNew());
    }
    
    /**
     * Gets the maximum size allocated to the children.
     */
    public int getMaximumSize() {
        var RESULT = gtk_h.adw_clamp_layout_get_maximum_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the size above which the children are clamped.
     */
    public int getTighteningThreshold() {
        var RESULT = gtk_h.adw_clamp_layout_get_tightening_threshold(handle());
        return RESULT;
    }
    
    /**
     * Sets the maximum size allocated to the children.
     */
    public void setMaximumSize(int maximumSize) {
        gtk_h.adw_clamp_layout_set_maximum_size(handle(), maximumSize);
    }
    
    /**
     * Sets the size above which the children are clamped.
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        gtk_h.adw_clamp_layout_set_tightening_threshold(handle(), tighteningThreshold);
    }
    
}
