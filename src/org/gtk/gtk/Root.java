package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkRoot</code> is the interface implemented by all widgets that can act as a toplevel
 * widget.
 * <p>
 * The root widget takes care of providing the connection to the windowing system
 * and manages layout, drawing and event delivery for its widget hierarchy.
 * <p>
 * The obvious example of a <code>GtkRoot</code> is <code>GtkWindow</code>.
 * <p>
 * To get the display to which a <code>GtkRoot</code> belongs, use
 * {@link org.gtk.gtk.Root#getDisplay}.
 * <p><code>GtkRoot</code> also maintains the location of keyboard focus inside its widget
 * hierarchy, with {@link org.gtk.gtk.Root#setFocus} and {@link org.gtk.gtk.Root#getFocus}.
 */
public interface Root extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Returns the display that this <code>GtkRoot</code> is on.
     */
    public default org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.gtk_root_get_display(handle());
        return new org.gtk.gdk.Display(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the current focused widget within the root.
     * <p>
     * Note that this is the widget that would have the focus
     * if the root is active; if the root is not focused then<code>gtk_widget_has_focus (widget)</code> will be <code>false</code> for the
     * widget.
     */
    public default Widget getFocus() {
        var RESULT = gtk_h.gtk_root_get_focus(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * If @focus is not the current focus widget, and is focusable, sets
     * it as the focus widget for the root.
     * 
     * If @focus is <code>NULL,</code> unsets the focus widget for the root.
     * 
     * To set the focus to a particular widget in the root, it is usually
     * more convenient to use {@link org.gtk.gtk.Widget#grabFocus} instead of
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
