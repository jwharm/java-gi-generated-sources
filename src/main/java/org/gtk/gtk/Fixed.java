package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFixed} places its child widgets at fixed positions and with fixed sizes.
 * <p>
 * {@code GtkFixed} performs no automatic layout management.
 * <p>
 * For most applications, you should not use this container! It keeps
 * you from having to learn about the other GTK containers, but it
 * results in broken applications.  With {@code GtkFixed}, the following
 * things will result in truncated text, overlapping widgets, and
 * other display bugs:
 * <ul>
 * <li>Themes, which may change widget sizes.
 * </ul>
 * <ul>
 * <li>Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different fonts.
 * </ul>
 * <ul>
 * <li>Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 * </ul>
 * <p>
 * In addition, {@code GtkFixed} does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately for the text direction, e.g. to put labels to
 * the right of the thing they label when using an RTL language, but it can’t
 * do that with {@code GtkFixed}. So if you need to reorder widgets depending on
 * the text direction, you would need to manually detect it and adjust child
 * positions accordingly.
 * <p>
 * Finally, fixed positioning makes it kind of annoying to add/remove
 * UI elements, since you have to reposition all the other elements. This
 * is a long-term maintenance problem for your application.
 * <p>
 * If you know none of these things are an issue for your application,
 * and prefer the simplicity of {@code GtkFixed}, by all means use the
 * widget. But you should be aware of the tradeoffs.
 */
public class Fixed extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName("GtkFixed");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Fixed(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Fixed */
    public static Fixed castFrom(org.gtk.gobject.Object gobject) {
        return new Fixed(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_fixed_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFixed}.
     */
    public Fixed() {
        super(constructNew());
    }
    
    /**
     * Retrieves the translation transformation of the
     * given child {@code GtkWidget} in the {@code GtkFixed}.
     * <p>
     * See also: {@link Fixed#getChildTransform}.
     * @param widget a child of {@code fixed}
     * @param x the horizontal position of the {@code widget}
     * @param y the vertical position of the {@code widget}
     */
    public void getChildPosition(@NotNull org.gtk.gtk.Widget widget, Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.gtk_fixed_get_child_position.invokeExact(handle(), widget.handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    /**
     * Retrieves the transformation for {@code widget} set using
     * gtk_fixed_set_child_transform().
     * @param widget a {@code GtkWidget}, child of {@code fixed}
     * @return a {@code GskTransform}
     */
    public @Nullable org.gtk.gsk.Transform getChildTransform(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_get_child_transform.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Transform(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets a translation transformation to the given {@code x} and {@code y}
     * coordinates to the child {@code widget} of the {@code GtkFixed}.
     * @param widget the child widget
     * @param x the horizontal position to move the widget to
     * @param y the vertical position to move the widget to
     */
    public void move(@NotNull org.gtk.gtk.Widget widget, double x, double y) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_fixed_move.invokeExact(handle(), widget.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a widget to a {@code GtkFixed} at the given position.
     * @param widget the widget to add
     * @param x the horizontal position to place the widget at
     * @param y the vertical position to place the widget at
     */
    public void put(@NotNull org.gtk.gtk.Widget widget, double x, double y) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_fixed_put.invokeExact(handle(), widget.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code fixed}.
     * @param widget the child widget to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_fixed_remove.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transformation for {@code widget}.
     * <p>
     * This is a convenience function that retrieves the
     * {@link FixedLayoutChild} instance associated to
     * {@code widget} and calls {@link FixedLayoutChild#setTransform}.
     * @param widget a {@code GtkWidget}, child of {@code fixed}
     * @param transform the transformation assigned to {@code widget}
     *   to reset {@code widget}'s transform
     */
    public void setChildTransform(@NotNull org.gtk.gtk.Widget widget, @Nullable org.gtk.gsk.Transform transform) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNullElse(transform, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_fixed_set_child_transform.invokeExact(handle(), widget.handle(), transform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_fixed_new = Interop.downcallHandle(
            "gtk_fixed_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_fixed_get_child_position = Interop.downcallHandle(
            "gtk_fixed_get_child_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_fixed_get_child_transform = Interop.downcallHandle(
            "gtk_fixed_get_child_transform",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_fixed_move = Interop.downcallHandle(
            "gtk_fixed_move",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
        );
        
        private static final MethodHandle gtk_fixed_put = Interop.downcallHandle(
            "gtk_fixed_put",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
        );
        
        private static final MethodHandle gtk_fixed_remove = Interop.downcallHandle(
            "gtk_fixed_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_fixed_set_child_transform = Interop.downcallHandle(
            "gtk_fixed_set_child_transform",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
