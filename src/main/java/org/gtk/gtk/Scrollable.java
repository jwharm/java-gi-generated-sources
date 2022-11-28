package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkScrollable} is an interface for widgets with native scrolling ability.
 * <p>
 * To implement this interface you should override the
 * {@code Gtk.Scrollable:hadjustment} and
 * {@code Gtk.Scrollable:vadjustment} properties.
 * <p>
 * <strong>Creating a scrollable widget</strong><br/>
 * All scrollable widgets should do the following.
 * <ul>
 * <li>When a parent widget sets the scrollable child widget’s adjustments,
 *   the widget should connect to the {@code Gtk.Adjustment::value-changed}
 *   signal. The child widget should then populate the adjustments’ properties
 *   as soon as possible, which usually means queueing an allocation right away
 *   and populating the properties in the {@link Widget#sizeAllocate}
 *   implementation.
 * </ul>
 * <ul>
 * <li>Because its preferred size is the size for a fully expanded widget,
 *   the scrollable widget must be able to cope with underallocations.
 *   This means that it must accept any value passed to its
 *   {@link Widget#sizeAllocate} implementation.
 * </ul>
 * <ul>
 * <li>When the parent allocates space to the scrollable child widget,
 *   the widget must ensure the adjustments’ property values are correct and up
 *   to date, for example using {@link Adjustment#configure}.
 * </ul>
 * <ul>
 * <li>When any of the adjustments emits the {@code Gtk.Adjustment::value-changed}
 *   signal, the scrollable widget should scroll its contents.
 * </ul>
 */
public interface Scrollable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to Scrollable if its GType is a (or inherits from) "GtkScrollable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Scrollable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkScrollable", a ClassCastException will be thrown.
     */
    public static Scrollable castFrom(org.gtk.gobject.Object gobject) {
            return new ScrollableImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Returns the size of a non-scrolling border around the
     * outside of the scrollable.
     * <p>
     * An example for this would be treeview headers. GTK can use
     * this information to display overlaid graphics, like the
     * overshoot indication, at the right position.
     * @param border return location for the results
     * @return {@code true} if {@code border} has been set
     */
    default boolean getBorder(@NotNull org.gtk.gtk.Border border) {
        java.util.Objects.requireNonNull(border, "Parameter 'border' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrollable_get_border.invokeExact(
                    handle(),
                    border.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the {@code GtkAdjustment} used for horizontal scrolling.
     * @return horizontal {@code GtkAdjustment}.
     */
    default @Nullable org.gtk.gtk.Adjustment getHadjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrollable_get_hadjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Adjustment(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the horizontal {@code GtkScrollablePolicy}.
     * @return The horizontal {@code GtkScrollablePolicy}.
     */
    default @NotNull org.gtk.gtk.ScrollablePolicy getHscrollPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrollable_get_hscroll_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ScrollablePolicy(RESULT);
    }
    
    /**
     * Retrieves the {@code GtkAdjustment} used for vertical scrolling.
     * @return vertical {@code GtkAdjustment}.
     */
    default @Nullable org.gtk.gtk.Adjustment getVadjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrollable_get_vadjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Adjustment(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the vertical {@code GtkScrollablePolicy}.
     * @return The vertical {@code GtkScrollablePolicy}.
     */
    default @NotNull org.gtk.gtk.ScrollablePolicy getVscrollPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_scrollable_get_vscroll_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ScrollablePolicy(RESULT);
    }
    
    /**
     * Sets the horizontal adjustment of the {@code GtkScrollable}.
     * @param hadjustment a {@code GtkAdjustment}
     */
    default void setHadjustment(@Nullable org.gtk.gtk.Adjustment hadjustment) {
        try {
            DowncallHandles.gtk_scrollable_set_hadjustment.invokeExact(
                    handle(),
                    (Addressable) (hadjustment == null ? MemoryAddress.NULL : hadjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkScrollablePolicy}.
     * <p>
     * The policy determines whether horizontal scrolling should start
     * below the minimum width or below the natural width.
     * @param policy the horizontal {@code GtkScrollablePolicy}
     */
    default void setHscrollPolicy(@NotNull org.gtk.gtk.ScrollablePolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.gtk_scrollable_set_hscroll_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the vertical adjustment of the {@code GtkScrollable}.
     * @param vadjustment a {@code GtkAdjustment}
     */
    default void setVadjustment(@Nullable org.gtk.gtk.Adjustment vadjustment) {
        try {
            DowncallHandles.gtk_scrollable_set_vadjustment.invokeExact(
                    handle(),
                    (Addressable) (vadjustment == null ? MemoryAddress.NULL : vadjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkScrollablePolicy}.
     * <p>
     * The policy determines whether vertical scrolling should start
     * below the minimum height or below the natural height.
     * @param policy the vertical {@code GtkScrollablePolicy}
     */
    default void setVscrollPolicy(@NotNull org.gtk.gtk.ScrollablePolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.gtk_scrollable_set_vscroll_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_scrollable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_get_border = Interop.downcallHandle(
            "gtk_scrollable_get_border",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_get_hadjustment = Interop.downcallHandle(
            "gtk_scrollable_get_hadjustment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_get_hscroll_policy = Interop.downcallHandle(
            "gtk_scrollable_get_hscroll_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_get_vadjustment = Interop.downcallHandle(
            "gtk_scrollable_get_vadjustment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_get_vscroll_policy = Interop.downcallHandle(
            "gtk_scrollable_get_vscroll_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_set_hadjustment = Interop.downcallHandle(
            "gtk_scrollable_set_hadjustment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_set_hscroll_policy = Interop.downcallHandle(
            "gtk_scrollable_set_hscroll_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_set_vadjustment = Interop.downcallHandle(
            "gtk_scrollable_set_vadjustment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_set_vscroll_policy = Interop.downcallHandle(
            "gtk_scrollable_set_vscroll_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_scrollable_get_type = Interop.downcallHandle(
            "gtk_scrollable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class ScrollableImpl extends org.gtk.gobject.Object implements Scrollable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ScrollableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
