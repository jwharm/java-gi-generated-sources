package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget with one child.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="bin-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="bin.png" alt="bin"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwBin} widget has only one child, set with the {@code Bin:child}
 * property.
 * <p>
 * It is useful for deriving subclasses, since it provides common code needed
 * for handling a single child widget.
 */
public class Bin extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public Bin(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Bin */
    public static Bin castFrom(org.gtk.gobject.Object gobject) {
        return new Bin(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_bin_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwBin}.
     */
    public Bin() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_bin_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_bin_set_child(handle(), child.handle());
    }
    
}
