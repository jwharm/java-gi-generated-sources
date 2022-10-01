package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a solid color.
 */
public class ColorNode extends RenderNode {

    public ColorNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorNode */
    public static ColorNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(org.gtk.gdk.RGBA rgba, org.gtk.graphene.Rect bounds) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_color_node_new(rgba.handle(), bounds.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render the color specified by {@code rgba} into
     * the area given by {@code bounds}.
     */
    public ColorNode(org.gtk.gdk.RGBA rgba, org.gtk.graphene.Rect bounds) {
        super(constructNew(rgba, bounds));
    }
    
    /**
     * Retrieves the color of the given {@code node}.
     */
    public org.gtk.gdk.RGBA getColor() {
        var RESULT = gtk_h.gsk_color_node_get_color(handle());
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
}
