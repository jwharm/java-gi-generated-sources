package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkScrollable` is an interface for widgets with native scrolling ability.
 * 
 * To implement this interface you should override the
 * [property@Gtk.Scrollable:hadjustment] and
 * [property@Gtk.Scrollable:vadjustment] properties.
 * 
 * ## Creating a scrollable widget
 * 
 * All scrollable widgets should do the following.
 * 
 * - When a parent widget sets the scrollable child widget’s adjustments,
 *   the widget should connect to the [signal@Gtk.Adjustment::value-changed]
 *   signal. The child widget should then populate the adjustments’ properties
 *   as soon as possible, which usually means queueing an allocation right away
 *   and populating the properties in the [vfunc@Gtk.Widget.size_allocate]
 *   implementation.
 * 
 * - Because its preferred size is the size for a fully expanded widget,
 *   the scrollable widget must be able to cope with underallocations.
 *   This means that it must accept any value passed to its
 *   [vfunc@Gtk.Widget.size_allocate] implementation.
 * 
 * - When the parent allocates space to the scrollable child widget,
 *   the widget must ensure the adjustments’ property values are correct and up
 *   to date, for example using [method@Gtk.Adjustment.configure].
 * 
 * - When any of the adjustments emits the [signal@Gtk.Adjustment::value-changed]
 *   signal, the scrollable widget should scroll its contents.
 */
public interface Scrollable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns the size of a non-scrolling border around the
     * outside of the scrollable.
     * 
     * An example for this would be treeview headers. GTK can use
     * this information to display overlaid graphics, like the
     * overshoot indication, at the right position.
     */
    public default boolean getBorder(Border border) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_get_border(HANDLE(), border.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the `GtkAdjustment` used for horizontal scrolling.
     */
    public default Adjustment getHadjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_get_hadjustment(HANDLE());
        return new Adjustment(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal `GtkScrollablePolicy`.
     */
    public default ScrollablePolicy getHscrollPolicy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_get_hscroll_policy(HANDLE());
        return ScrollablePolicy.fromValue(RESULT);
    }
    
    /**
     * Retrieves the `GtkAdjustment` used for vertical scrolling.
     */
    public default Adjustment getVadjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_get_vadjustment(HANDLE());
        return new Adjustment(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the vertical `GtkScrollablePolicy`.
     */
    public default ScrollablePolicy getVscrollPolicy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_get_vscroll_policy(HANDLE());
        return ScrollablePolicy.fromValue(RESULT);
    }
    
    /**
     * Sets the horizontal adjustment of the `GtkScrollable`.
     */
    public default void setHadjustment(Adjustment hadjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_set_hadjustment(HANDLE(), hadjustment.HANDLE());
    }
    
    /**
     * Sets the `GtkScrollablePolicy`.
     * 
     * The policy determines whether horizontal scrolling should start
     * below the minimum width or below the natural width.
     */
    public default void setHscrollPolicy(ScrollablePolicy policy) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_set_hscroll_policy(HANDLE(), policy.getValue());
    }
    
    /**
     * Sets the vertical adjustment of the `GtkScrollable`.
     */
    public default void setVadjustment(Adjustment vadjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_set_vadjustment(HANDLE(), vadjustment.HANDLE());
    }
    
    /**
     * Sets the `GtkScrollablePolicy`.
     * 
     * The policy determines whether vertical scrolling should start
     * below the minimum height or below the natural height.
     */
    public default void setVscrollPolicy(ScrollablePolicy policy) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_scrollable_set_vscroll_policy(HANDLE(), policy.getValue());
    }
    
    class ScrollableImpl extends org.gtk.gobject.Object implements Scrollable {
        public ScrollableImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
