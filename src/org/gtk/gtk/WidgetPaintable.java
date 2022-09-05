package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkWidgetPaintable` is a `GdkPaintable` that displays the contents
 * of a widget.
 * 
 * `GtkWidgetPaintable` will also take care of the widget not being in a
 * state where it can be drawn (like when it isn't shown) and just draw
 * nothing or where it does not have a size (like when it is hidden) and
 * report no size in that case.
 * 
 * Of course, `GtkWidgetPaintable` allows you to monitor widgets for size
 * changes by emitting the [signal@Gdk.Paintable::invalidate-size] signal
 * whenever the size of the widget changes as well as for visual changes by
 * emitting the [signal@Gdk.Paintable::invalidate-contents] signal whenever
 * the widget changes.
 * 
 * You can use a `GtkWidgetPaintable` everywhere a `GdkPaintable` is allowed,
 * including using it on a `GtkPicture` (or one of its parents) that it was
 * set on itself via gtk_picture_set_paintable(). The paintable will take care
 * of recursion when this happens. If you do this however, ensure that the
 * [property@Gtk.Picture:can-shrink] property is set to %TRUE or you might
 * end up with an infinitely growing widget.
 */
public class WidgetPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable {

    public WidgetPaintable(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to WidgetPaintable */
    public static WidgetPaintable castFrom(org.gtk.gobject.Object gobject) {
        return new WidgetPaintable(gobject.getProxy());
    }
    
    /**
     * Creates a new widget paintable observing the given widget.
     */
    public WidgetPaintable(Widget widget) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_paintable_new(widget.HANDLE()), true));
    }
    
    /**
     * Returns the widget that is observed or %NULL if none.
     */
    public Widget getWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_paintable_get_widget(HANDLE());
        return new Widget(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the widget that should be observed.
     */
    public void setWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_paintable_set_widget(HANDLE(), widget.HANDLE());
    }
    
}
