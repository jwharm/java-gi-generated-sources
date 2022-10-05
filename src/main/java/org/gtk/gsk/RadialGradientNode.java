package org.gtk.gsk;

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
    
    static final MethodHandle gsk_radial_gradient_node_new = Interop.downcallHandle(
        "gsk_radial_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, ColorStop[] colorStops, long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_radial_gradient_node_new.invokeExact(bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gsk_radial_gradient_node_get_center = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_center",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public org.gtk.graphene.Point getCenter() {
        try {
            var RESULT = (MemoryAddress) gsk_radial_gradient_node_get_center.invokeExact(handle());
            return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_radial_gradient_node_get_color_stops = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_color_stops",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public PointerIterator<ColorStop> getColorStops(PointerLong nStops) {
        try {
            var RESULT = (MemoryAddress) gsk_radial_gradient_node_get_color_stops.invokeExact(handle(), nStops.handle());
            return new PointerProxy<ColorStop>(RESULT, ColorStop.class).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_radial_gradient_node_get_end = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_end",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the end value for the gradient.
     */
    public float getEnd() {
        try {
            var RESULT = (float) gsk_radial_gradient_node_get_end.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_radial_gradient_node_get_hradius = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_hradius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the horizonal radius for the gradient.
     */
    public float getHradius() {
        try {
            var RESULT = (float) gsk_radial_gradient_node_get_hradius.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_radial_gradient_node_get_n_color_stops = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_n_color_stops",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        try {
            var RESULT = (long) gsk_radial_gradient_node_get_n_color_stops.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_radial_gradient_node_get_start = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_start",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the start value for the gradient.
     */
    public float getStart() {
        try {
            var RESULT = (float) gsk_radial_gradient_node_get_start.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_radial_gradient_node_get_vradius = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_vradius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the vertical radius for the gradient.
     */
    public float getVradius() {
        try {
            var RESULT = (float) gsk_radial_gradient_node_get_vradius.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
