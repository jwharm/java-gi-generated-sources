package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStackPage} is an auxiliary class used by {@code GtkStack}.
 */
public class StackPage extends org.gtk.gobject.Object implements Accessible {

    public StackPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StackPage */
    public static StackPage castFrom(org.gtk.gobject.Object gobject) {
        return new StackPage(gobject.refcounted());
    }
    
    /**
     * Returns the stack child to which {@code self} belongs.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_stack_page_get_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the icon name of the page.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_stack_page_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the name of the page.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_stack_page_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the page is marked as “needs attention”.
     */
    public boolean getNeedsAttention() {
        var RESULT = gtk_h.gtk_stack_page_get_needs_attention(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the page title.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_stack_page_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.gtk_stack_page_get_use_underline(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code page} is visible in its {@code GtkStack}.
     * <p>
     * This is independent from the {@code Gtk.Widget:visible}
     * property of its widget.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_stack_page_get_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the icon name of the page.
     */
    public void setIconName(java.lang.String setting) {
        gtk_h.gtk_stack_page_set_icon_name(handle(), Interop.allocateNativeString(setting).handle());
    }
    
    /**
     * Sets the name of the page.
     */
    public void setName(java.lang.String setting) {
        gtk_h.gtk_stack_page_set_name(handle(), Interop.allocateNativeString(setting).handle());
    }
    
    /**
     * Sets whether the page is marked as “needs attention”.
     */
    public void setNeedsAttention(boolean setting) {
        gtk_h.gtk_stack_page_set_needs_attention(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the page title.
     */
    public void setTitle(java.lang.String setting) {
        gtk_h.gtk_stack_page_set_title(handle(), Interop.allocateNativeString(setting).handle());
    }
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     */
    public void setUseUnderline(boolean setting) {
        gtk_h.gtk_stack_page_set_use_underline(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether {@code page} is visible in its {@code GtkStack}.
     */
    public void setVisible(boolean visible) {
        gtk_h.gtk_stack_page_set_visible(handle(), visible ? 1 : 0);
    }
    
}
