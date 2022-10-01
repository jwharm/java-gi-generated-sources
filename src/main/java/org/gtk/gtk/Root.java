package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkRoot} is the interface implemented by all widgets that can act as a toplevel
 * widget.
 * <p>
 * The root widget takes care of providing the connection to the windowing system
 * and manages layout, drawing and event delivery for its widget hierarchy.
 * <p>
 * The obvious example of a {@code GtkRoot} is {@code GtkWindow}.
 * <p>
 * To get the display to which a {@code GtkRoot} belongs, use
 * {@link Root#getDisplay}.
 * <p>
 * {@code GtkRoot} also maintains the location of keyboard focus inside its widget
 * hierarchy, with {@code Gtk.Root.get_focus}.
 */
public interface Root extends io.github.jwharm.javagi.Proxy {

    /**
     * Returns the display that this {@code GtkRoot} is on.
     */
    public default org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.gtk_root_get_display(handle());
        return new org.gtk.gdk.Display(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the current focused widget within the root.
     * <p>
     * Note that this is the widget that would have the focus
     * if the root is active; if the root is not focused then
     * {@code gtk_widget_has_focus (widget)} will be {@code false} for the
     * widget.
     */
    public default Widget getFocus() {
        var RESULT = gtk_h.gtk_root_get_focus(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * If {@code focus} is not the current focus widget, and is focusable, sets
     * it as the focus widget for the root.
     * <p>
     * If {@code focus} is {@code null}, unsets the focus widget for the root.
     * <p>
     * To set the focus to a particular widget in the root, it is usually
     * more convenient to use {@link Widget#grabFocus} instead of
     * this function.
     */
    public default void setFocus(Widget focus) {
        gtk_h.gtk_root_set_focus(handle(), focus.handle());
    }
    
    class RootImpl extends org.gtk.gobject.Object implements Root {
        public RootImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
