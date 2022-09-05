package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkRoot` is the interface implemented by all widgets that can act as a toplevel
 * widget.
 * 
 * The root widget takes care of providing the connection to the windowing system
 * and manages layout, drawing and event delivery for its widget hierarchy.
 * 
 * The obvious example of a `GtkRoot` is `GtkWindow`.
 * 
 * To get the display to which a `GtkRoot` belongs, use
 * [method@Gtk.Root.get_display].
 * 
 * `GtkRoot` also maintains the location of keyboard focus inside its widget
 * hierarchy, with [method@Gtk.Root.set_focus] and [method@Gtk.Root.get_focus].
 */
public interface Root extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns the display that this `GtkRoot` is on.
     */
    public default org.gtk.gdk.Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_root_get_display(HANDLE());
        return new org.gtk.gdk.Display(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the current focused widget within the root.
     * 
     * Note that this is the widget that would have the focus
     * if the root is active; if the root is not focused then
     * `gtk_widget_has_focus (widget)` will be %FALSE for the
     * widget.
     */
    public default Widget getFocus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_root_get_focus(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * If @focus is not the current focus widget, and is focusable, sets
     * it as the focus widget for the root.
     * 
     * If @focus is %NULL, unsets the focus widget for the root.
     * 
     * To set the focus to a particular widget in the root, it is usually
     * more convenient to use [method@Gtk.Widget.grab_focus] instead of
     * this function.
     */
    public default void setFocus(Widget focus) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_root_set_focus(HANDLE(), focus.HANDLE());
    }
    
    class RootImpl extends org.gtk.gobject.Object implements Root {
        public RootImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
