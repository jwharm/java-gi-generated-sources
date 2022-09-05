package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a conic gradient.
 */
public class ConicGradientNode extends RenderNode {

    public ConicGradientNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ConicGradientNode */
    public static ConicGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new ConicGradientNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that draws a conic gradient.
     * 
     * The conic gradient
     * starts around @center in the direction of @rotation. A rotation of 0 means
     * that the gradient points up. Color stops are then added clockwise.
     */
    public ConicGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, ColorStop[] colorStops, long nColorStops) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_conic_gradient_node_new(bounds.HANDLE(), center.HANDLE(), rotation, Interop.allocateNativeArray(colorStops), nColorStops), true));
    }
    
    /**
     * Retrieves the angle for the gradient in radians, normalized in [0, 2 * PI].
     * 
     * The angle is starting at the top and going clockwise, as expressed
     * in the css specification:
     * 
     *     angle = 90 - gsk_conic_gradient_node_get_rotation()
     */
    public float getAngle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_conic_gradient_node_get_angle(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public org.gtk.graphene.Point getCenter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_conic_gradient_node_get_center(HANDLE());
        return new org.gtk.graphene.Point(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_conic_gradient_node_get_n_color_stops(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the rotation for the gradient in degrees.
     */
    public float getRotation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_conic_gradient_node_get_rotation(HANDLE());
        return RESULT;
    }
    
}
