package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An auxiliary class used by {@link TabView}.
 */
public class TabPage extends org.gtk.gobject.Object {

    public TabPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TabPage */
    public static TabPage castFrom(org.gtk.gobject.Object gobject) {
        return new TabPage(gobject.refcounted());
    }
    
    /**
     * Gets the child of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_tab_page_get_child(handle());
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the icon of {@code self}.
     */
    public org.gtk.gio.Icon getIcon() {
        var RESULT = gtk_h.adw_tab_page_get_icon(handle());
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the indicator of {@code self} is activatable.
     */
    public boolean getIndicatorActivatable() {
        var RESULT = gtk_h.adw_tab_page_get_indicator_activatable(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the indicator icon of {@code self}.
     */
    public org.gtk.gio.Icon getIndicatorIcon() {
        var RESULT = gtk_h.adw_tab_page_get_indicator_icon(handle());
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is loading.
     */
    public boolean getLoading() {
        var RESULT = gtk_h.adw_tab_page_get_loading(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} needs attention.
     */
    public boolean getNeedsAttention() {
        var RESULT = gtk_h.adw_tab_page_get_needs_attention(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the parent page of {@code self}.
     */
    public TabPage getParent() {
        var RESULT = gtk_h.adw_tab_page_get_parent(handle());
        return new TabPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is pinned.
     */
    public boolean getPinned() {
        var RESULT = gtk_h.adw_tab_page_get_pinned(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is selected.
     */
    public boolean getSelected() {
        var RESULT = gtk_h.adw_tab_page_get_selected(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_tab_page_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the tooltip of {@code self}.
     */
    public java.lang.String getTooltip() {
        var RESULT = gtk_h.adw_tab_page_get_tooltip(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the icon of {@code self}.
     */
    public void setIcon(org.gtk.gio.Icon icon) {
        gtk_h.adw_tab_page_set_icon(handle(), icon.handle());
    }
    
    /**
     * Sets whether the indicator of {@code self} is activatable.
     */
    public void setIndicatorActivatable(boolean activatable) {
        gtk_h.adw_tab_page_set_indicator_activatable(handle(), activatable ? 1 : 0);
    }
    
    /**
     * Sets the indicator icon of {@code self}.
     */
    public void setIndicatorIcon(org.gtk.gio.Icon indicatorIcon) {
        gtk_h.adw_tab_page_set_indicator_icon(handle(), indicatorIcon.handle());
    }
    
    /**
     * Sets wether {@code self} is loading.
     */
    public void setLoading(boolean loading) {
        gtk_h.adw_tab_page_set_loading(handle(), loading ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} needs attention.
     */
    public void setNeedsAttention(boolean needsAttention) {
        gtk_h.adw_tab_page_set_needs_attention(handle(), needsAttention ? 1 : 0);
    }
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_tab_page_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets the tooltip of {@code self}.
     */
    public void setTooltip(java.lang.String tooltip) {
        gtk_h.adw_tab_page_set_tooltip(handle(), Interop.allocateNativeString(tooltip).handle());
    }
    
}
