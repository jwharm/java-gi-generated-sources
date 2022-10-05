package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public WidgetPaintable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WidgetPaintable */
    public static WidgetPaintable castFrom(org.gtk.gobject.Object gobject) {
        return new WidgetPaintable(gobject.refcounted());
    }
    
    static final MethodHandle gtk_widget_paintable_new = Interop.downcallHandle(
        "gtk_widget_paintable_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Widget widget) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_widget_paintable_new.invokeExact(widget.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new widget paintable observing the given widget.
     */
    public WidgetPaintable(Widget widget) {
        super(constructNew(widget));
    }
    
    static final MethodHandle gtk_widget_paintable_get_widget = Interop.downcallHandle(
        "gtk_widget_paintable_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the widget that is observed or {@code null} if none.
     */
    public Widget getWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_widget_paintable_get_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_paintable_set_widget = Interop.downcallHandle(
        "gtk_widget_paintable_set_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget that should be observed.
     */
    public void setWidget(Widget widget) {
        try {
            gtk_widget_paintable_set_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
