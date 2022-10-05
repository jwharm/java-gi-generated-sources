package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkScrollable} is an interface for widgets with native scrolling ability.
 * <p>
 * To implement this interface you should override the
 * {@code Gtk.Scrollable:hadjustment} and
 * {@code Gtk.Scrollable:vadjustment} properties.
 * <p>
 * <h2>Creating a scrollable widget</h2>
 * <p>
 * All scrollable widgets should do the following.
 * <p>
 * <ul>
 * <li>When a parent widget sets the scrollable child widget’s adjustments,
 *   the widget should connect to the {@code Gtk.Adjustment::value-changed}
 *   signal. The child widget should then populate the adjustments’ properties
 *   as soon as possible, which usually means queueing an allocation right away
 *   and populating the properties in the {@link Widget#sizeAllocate}
 *   implementation.
 * </ul>
 * <p>
 * <ul>
 * <li>Because its preferred size is the size for a fully expanded widget,
 *   the scrollable widget must be able to cope with underallocations.
 *   This means that it must accept any value passed to its
 *   {@link Widget#sizeAllocate} implementation.
 * </ul>
 * <p>
 * <ul>
 * <li>When the parent allocates space to the scrollable child widget,
 *   the widget must ensure the adjustments’ property values are correct and up
 *   to date, for example using {@link Adjustment#configure}.
 * </ul>
 * <p>
 * <ul>
 * <li>When any of the adjustments emits the {@code Gtk.Adjustment::value-changed}
 *   signal, the scrollable widget should scroll its contents.
 */
public interface Scrollable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_scrollable_get_border = Interop.downcallHandle(
        "gtk_scrollable_get_border",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the size of a non-scrolling border around the
     * outside of the scrollable.
     * <p>
     * An example for this would be treeview headers. GTK can use
     * this information to display overlaid graphics, like the
     * overshoot indication, at the right position.
     */
    public default boolean getBorder(Border border) {
        try {
            var RESULT = (int) gtk_scrollable_get_border.invokeExact(handle(), border.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_get_hadjustment = Interop.downcallHandle(
        "gtk_scrollable_get_hadjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkAdjustment} used for horizontal scrolling.
     */
    public default Adjustment getHadjustment() {
        try {
            var RESULT = (MemoryAddress) gtk_scrollable_get_hadjustment.invokeExact(handle());
            return new Adjustment(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_get_hscroll_policy = Interop.downcallHandle(
        "gtk_scrollable_get_hscroll_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the horizontal {@code GtkScrollablePolicy}.
     */
    public default ScrollablePolicy getHscrollPolicy() {
        try {
            var RESULT = (int) gtk_scrollable_get_hscroll_policy.invokeExact(handle());
            return new ScrollablePolicy(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_get_vadjustment = Interop.downcallHandle(
        "gtk_scrollable_get_vadjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkAdjustment} used for vertical scrolling.
     */
    public default Adjustment getVadjustment() {
        try {
            var RESULT = (MemoryAddress) gtk_scrollable_get_vadjustment.invokeExact(handle());
            return new Adjustment(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_get_vscroll_policy = Interop.downcallHandle(
        "gtk_scrollable_get_vscroll_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the vertical {@code GtkScrollablePolicy}.
     */
    public default ScrollablePolicy getVscrollPolicy() {
        try {
            var RESULT = (int) gtk_scrollable_get_vscroll_policy.invokeExact(handle());
            return new ScrollablePolicy(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_set_hadjustment = Interop.downcallHandle(
        "gtk_scrollable_set_hadjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the horizontal adjustment of the {@code GtkScrollable}.
     */
    public default void setHadjustment(Adjustment hadjustment) {
        try {
            gtk_scrollable_set_hadjustment.invokeExact(handle(), hadjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_set_hscroll_policy = Interop.downcallHandle(
        "gtk_scrollable_set_hscroll_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkScrollablePolicy}.
     * <p>
     * The policy determines whether horizontal scrolling should start
     * below the minimum width or below the natural width.
     */
    public default void setHscrollPolicy(ScrollablePolicy policy) {
        try {
            gtk_scrollable_set_hscroll_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_set_vadjustment = Interop.downcallHandle(
        "gtk_scrollable_set_vadjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the vertical adjustment of the {@code GtkScrollable}.
     */
    public default void setVadjustment(Adjustment vadjustment) {
        try {
            gtk_scrollable_set_vadjustment.invokeExact(handle(), vadjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_scrollable_set_vscroll_policy = Interop.downcallHandle(
        "gtk_scrollable_set_vscroll_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkScrollablePolicy}.
     * <p>
     * The policy determines whether vertical scrolling should start
     * below the minimum height or below the natural height.
     */
    public default void setVscrollPolicy(ScrollablePolicy policy) {
        try {
            gtk_scrollable_set_vscroll_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class ScrollableImpl extends org.gtk.gobject.Object implements Scrollable {
        public ScrollableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
