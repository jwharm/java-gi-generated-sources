package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkViewport` implements scrollability for widgets that lack their
 * own scrolling capabilities.
 * 
 * Use `GtkViewport` to scroll child widgets such as `GtkGrid`,
 * `GtkBox`, and so on.
 * 
 * The `GtkViewport` will start scrolling content only if allocated
 * less than the child widget’s minimum size in a given orientation.
 * 
 * # CSS nodes
 * 
 * `GtkViewport` has a single CSS node with name `viewport`.
 * 
 * # Accessibility
 * 
 * `GtkViewport` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public class Viewport extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public Viewport(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Viewport */
    public static Viewport castFrom(org.gtk.gobject.Object gobject) {
        return new Viewport(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkViewport`.
     * 
     * The new viewport uses the given adjustments, or default
     * adjustments if none are given.
     */
    public Viewport(Adjustment hadjustment, Adjustment vadjustment) {
        super(References.get(gtk_h.gtk_viewport_new(hadjustment.handle(), vadjustment.handle()), false));
    }
    
    /**
     * Gets the child widget of @viewport.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_viewport_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     */
    public boolean getScrollToFocus() {
        var RESULT = gtk_h.gtk_viewport_get_scroll_to_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of @viewport.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_viewport_set_child(handle(), child.handle());
    }
    
    /**
     * Sets whether the viewport should automatically scroll
     * to keep the focused child in view.
     */
    public void setScrollToFocus(boolean scrollToFocus) {
        gtk_h.gtk_viewport_set_scroll_to_focus(handle(), scrollToFocus ? 1 : 0);
    }
    
}
