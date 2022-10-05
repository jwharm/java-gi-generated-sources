package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a conic gradient.
 */
public class ConicGradientNode extends RenderNode {

    public ConicGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ConicGradientNode */
    public static ConicGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new ConicGradientNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_conic_gradient_node_new = Interop.downcallHandle(
        "gsk_conic_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, ColorStop[] colorStops, long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_conic_gradient_node_new.invokeExact(bounds.handle(), center.handle(), rotation, Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gsk_conic_gradient_node_get_angle = Interop.downcallHandle(
        "gsk_conic_gradient_node_get_angle",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the angle for the gradient in radians, normalized in [0, 2 * PI].
     * <p>
     * The angle is starting at the top and going clockwise, as expressed
     * in the css specification:
     * <p>
     *     angle = 90 - gsk_conic_gradient_node_get_rotation()
     */
    public float getAngle() {
        try {
            var RESULT = (float) gsk_conic_gradient_node_get_angle.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_conic_gradient_node_get_center = Interop.downcallHandle(
        "gsk_conic_gradient_node_get_center",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public org.gtk.graphene.Point getCenter() {
        try {
            var RESULT = (MemoryAddress) gsk_conic_gradient_node_get_center.invokeExact(handle());
            return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_conic_gradient_node_get_color_stops = Interop.downcallHandle(
        "gsk_conic_gradient_node_get_color_stops",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public PointerIterator<ColorStop> getColorStops(PointerLong nStops) {
        try {
            var RESULT = (MemoryAddress) gsk_conic_gradient_node_get_color_stops.invokeExact(handle(), nStops.handle());
            return new PointerProxy<ColorStop>(RESULT, ColorStop.class).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_conic_gradient_node_get_n_color_stops = Interop.downcallHandle(
        "gsk_conic_gradient_node_get_n_color_stops",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        try {
            var RESULT = (long) gsk_conic_gradient_node_get_n_color_stops.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_conic_gradient_node_get_rotation = Interop.downcallHandle(
        "gsk_conic_gradient_node_get_rotation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rotation for the gradient in degrees.
     */
    public float getRotation() {
        try {
            var RESULT = (float) gsk_conic_gradient_node_get_rotation.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
