package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Layout managers are delegate classes that handle the preferred size
 * and the allocation of a widget.
 * 
 * You typically subclass `GtkLayoutManager` if you want to implement a
 * layout policy for the children of a widget, or if you want to determine
 * the size of a widget depending on its contents.
 * 
 * Each `GtkWidget` can only have a `GtkLayoutManager` instance associated
 * to it at any given time; it is possible, though, to replace the layout
 * manager instance using [method@Gtk.Widget.set_layout_manager].
 * 
 * ## Layout properties
 * 
 * A layout manager can expose properties for controlling the layout of
 * each child, by creating an object type derived from [class@Gtk.LayoutChild]
 * and installing the properties on it as normal `GObject` properties.
 * 
 * Each `GtkLayoutChild` instance storing the layout properties for a
 * specific child is created through the [method@Gtk.LayoutManager.get_layout_child]
 * method; a `GtkLayoutManager` controls the creation of its `GtkLayoutChild`
 * instances by overriding the GtkLayoutManagerClass.create_layout_child()
 * virtual function. The typical implementation should look like:
 * 
 * ```c
 * static GtkLayoutChild *
 * create_layout_child (GtkLayoutManager *manager,
 *                      GtkWidget        *container,
 *                      GtkWidget        *child)
 * {
 *   return g_object_new (your_layout_child_get_type (),
 *                        "layout-manager", manager,
 *                        "child-widget", child,
 *                        NULL);
 * }
 * ```
 * 
 * The [property@Gtk.LayoutChild:layout-manager] and
 * [property@Gtk.LayoutChild:child-widget] properties
 * on the newly created `GtkLayoutChild` instance are mandatory. The
 * `GtkLayoutManager` will cache the newly created `GtkLayoutChild` instance
 * until the widget is removed from its parent, or the parent removes the
 * layout manager.
 * 
 * Each `GtkLayoutManager` instance creating a `GtkLayoutChild` should use
 * [method@Gtk.LayoutManager.get_layout_child] every time it needs to query
 * the layout properties; each `GtkLayoutChild` instance should call
 * [method@Gtk.LayoutManager.layout_changed] every time a property is
 * updated, in order to queue a new size measuring and allocation.
 */
public class LayoutManager extends org.gtk.gobject.Object {

    public LayoutManager(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to LayoutManager */
    public static LayoutManager castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutManager(gobject.getProxy());
    }
    
    /**
     * Assigns the given @width, @height, and @baseline to
     * a @widget, and computes the position and sizes of the children of
     * the @widget using the layout management policy of @manager.
     */
    public void allocate(Widget widget, int width, int height, int baseline) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_manager_allocate(HANDLE(), widget.HANDLE(), width, height, baseline);
    }
    
    /**
     * Retrieves a `GtkLayoutChild` instance for the `GtkLayoutManager`,
     * creating one if necessary.
     * 
     * The @child widget must be a child of the widget using @manager.
     * 
     * The `GtkLayoutChild` instance is owned by the `GtkLayoutManager`,
     * and is guaranteed to exist as long as @child is a child of the
     * `GtkWidget` using the given `GtkLayoutManager`.
     */
    public LayoutChild getLayoutChild(Widget child) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_manager_get_layout_child(HANDLE(), child.HANDLE());
        return new LayoutChild(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the request mode of @manager.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_manager_get_request_mode(HANDLE());
        return SizeRequestMode.fromValue(RESULT);
    }
    
    /**
     * Retrieves the `GtkWidget` using the given `GtkLayoutManager`.
     */
    public Widget getWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_manager_get_widget(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Queues a resize on the `GtkWidget` using @manager, if any.
     * 
     * This function should be called by subclasses of `GtkLayoutManager`
     * in response to changes to their layout management policies.
     */
    public void layoutChanged() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_manager_layout_changed(HANDLE());
    }
    
}
