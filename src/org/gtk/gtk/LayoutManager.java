package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Layout managers are delegate classes that handle the preferred size
 * and the allocation of a widget.
 * <p>
 * You typically subclass <code>GtkLayoutManager</code> if you want to implement a
 * layout policy for the children of a widget, or if you want to determine
 * the size of a widget depending on its contents.
 * <p>
 * Each <code>GtkWidget</code> can only have a <code>GtkLayoutManager</code> instance associated
 * to it at any given time; it is possible, though, to replace the layout
 * manager instance using {@link org.gtk.gtk.Widget<code>#setLayoutManager</code> .
 * <p>
 * <h2>Layout properties</h2>
 * <p>
 * A layout manager can expose properties for controlling the layout of
 * each child, by creating an object type derived from {@link org.gtk.gtk.LayoutChild}
 * and installing the properties on it as normal <code>GObject</code> properties.
 * <p>
 * Each <code>GtkLayoutChild</code> instance storing the layout properties for a
 * specific child is created through the {@link org.gtk.gtk.LayoutManager<code>#getLayoutChild</code> 
 * method; a <code>GtkLayoutManager</code> controls the creation of its <code>GtkLayoutChild</code>
 * instances by overriding the GtkLayoutManagerClass.create_layout_child()
 * virtual function. The typical implementation should look like:
 * <p><pre>c
 * static GtkLayoutChild *
 * create_layout_child (GtkLayoutManager *manager,
 *                      GtkWidget        *container,
 *                      GtkWidget        *child)
 * {
 *   return g_object_new (your_layout_child_get_type (),
 *                        &<code>#34</code> layout-manager&<code>#34</code> , manager,
 *                        &<code>#34</code> child-widget&<code>#34</code> , child,
 *                        NULL);
 * }
 * </pre>
 * <p>
 * The {@link [property@Gtk.LayoutChild:layout-manager] (ref=property)} and
 * {@link [property@Gtk.LayoutChild:child-widget] (ref=property)} properties
 * on the newly created <code>GtkLayoutChild</code> instance are mandatory. The<code>GtkLayoutManager</code> will cache the newly created <code>GtkLayoutChild</code> instance
 * until the widget is removed from its parent, or the parent removes the
 * layout manager.
 * <p>
 * Each <code>GtkLayoutManager</code> instance creating a <code>GtkLayoutChild</code> should use
 * {@link org.gtk.gtk.LayoutManager<code>#getLayoutChild</code>  every time it needs to query
 * the layout properties; each <code>GtkLayoutChild</code> instance should call
 * {@link org.gtk.gtk.LayoutManager<code>#layoutChanged</code>  every time a property is
 * updated, in order to queue a new size measuring and allocation.
 */
public class LayoutManager extends org.gtk.gobject.Object {

    public LayoutManager(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LayoutManager */
    public static LayoutManager castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutManager(gobject.getReference());
    }
    
    /**
     * Assigns the given @width, @height, and @baseline to
     * a @widget, and computes the position and sizes of the children of
     * the @widget using the layout management policy of @manager.
     */
    public void allocate(Widget widget, int width, int height, int baseline) {
        gtk_h.gtk_layout_manager_allocate(handle(), widget.handle(), width, height, baseline);
    }
    
    /**
     * Retrieves a <code>GtkLayoutChild</code> instance for the <code>GtkLayoutManager</code>,
     * creating one if necessary.
     * <p>
     * The @child widget must be a child of the widget using @manager.
     * <p>
     * The <code>GtkLayoutChild</code> instance is owned by the <code>GtkLayoutManager</code>,
     * and is guaranteed to exist as long as @child is a child of the<code>GtkWidget</code> using the given <code>GtkLayoutManager</code>.
     */
    public LayoutChild getLayoutChild(Widget child) {
        var RESULT = gtk_h.gtk_layout_manager_get_layout_child(handle(), child.handle());
        return new LayoutChild(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the request mode of @manager.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = gtk_h.gtk_layout_manager_get_request_mode(handle());
        return SizeRequestMode.fromValue(RESULT);
    }
    
    /**
     * Retrieves the <code>GtkWidget</code> using the given <code>GtkLayoutManager</code>.
     */
    public Widget getWidget() {
        var RESULT = gtk_h.gtk_layout_manager_get_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Queues a resize on the <code>GtkWidget</code> using @manager, if any.
     * <p>
     * This function should be called by subclasses of <code>GtkLayoutManager</code>
     * in response to changes to their layout management policies.
     */
    public void layoutChanged() {
        gtk_h.gtk_layout_manager_layout_changed(handle());
    }
    
}
