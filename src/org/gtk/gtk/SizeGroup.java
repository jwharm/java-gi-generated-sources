package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSizeGroup</code> groups widgets together so they all request the same size.
 * <p>
 * This is typically useful when you want a column of widgets to have the
 * same size, but you can&<code>#8217</code> t use a <code>GtkGrid</code>.
 * <p>
 * In detail, the size requested for each widget in a <code>GtkSizeGroup</code> is
 * the maximum of the sizes that would have been requested for each
 * widget in the size group if they were not in the size group. The mode
 * of the size group (see {@link org.gtk.gtk.SizeGroup<code>#setMode</code> ) determines whether
 * this applies to the horizontal size, the vertical size, or both sizes.
 * <p>
 * Note that size groups only affect the amount of space requested, not
 * the size that the widgets finally receive. If you want the widgets in
 * a <code>GtkSizeGroup</code> to actually be the same size, you need to pack them in
 * such a way that they get the size they request and not more.
 * <p><code>GtkSizeGroup</code> objects are referenced by each widget in the size group,
 * so once you have added all widgets to a <code>GtkSizeGroup</code>, you can drop
 * the initial reference to the size group with g_object_unref(). If the
 * widgets in the size group are subsequently destroyed, then they will
 * be removed from the size group and drop their references on the size
 * group; when all widgets have been removed, the size group will be
 * freed.
 * <p>
 * Widgets can be part of multiple size groups; GTK will compute the
 * horizontal size of a widget from the horizontal requisition of all
 * widgets that can be reached from the widget by a chain of size groups
 * of type {@link org.gtk.gtk.SizeGroupMode<code>#HORIZONTAL</code>  or {@link org.gtk.gtk.SizeGroupMode<code>#BOTH</code>   and the
 * vertical size from the vertical requisition of all widgets that can be
 * reached from the widget by a chain of size groups of type
 * {@link org.gtk.gtk.SizeGroupMode<code>#VERTICAL</code>  or {@link org.gtk.gtk.SizeGroupMode<code>#BOTH</code>  
 * <p>
 * Note that only non-contextual sizes of every widget are ever consulted
 * by size groups (since size groups have no knowledge of what size a widget
 * will be allocated in one dimension, it cannot derive how much height
 * a widget will receive for a given width). When grouping widgets that
 * trade height for width in mode {@link org.gtk.gtk.SizeGroupMode<code>#VERTICAL</code>  or {@link org.gtk.gtk.SizeGroupMode<code>#BOTH</code>  
 * the height for the minimum width will be the requested height for all
 * widgets in the group. The same is of course true when horizontally grouping
 * width for height widgets.
 * <p>
 * Widgets that trade height-for-width should set a reasonably large minimum
 * width by way of {@link [property@Gtk.Label:width-chars] (ref=property)} for instance. Widgets with
 * static sizes as well as widgets that grow (such as ellipsizing text) need no
 * such considerations.
 * <p>
 * <h1>GtkSizeGroup as GtkBuildable</h1>
 * <p>
 * Size groups can be specified in a UI definition by placing an &<code>#60</code> object&<code>#62</code> 
 * element with <code>class=&<code>#34</code> GtkSizeGroup&<code>#34</code> </code> somewhere in the UI definition. The
 * widgets that belong to the size group are specified by a &<code>#60</code> widgets&<code>#62</code>  element
 * that may contain multiple &<code>#60</code> widget&<code>#62</code>  elements, one for each member of the
 * size group. The &<code>#8221</code> name&<code>#8221</code>  attribute gives the id of the widget.
 * <p>
 * An example of a UI definition fragment with <code>GtkSizeGroup</code>:<pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkSizeGroup&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> property name=&<code>#34</code> mode&<code>#34</code> &<code>#62</code> horizontal&<code>#60</code> /property&<code>#62</code> 
 *   &<code>#60</code> widgets&<code>#62</code> 
 *     &<code>#60</code> widget name=&<code>#34</code> radio1&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> widget name=&<code>#34</code> radio2&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /widgets&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 */
public class SizeGroup extends org.gtk.gobject.Object implements Buildable {

    public SizeGroup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SizeGroup */
    public static SizeGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SizeGroup(gobject.getReference());
    }
    
    private static Reference constructNew(SizeGroupMode mode) {
        Reference RESULT = References.get(gtk_h.gtk_size_group_new(mode.getValue()), true);
        return RESULT;
    }
    
    /**
     * Create a new <code>GtkSizeGroup</code>.
     */
    public SizeGroup(SizeGroupMode mode) {
        super(constructNew(mode));
    }
    
    /**
     * Adds a widget to a <code>GtkSizeGroup</code>.
     * 
     * In the future, the requisition
     * of the widget will be determined as the maximum of its requisition
     * and the requisition of the other widgets in the size group.
     * Whether this applies horizontally, vertically, or in both directions
     * depends on the mode of the size group.
     * See {@link org.gtk.gtk.SizeGroup<code>#setMode</code> .
     * 
     * When the widget is destroyed or no longer referenced elsewhere, it
     * will be removed from the size group.
     */
    public void addWidget(Widget widget) {
        gtk_h.gtk_size_group_add_widget(handle(), widget.handle());
    }
    
    /**
     * Gets the current mode of the size group.
     */
    public SizeGroupMode getMode() {
        var RESULT = gtk_h.gtk_size_group_get_mode(handle());
        return SizeGroupMode.fromValue(RESULT);
    }
    
    /**
     * Returns the list of widgets associated with @size_group.
     */
    public org.gtk.glib.SList getWidgets() {
        var RESULT = gtk_h.gtk_size_group_get_widgets(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Removes a widget from a <code>GtkSizeGroup</code>.
     */
    public void removeWidget(Widget widget) {
        gtk_h.gtk_size_group_remove_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the <code>GtkSizeGroupMode</code> of the size group.
     * 
     * The mode of the size group determines whether the widgets in the
     * size group should all have the same horizontal requisition
     * ({@link org.gtk.gtk.SizeGroupMode<code>#HORIZONTAL</code>   all have the same vertical requisition
     * ({@link org.gtk.gtk.SizeGroupMode<code>#VERTICAL</code>  , or should all have the same requisition
     * in both directions ({@link org.gtk.gtk.SizeGroupMode<code>#BOTH</code>  .
     */
    public void setMode(SizeGroupMode mode) {
        gtk_h.gtk_size_group_set_mode(handle(), mode.getValue());
    }
    
}
