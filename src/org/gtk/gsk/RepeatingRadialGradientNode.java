package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a repeating radial gradient.
 */
public class RepeatingRadialGradientNode extends RenderNode {

    public RepeatingRadialGradientNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to RepeatingRadialGradientNode */
    public static RepeatingRadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatingRadialGradientNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that draws a repeating radial gradient.
     * 
     * The radial gradient starts around @center. The size of the gradient
     * is dictated by @hradius in horizontal orientation and by @vradius
     * in vertial orientation.
     */
    public RepeatingRadialGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_repeating_radial_gradient_node_new(bounds.HANDLE(), center.HANDLE(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops), nColorStops), true));
    }
    
}
