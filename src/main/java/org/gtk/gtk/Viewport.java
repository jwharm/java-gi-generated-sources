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
    
    private static final java.lang.String C_TYPE_NAME = "GtkViewport";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Viewport proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Viewport(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Viewport if its GType is a (or inherits from) "GtkViewport".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Viewport} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkViewport", a ClassCastException will be thrown.
     */
    public static Viewport castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkViewport"))) {
            return new Viewport(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkViewport");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Adjustment hadjustment, @Nullable org.gtk.gtk.Adjustment vadjustment) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_viewport_new.invokeExact(
                    (Addressable) (hadjustment == null ? MemoryAddress.NULL : hadjustment.handle()),
                    (Addressable) (vadjustment == null ? MemoryAddress.NULL : vadjustment.handle()));
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
        super(constructNew(hadjustment, vadjustment), Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code viewport}.
     * @return the child widget of {@code viewport}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_viewport_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     * @return {@code true} if the viewport keeps the focus child scrolled to view
     */
    public boolean getScrollToFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_viewport_get_scroll_to_focus.invokeExact(
                    handle());
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
        try {
            DowncallHandles.gtk_viewport_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
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
            DowncallHandles.gtk_viewport_set_scroll_to_focus.invokeExact(
                    handle(),
                    scrollToFocus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_viewport_new = Interop.downcallHandle(
            "gtk_viewport_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_viewport_get_child = Interop.downcallHandle(
            "gtk_viewport_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_viewport_get_scroll_to_focus = Interop.downcallHandle(
            "gtk_viewport_get_scroll_to_focus",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_viewport_set_child = Interop.downcallHandle(
            "gtk_viewport_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_viewport_set_scroll_to_focus = Interop.downcallHandle(
            "gtk_viewport_set_scroll_to_focus",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
