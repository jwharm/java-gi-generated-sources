package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a linear gradient.
 */
public class LinearGradientNode extends RenderNode {

    public LinearGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LinearGradientNode */
    public static LinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new LinearGradientNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_linear_gradient_node_new = Interop.downcallHandle(
        "gsk_linear_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_linear_gradient_node_new.invokeExact(bounds.handle(), start.handle(), end.handle(), Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will create a linear gradient from the given
     * points and color stops, and render that into the area given by {@code bounds}.
     */
    public LinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
    static final MethodHandle gsk_linear_gradient_node_get_color_stops = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_color_stops",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public PointerProxy<ColorStop> getColorStops(PointerLong nStops) {
        try {
            var RESULT = (MemoryAddress) gsk_linear_gradient_node_get_color_stops.invokeExact(handle(), nStops.handle());
            return new PointerProxy<ColorStop>(RESULT, ColorStop.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_linear_gradient_node_get_end = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_end",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the final point of the linear gradient.
     */
    public org.gtk.graphene.Point getEnd() {
        try {
            var RESULT = (MemoryAddress) gsk_linear_gradient_node_get_end.invokeExact(handle());
            return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_linear_gradient_node_get_n_color_stops = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_n_color_stops",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        try {
            var RESULT = (long) gsk_linear_gradient_node_get_n_color_stops.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_linear_gradient_node_get_start = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_start",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the initial point of the linear gradient.
     */
    public org.gtk.graphene.Point getStart() {
        try {
            var RESULT = (MemoryAddress) gsk_linear_gradient_node_get_start.invokeExact(handle());
            return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
