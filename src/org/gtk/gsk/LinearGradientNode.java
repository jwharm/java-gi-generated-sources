package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a linear gradient.
 */
public class LinearGradientNode extends RenderNode {

    public LinearGradientNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LinearGradientNode */
    public static LinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new LinearGradientNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        Reference RESULT = References.get(gtk_h.gsk_linear_gradient_node_new(bounds.handle(), start.handle(), end.handle(), Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will create a linear gradient from the given
     * points and color stops, and render that into the area given by {@code bounds}.
     */
    public LinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public PointerIterator<ColorStop> getColorStops(PointerLong nStops) {
        var RESULT = gtk_h.gsk_linear_gradient_node_get_color_stops(handle(), nStops.handle());
        return new PointerProxy<ColorStop>(RESULT, ColorStop.class).iterator();
    }
    
    /**
     * Retrieves the final point of the linear gradient.
     */
    public org.gtk.graphene.Point getEnd() {
        var RESULT = gtk_h.gsk_linear_gradient_node_get_end(handle());
        return new org.gtk.graphene.Point(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        var RESULT = gtk_h.gsk_linear_gradient_node_get_n_color_stops(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the initial point of the linear gradient.
     */
    public org.gtk.graphene.Point getStart() {
        var RESULT = gtk_h.gsk_linear_gradient_node_get_start(handle());
        return new org.gtk.graphene.Point(References.get(RESULT, false));
    }
    
}
