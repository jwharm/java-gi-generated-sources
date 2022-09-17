package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a repeating linear gradient.
 */
public class RepeatingLinearGradientNode extends RenderNode {

    public RepeatingLinearGradientNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RepeatingLinearGradientNode */
    public static RepeatingLinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatingLinearGradientNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        Reference RESULT = References.get(gtk_h.gsk_repeating_linear_gradient_node_new(bounds.handle(), start.handle(), end.handle(), Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GskRenderNode</code> that will create a repeating linear gradient
     * from the given points and color stops, and render that into the area
     * given by @bounds.
     */
    public RepeatingLinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
}
