package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkWidgetPaintable} is a {@code GdkPaintable} that displays the contents
 * of a widget.
 * <p>
 * {@code GtkWidgetPaintable} will also take care of the widget not being in a
 * state where it can be drawn (like when it isn't shown) and just draw
 * nothing or where it does not have a size (like when it is hidden) and
 * report no size in that case.
 * <p>
 * Of course, {@code GtkWidgetPaintable} allows you to monitor widgets for size
 * changes by emitting the {@code Gdk.Paintable::invalidate-size} signal
 * whenever the size of the widget changes as well as for visual changes by
 * emitting the {@code Gdk.Paintable::invalidate-contents} signal whenever
 * the widget changes.
 * <p>
 * You can use a {@code GtkWidgetPaintable} everywhere a {@code GdkPaintable} is allowed,
 * including using it on a {@code GtkPicture} (or one of its parents) that it was
 * set on itself via gtk_picture_set_paintable(). The paintable will take care
 * of recursion when this happens. If you do this however, ensure that the
 * {@code Gtk.Picture:can-shrink} property is set to {@code true} or you might
 * end up with an infinitely growing widget.
 */
public class WidgetPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable {
    
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
    
    public WidgetPaintable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WidgetPaintable */
    public static WidgetPaintable castFrom(org.gtk.gobject.Object gobject) {
        return new WidgetPaintable(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_widget_paintable_new.invokeExact(widget.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new widget paintable observing the given widget.
     * @param widget a {@code GtkWidget}
     */
    public WidgetPaintable(@Nullable org.gtk.gtk.Widget widget) {
        super(constructNew(widget));
    }
    
    /**
     * Returns the widget that is observed or {@code null} if none.
     * @return the observed widget.
     */
    public @Nullable org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_paintable_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the widget that should be observed.
     * @param widget the widget to observe
     */
    public void setWidget(@Nullable org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_widget_paintable_set_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_widget_paintable_new = Interop.downcallHandle(
            "gtk_widget_paintable_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_paintable_get_widget = Interop.downcallHandle(
            "gtk_widget_paintable_get_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_paintable_set_widget = Interop.downcallHandle(
            "gtk_widget_paintable_set_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
