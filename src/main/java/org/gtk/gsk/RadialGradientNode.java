package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a radial gradient.
 */
public class RadialGradientNode extends RenderNode {

    public RadialGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RadialGradientNode */
    public static RadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RadialGradientNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_radial_gradient_node_new(bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that draws a radial gradient.
     * <p>
     * The radial gradient
     * starts around {@code center}. The size of the gradient is dictated by {@code hradius}
     * in horizontal orientation and by {@code vradius} in vertial orientation.
     */
    public RadialGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops));
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public org.gtk.graphene.Point getCenter() {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_center(handle());
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public PointerIterator<ColorStop> getColorStops(PointerLong nStops) {
        var RESULT = gtk_h.gsk_radial_gradient_node_get_color_stops(handle(), nStops.handle());
        return new PointerProxy<ColorStop>(RESULT, ColorStop.class).iterator();
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
