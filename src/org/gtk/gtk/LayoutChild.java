package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLayoutChild` is the base class for objects that are meant to hold
 * layout properties.
 * 
 * If a `GtkLayoutManager` has per-child properties, like their packing type,
 * or the horizontal and vertical span, or the icon name, then the layout
 * manager should use a `GtkLayoutChild` implementation to store those properties.
 * 
 * A `GtkLayoutChild` instance is only ever valid while a widget is part
 * of a layout.
 */
public class LayoutChild extends org.gtk.gobject.Object {

    public LayoutChild(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to LayoutChild */
    public static LayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutChild(gobject.getProxy());
    }
    
    /**
     * Retrieves the `GtkWidget` associated to the given @layout_child.
     */
    public Widget getChildWidget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_child_get_child_widget(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the `GtkLayoutManager` instance that created the
     * given @layout_child.
     */
    public LayoutManager getLayoutManager() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_layout_child_get_layout_manager(HANDLE());
        return new LayoutManager(ProxyFactory.getProxy(RESULT, false));
    }
    
}
