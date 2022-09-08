package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public LayoutChild(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LayoutChild */
    public static LayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutChild(gobject.getReference());
    }
    
    /**
     * Retrieves the `GtkWidget` associated to the given @layout_child.
     */
    public Widget getChildWidget() {
        var RESULT = gtk_h.gtk_layout_child_get_child_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the `GtkLayoutManager` instance that created the
     * given @layout_child.
     */
    public LayoutManager getLayoutManager() {
        var RESULT = gtk_h.gtk_layout_child_get_layout_manager(handle());
        return new LayoutManager(References.get(RESULT, false));
    }
    
}
