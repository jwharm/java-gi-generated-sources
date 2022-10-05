package org.gtk.gtk;

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

    public Viewport(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Viewport */
    public static Viewport castFrom(org.gtk.gobject.Object gobject) {
        return new Viewport(gobject.refcounted());
    }
    
    static final MethodHandle gtk_viewport_new = Interop.downcallHandle(
        "gtk_viewport_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Adjustment hadjustment, Adjustment vadjustment) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_viewport_new.invokeExact(hadjustment.handle(), vadjustment.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_viewport_get_child = Interop.downcallHandle(
        "gtk_viewport_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code viewport}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_viewport_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_viewport_get_scroll_to_focus = Interop.downcallHandle(
        "gtk_viewport_get_scroll_to_focus",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     */
    public boolean getScrollToFocus() {
        try {
            var RESULT = (int) gtk_viewport_get_scroll_to_focus.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_viewport_set_child = Interop.downcallHandle(
        "gtk_viewport_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code viewport}.
     */
    public void setChild(Widget child) {
        try {
            gtk_viewport_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_viewport_set_scroll_to_focus = Interop.downcallHandle(
        "gtk_viewport_set_scroll_to_focus",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the viewport should automatically scroll
     * to keep the focused child in view.
     */
    public void setScrollToFocus(boolean scrollToFocus) {
        try {
            gtk_viewport_set_scroll_to_focus.invokeExact(handle(), scrollToFocus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
