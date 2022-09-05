package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a solid color.
 */
public class ColorNode extends RenderNode {

    public ColorNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ColorNode */
    public static ColorNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will render the color specified by @rgba into
     * the area given by @bounds.
     */
    public ColorNode(org.gtk.gdk.RGBA rgba, org.gtk.graphene.Rect bounds) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_color_node_new(rgba.HANDLE(), bounds.HANDLE()), true));
    }
    
    /**
     * Retrieves the color of the given @node.
     */
    public org.gtk.gdk.RGBA getColor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_color_node_get_color(HANDLE());
        return new org.gtk.gdk.RGBA(ProxyFactory.get(RESULT, false));
    }
    
}
