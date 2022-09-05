package org.gtk.gtk;

import org.gtk.gobject.*;
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

    public Viewport(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Viewport */
    public static Viewport castFrom(org.gtk.gobject.Object gobject) {
        return new Viewport(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkViewport`.
     * 
     * The new viewport uses the given adjustments, or default
     * adjustments if none are given.
     */
    public Viewport(Adjustment hadjustment, Adjustment vadjustment) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_viewport_new(hadjustment.HANDLE(), vadjustment.HANDLE()), false));
    }
    
    /**
     * Gets the child widget of @viewport.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_viewport_get_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     */
    public boolean getScrollToFocus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_viewport_get_scroll_to_focus(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of @viewport.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_viewport_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets whether the viewport should automatically scroll
     * to keep the focused child in view.
     */
    public void setScrollToFocus(boolean scrollToFocus) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_viewport_set_scroll_to_focus(HANDLE(), scrollToFocus ? 1 : 0);
    }
    
}
