package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a repeating radial gradient.
 */
public class RepeatingRadialGradientNode extends RenderNode {

    public RepeatingRadialGradientNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RepeatingRadialGradientNode */
    public static RepeatingRadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatingRadialGradientNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        Reference RESULT = References.get(gtk_h.gsk_repeating_radial_gradient_node_new(bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GskRenderNode</code> that draws a repeating radial gradient.
     * 
     * The radial gradient starts around @center. The size of the gradient
     * is dictated by @hradius in horizontal orientation and by @vradius
     * in vertial orientation.
     */
    public RepeatingRadialGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops));
    }
    
}
