package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkLayoutChild</code> is the base class for objects that are meant to hold
 * layout properties.
 * <p>
 * If a <code>GtkLayoutManager</code> has per-child properties, like their packing type,
 * or the horizontal and vertical span, or the icon name, then the layout
 * manager should use a <code>GtkLayoutChild</code> implementation to store those properties.
 * <p>
 * A <code>GtkLayoutChild</code> instance is only ever valid while a widget is part
 * of a layout.
 */
public class LayoutChild extends org.gtk.gobject.Object {

    public LayoutChild(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LayoutChild */
    public static LayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutChild(gobject.getReference());
    }
    
    /**
     * Retrieves the <code>GtkWidget</code> associated to the given @layout_child.
     */
    public Widget getChildWidget() {
        var RESULT = gtk_h.gtk_layout_child_get_child_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the <code>GtkLayoutManager</code> instance that created the
     * given @layout_child.
     */
    public LayoutManager getLayoutManager() {
        var RESULT = gtk_h.gtk_layout_child_get_layout_manager(handle());
        return new LayoutManager(References.get(RESULT, false));
    }
    
}
