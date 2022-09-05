package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a repeating linear gradient.
 */
public class RepeatingLinearGradientNode extends RenderNode {

    public RepeatingLinearGradientNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to RepeatingLinearGradientNode */
    public static RepeatingLinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatingLinearGradientNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will create a repeating linear gradient
     * from the given points and color stops, and render that into the area
     * given by @bounds.
     */
    public RepeatingLinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_repeating_linear_gradient_node_new(bounds.HANDLE(), start.HANDLE(), end.HANDLE(), Interop.allocateNativeArray(colorStops), nColorStops), true));
    }
    
}
