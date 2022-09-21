package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a conic gradient.
 */
public class ConicGradientNode extends RenderNode {

    public ConicGradientNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConicGradientNode */
    public static ConicGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new ConicGradientNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, ColorStop[] colorStops, long nColorStops) {
        Reference RESULT = References.get(gtk_h.gsk_conic_gradient_node_new(bounds.handle(), center.handle(), rotation, Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that draws a conic gradient.
     * <p>
     * The conic gradient
     * starts around {@code center} in the direction of {@code rotation}. A rotation of 0 means
     * that the gradient points up. Color stops are then added clockwise.
     */
    public ConicGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, rotation, colorStops, nColorStops));
    }
    
    /**
     * Retrieves the angle for the gradient in radians, normalized in [0, 2 * PI].
     * <p>
     * The angle is starting at the top and going clockwise, as expressed
     * in the css specification:
     * <p>
     *     angle = 90 - gsk_conic_gradient_node_get_rotation()
     */
    public float getAngle() {
        var RESULT = gtk_h.gsk_conic_gradient_node_get_angle(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public org.gtk.graphene.Point getCenter() {
        var RESULT = gtk_h.gsk_conic_gradient_node_get_center(handle());
        return new org.gtk.graphene.Point(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        var RESULT = gtk_h.gsk_conic_gradient_node_get_n_color_stops(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the rotation for the gradient in degrees.
     */
    public float getRotation() {
        var RESULT = gtk_h.gsk_conic_gradient_node_get_rotation(handle());
        return RESULT;
    }
    
}
