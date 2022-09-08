package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a radial gradient.
 */
public class RadialGradientNode extends RenderNode {

    public RadialGradientNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RadialGradientNode */
    public static RadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RadialGradientNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that draws a radial gradient.
     * 
     * The radial gradient
     * starts around @center. The size of the gradient is dictated by @hradius
     * in horizontal orientation and by @vradius in vertial orientation.
     */
    public RadialGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        super(References.get(gtk_h.gsk_radial_gradient_node_new(bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops), nColorStops), true));
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public org.gtk.graphene.Point getCenter() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_center(handle());
        return new org.gtk.graphene.Point(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the end value for the gradient.
     */
    public float getEnd() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_end(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the horizonal radius for the gradient.
     */
    public float getHradius() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_hradius(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_n_color_stops(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the start value for the gradient.
     */
    public float getStart() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_start(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the vertical radius for the gradient.
     */
    public float getVradius() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_vradius(handle());
        return RESULT;
    }
    
}
