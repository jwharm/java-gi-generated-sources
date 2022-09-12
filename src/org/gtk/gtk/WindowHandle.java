package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public WindowHandle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to WindowHandle */
    public static WindowHandle castFrom(org.gtk.gobject.Object gobject) {
        return new WindowHandle(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_window_handle_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkWindowHandle`.
     */
    public WindowHandle() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of @self.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_window_handle_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_window_handle_set_child(handle(), child.handle());
    }
    
}
