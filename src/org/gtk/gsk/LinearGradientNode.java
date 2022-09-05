package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a linear gradient.
 */
public class LinearGradientNode extends RenderNode {

    public LinearGradientNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to LinearGradientNode */
    public static LinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new LinearGradientNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will create a linear gradient from the given
     * points and color stops, and render that into the area given by @bounds.
     */
    public LinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_linear_gradient_node_new(bounds.HANDLE(), start.HANDLE(), end.HANDLE(), Interop.allocateNativeArray(colorStops), nColorStops), true));
    }
    
    /**
     * Retrieves the final point of the linear gradient.
     */
    public org.gtk.graphene.Point getEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_linear_gradient_node_get_end(HANDLE());
        return new org.gtk.graphene.Point(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_linear_gradient_node_get_n_color_stops(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the initial point of the linear gradient.
     */
    public org.gtk.graphene.Point getStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_linear_gradient_node_get_start(HANDLE());
        return new org.gtk.graphene.Point(ProxyFactory.get(RESULT, false));
    }
    
}
