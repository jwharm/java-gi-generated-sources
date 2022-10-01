package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An auxiliary class used by {@link ViewStack}.
 */
public class ViewStackPage extends org.gtk.gobject.Object {

    public ViewStackPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewStackPage */
    public static ViewStackPage castFrom(org.gtk.gobject.Object gobject) {
        return new ViewStackPage(gobject.refcounted());
    }
    
    /**
     * Gets the badge number for this page.
     */
    public int getBadgeNumber() {
        var RESULT = gtk_h.adw_view_stack_page_get_badge_number(handle());
        return RESULT;
    }
    
    /**
     * Gets the stack child to which {@code self} belongs.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_view_stack_page_get_child(handle());
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the icon name of the page.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_view_stack_page_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of the page.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.adw_view_stack_page_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the page is marked as “needs attention”.
     */
    public boolean getNeedsAttention() {
        var RESULT = gtk_h.adw_view_stack_page_get_needs_attention(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the page title.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_view_stack_page_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.adw_view_stack_page_get_use_underline(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is visible in its {@code AdwViewStack}.
     * <p>
     * This is independent from the {@code Gtk.Widget:visible}
     * property of its widget.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.adw_view_stack_page_get_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the badge number for this page.
     */
    public void setBadgeNumber(int badgeNumber) {
        gtk_h.adw_view_stack_page_set_badge_number(handle(), badgeNumber);
    }
    
    /**
     * Sets the icon name of the page.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_view_stack_page_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the name of the page.
     */
    public void setName(java.lang.String name) {
        gtk_h.adw_view_stack_page_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets whether the page is marked as “needs attention”.
     */
    public void setNeedsAttention(boolean needsAttention) {
        gtk_h.adw_view_stack_page_set_needs_attention(handle(), needsAttention ? 1 : 0);
    }
    
    /**
     * Sets the page title.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_view_stack_page_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.adw_view_stack_page_set_use_underline(handle(), useUnderline ? 1 : 0);
    }
    
    /**
     * Sets whether {@code page} is visible in its {@code AdwViewStack}.
     */
    public void setVisible(boolean visible) {
        gtk_h.adw_view_stack_page_set_visible(handle(), visible ? 1 : 0);
    }
    
}
