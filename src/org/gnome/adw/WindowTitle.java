package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A helper widget for setting a window's title and subtitle.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-title-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window-title.png" alt="window-title"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwWindowTitle} shows a title and subtitle. It's intended to be used as the
 * title child of {@code HeaderBar}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwWindowTitle} has a single CSS node with name {@code windowtitle}.
 */
public class WindowTitle extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public WindowTitle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to WindowTitle */
    public static WindowTitle castFrom(org.gtk.gobject.Object gobject) {
        return new WindowTitle(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, java.lang.String subtitle) {
        Reference RESULT = References.get(gtk_h.adw_window_title_new(Interop.allocateNativeString(title).handle(), Interop.allocateNativeString(subtitle).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwWindowTitle}.
     */
    public WindowTitle(java.lang.String title, java.lang.String subtitle) {
        super(constructNew(title, subtitle));
    }
    
    /**
     * Gets the subtitle of {@code self}.
     */
    public java.lang.String getSubtitle() {
        var RESULT = gtk_h.adw_window_title_get_subtitle(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_window_title_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the subtitle of {@code self}.
     */
    public void setSubtitle(java.lang.String subtitle) {
        gtk_h.adw_window_title_set_subtitle(handle(), Interop.allocateNativeString(subtitle).handle());
    }
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_window_title_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
}
