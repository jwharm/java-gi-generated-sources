package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStackPage` is an auxiliary class used by `GtkStack`.
 */
public class StackPage extends org.gtk.gobject.Object implements Accessible {

    public StackPage(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StackPage */
    public static StackPage castFrom(org.gtk.gobject.Object gobject) {
        return new StackPage(gobject.getReference());
    }
    
    /**
     * Returns the stack child to which @self belongs.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_child(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the icon name of the page.
     */
    public java.lang.String getIconName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_icon_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the name of the page.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the page is marked as “needs attention”.
     */
    public boolean getNeedsAttention() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_needs_attention(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the page title.
     */
    public java.lang.String getTitle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_title(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether underlines in the page title indicate mnemonics.
     */
    public boolean getUseUnderline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_use_underline(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @page is visible in its `GtkStack`.
     * 
     * This is independent from the [property@Gtk.Widget:visible]
     * property of its widget.
     */
    public boolean getVisible() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_get_visible(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the icon name of the page.
     */
    public void setIconName(java.lang.String setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_set_icon_name(HANDLE(), Interop.allocateNativeString(setting).HANDLE());
    }
    
    /**
     * Sets the name of the page.
     */
    public void setName(java.lang.String setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_set_name(HANDLE(), Interop.allocateNativeString(setting).HANDLE());
    }
    
    /**
     * Sets whether the page is marked as “needs attention”.
     */
    public void setNeedsAttention(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_set_needs_attention(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets the page title.
     */
    public void setTitle(java.lang.String setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_set_title(HANDLE(), Interop.allocateNativeString(setting).HANDLE());
    }
    
    /**
     * Sets whether underlines in the page title indicate mnemonics.
     */
    public void setUseUnderline(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_set_use_underline(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether @page is visible in its `GtkStack`.
     */
    public void setVisible(boolean visible) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_stack_page_set_visible(HANDLE(), visible ? 1 : 0);
    }
    
}
