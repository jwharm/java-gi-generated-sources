package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSizeGroup` groups widgets together so they all request the same size.
 * 
 * This is typically useful when you want a column of widgets to have the
 * same size, but you can’t use a `GtkGrid`.
 * 
 * In detail, the size requested for each widget in a `GtkSizeGroup` is
 * the maximum of the sizes that would have been requested for each
 * widget in the size group if they were not in the size group. The mode
 * of the size group (see [method@Gtk.SizeGroup.set_mode]) determines whether
 * this applies to the horizontal size, the vertical size, or both sizes.
 * 
 * Note that size groups only affect the amount of space requested, not
 * the size that the widgets finally receive. If you want the widgets in
 * a `GtkSizeGroup` to actually be the same size, you need to pack them in
 * such a way that they get the size they request and not more.
 * 
 * `GtkSizeGroup` objects are referenced by each widget in the size group,
 * so once you have added all widgets to a `GtkSizeGroup`, you can drop
 * the initial reference to the size group with g_object_unref(). If the
 * widgets in the size group are subsequently destroyed, then they will
 * be removed from the size group and drop their references on the size
 * group; when all widgets have been removed, the size group will be
 * freed.
 * 
 * Widgets can be part of multiple size groups; GTK will compute the
 * horizontal size of a widget from the horizontal requisition of all
 * widgets that can be reached from the widget by a chain of size groups
 * of type %GTK_SIZE_GROUP_HORIZONTAL or %GTK_SIZE_GROUP_BOTH, and the
 * vertical size from the vertical requisition of all widgets that can be
 * reached from the widget by a chain of size groups of type
 * %GTK_SIZE_GROUP_VERTICAL or %GTK_SIZE_GROUP_BOTH.
 * 
 * Note that only non-contextual sizes of every widget are ever consulted
 * by size groups (since size groups have no knowledge of what size a widget
 * will be allocated in one dimension, it cannot derive how much height
 * a widget will receive for a given width). When grouping widgets that
 * trade height for width in mode %GTK_SIZE_GROUP_VERTICAL or %GTK_SIZE_GROUP_BOTH:
 * the height for the minimum width will be the requested height for all
 * widgets in the group. The same is of course true when horizontally grouping
 * width for height widgets.
 * 
 * Widgets that trade height-for-width should set a reasonably large minimum
 * width by way of [property@Gtk.Label:width-chars] for instance. Widgets with
 * static sizes as well as widgets that grow (such as ellipsizing text) need no
 * such considerations.
 * 
 * # GtkSizeGroup as GtkBuildable
 * 
 * Size groups can be specified in a UI definition by placing an <object>
 * element with `class="GtkSizeGroup"` somewhere in the UI definition. The
 * widgets that belong to the size group are specified by a <widgets> element
 * that may contain multiple <widget> elements, one for each member of the
 * size group. The ”name” attribute gives the id of the widget.
 * 
 * An example of a UI definition fragment with `GtkSizeGroup`:
 * ```xml
 * <object class="GtkSizeGroup">
 *   <property name="mode">horizontal</property>
 *   <widgets>
 *     <widget name="radio1"/>
 *     <widget name="radio2"/>
 *   </widgets>
 * </object>
 * ```
 */
public class SizeGroup extends org.gtk.gobject.Object implements Buildable {

    public SizeGroup(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SizeGroup */
    public static SizeGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SizeGroup(gobject.getProxy());
    }
    
    /**
     * Create a new `GtkSizeGroup`.
     */
    public SizeGroup(SizeGroupMode mode) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_size_group_new(mode.getValue()), true));
    }
    
    /**
     * Adds a widget to a `GtkSizeGroup`.
     * 
     * In the future, the requisition
     * of the widget will be determined as the maximum of its requisition
     * and the requisition of the other widgets in the size group.
     * Whether this applies horizontally, vertically, or in both directions
     * depends on the mode of the size group.
     * See [method@Gtk.SizeGroup.set_mode].
     * 
     * When the widget is destroyed or no longer referenced elsewhere, it
     * will be removed from the size group.
     */
    public void addWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_size_group_add_widget(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Gets the current mode of the size group.
     */
    public SizeGroupMode getMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_size_group_get_mode(HANDLE());
        return SizeGroupMode.fromValue(RESULT);
    }
    
    /**
     * Returns the list of widgets associated with @size_group.
     */
    public org.gtk.glib.SList getWidgets() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_size_group_get_widgets(HANDLE());
        return new org.gtk.glib.SList(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Removes a widget from a `GtkSizeGroup`.
     */
    public void removeWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_size_group_remove_widget(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Sets the `GtkSizeGroupMode` of the size group.
     * 
     * The mode of the size group determines whether the widgets in the
     * size group should all have the same horizontal requisition
     * (%GTK_SIZE_GROUP_HORIZONTAL) all have the same vertical requisition
     * (%GTK_SIZE_GROUP_VERTICAL), or should all have the same requisition
     * in both directions (%GTK_SIZE_GROUP_BOTH).
     */
    public void setMode(SizeGroupMode mode) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_size_group_set_mode(HANDLE(), mode.getValue());
    }
    
}
