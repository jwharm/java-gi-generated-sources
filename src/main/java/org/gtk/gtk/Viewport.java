package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code GtkViewport} has a single CSS node with name {@code viewport}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkViewport} uses the {@link AccessibleRole#GROUP} role.
 */
public class Viewport extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Viewport(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Viewport */
    public static Viewport castFrom(org.gtk.gobject.Object gobject) {
        return new Viewport(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Adjustment hadjustment, @Nullable org.gtk.gtk.Adjustment vadjustment) {
        java.util.Objects.requireNonNullElse(hadjustment, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(vadjustment, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_viewport_new.invokeExact(hadjustment.handle(), vadjustment.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkViewport}.
     * <p>
     * The new viewport uses the given adjustments, or default
     * adjustments if none are given.
     * @param hadjustment horizontal adjustment
     * @param vadjustment vertical adjustment
     */
    public Viewport(@Nullable org.gtk.gtk.Adjustment hadjustment, @Nullable org.gtk.gtk.Adjustment vadjustment) {
        super(constructNew(hadjustment, vadjustment));
    }
    
    /**
     * Gets the child widget of {@code viewport}.
     * @return the child widget of {@code viewport}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_viewport_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     * @return {@code true} if the viewport keeps the focus child scrolled to view
     */
    public boolean getScrollToFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_viewport_get_scroll_to_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the child widget of {@code viewport}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNullElse(child, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_viewport_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the viewport should automatically scroll
     * to keep the focused child in view.
     * @param scrollToFocus whether to keep the focus widget scrolled to view
     */
    public void setScrollToFocus(boolean scrollToFocus) {
        try {
            DowncallHandles.gtk_viewport_set_scroll_to_focus.invokeExact(handle(), scrollToFocus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_viewport_new = Interop.downcallHandle(
            "gtk_viewport_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_viewport_get_child = Interop.downcallHandle(
            "gtk_viewport_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_viewport_get_scroll_to_focus = Interop.downcallHandle(
            "gtk_viewport_get_scroll_to_focus",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_viewport_set_child = Interop.downcallHandle(
            "gtk_viewport_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_viewport_set_scroll_to_focus = Interop.downcallHandle(
            "gtk_viewport_set_scroll_to_focus",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
