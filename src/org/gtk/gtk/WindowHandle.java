package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkWindowHandle` is a titlebar area widget.
 * 
 * When added into a window, it can be dragged to move the window, and handles
 * right click, double click and middle click as expected of a titlebar.
 * 
 * # CSS nodes
 * 
 * `GtkWindowHandle` has a single CSS node with the name `windowhandle`.
 * 
 * # Accessibility
 * 
 * `GtkWindowHandle` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public class WindowHandle extends Widget implements Accessible, Buildable, ConstraintTarget {

    public WindowHandle(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to WindowHandle */
    public static WindowHandle castFrom(org.gtk.gobject.Object gobject) {
        return new WindowHandle(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkWindowHandle`.
     */
    public WindowHandle() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_handle_new(), false));
    }
    
    /**
     * Gets the child widget of @self.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_handle_get_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_window_handle_set_child(HANDLE(), child.HANDLE());
    }
    
}
