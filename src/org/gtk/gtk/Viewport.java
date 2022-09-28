package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkViewport} implements scrollability for widgets that lack their
 * own scrolling capabilities.
 * <p>
 * Use {@code GtkViewport} to scroll child widgets such as {@code GtkGrid},
 * {@code GtkBox}, and so on.
 * <p>
 * The {@code GtkViewport} will start scrolling content only if allocated
 * less than the child widget’s minimum size in a given orientation.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkViewport} has a single CSS node with name {@code viewport}.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkViewport} uses the {@link AccessibleRole#GROUP} role.
 */
public class Viewport extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public Viewport(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Viewport */
    public static Viewport castFrom(org.gtk.gobject.Object gobject) {
        return new Viewport(gobject.getReference());
    }
    
    private static Reference constructNew(Adjustment hadjustment, Adjustment vadjustment) {
        Reference RESULT = References.get(gtk_h.gtk_viewport_new(hadjustment.handle(), vadjustment.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkViewport}.
     * <p>
     * The new viewport uses the given adjustments, or default
     * adjustments if none are given.
     */
    public Viewport(Adjustment hadjustment, Adjustment vadjustment) {
        super(constructNew(hadjustment, vadjustment));
    }
    
    /**
     * Gets the child widget of {@code viewport}.
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
        return RESULT != 0;
    }
    
    /**
     * Sets the child widget of {@code viewport}.
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
