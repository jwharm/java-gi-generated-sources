package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A page used for empty/error states and similar use-cases.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="status-page-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="status-page.png" alt="status-page"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwStatusPage} widget can have an icon, a title, a description and a
 * custom widget which is displayed below them.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwStatusPage} has a main CSS node with name {@code statuspage}.
 * <p>
 * {@code AdwStatusPage} can use the
 * <a href="style-classes.html#compact-status-page">`.compact`</a> style class for when it
 * needs to fit into a small space such a sidebar or a popover.
 */
public class StatusPage extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public StatusPage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StatusPage */
    public static StatusPage castFrom(org.gtk.gobject.Object gobject) {
        return new StatusPage(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_status_page_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwStatusPage}.
     */
    public StatusPage() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_status_page_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the description for {@code self}.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.adw_status_page_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_status_page_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the paintable for {@code self}.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        var RESULT = gtk_h.adw_status_page_get_paintable(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the title for {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_status_page_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_status_page_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the description for {@code self}.
     */
    public void setDescription(java.lang.String description) {
        gtk_h.adw_status_page_set_description(handle(), Interop.allocateNativeString(description).handle());
    }
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_status_page_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the paintable for {@code self}.
     */
    public void setPaintable(org.gtk.gdk.Paintable paintable) {
        gtk_h.adw_status_page_set_paintable(handle(), paintable.handle());
    }
    
    /**
     * Sets the title for {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_status_page_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
}
