package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_radial_gradient_node_new = Interop.downcallHandle(
        "gsk_radial_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, @NotNull float hradius, @NotNull float vradius, @NotNull float start, @NotNull float end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_radial_gradient_node_new.invokeExact(bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops), nColorStops), true);
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
    public RadialGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, @NotNull float hradius, @NotNull float vradius, @NotNull float start, @NotNull float end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops));
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_center = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_center",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the center pointer for the gradient.
     */
    public @NotNull org.gtk.graphene.Point getCenter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_radial_gradient_node_get_center.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_color_stops = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_color_stops",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public ColorStop[] getColorStops(@NotNull Out<Long> nStops) {
        MemorySegment nStopsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_radial_gradient_node_get_color_stops.invokeExact(handle(), (Addressable) nStopsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nStops.set(nStopsPOINTER.get(ValueLayout.JAVA_LONG, 0));
        ColorStop[] resultARRAY = new ColorStop[nStops.get().intValue()];
        for (int I = 0; I < nStops.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new ColorStop(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_end = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_end",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the end value for the gradient.
     */
    public float getEnd() {
        float RESULT;
        try {
            RESULT = (float) gsk_radial_gradient_node_get_end.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_hradius = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_hradius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the horizonal radius for the gradient.
     */
    public float getHradius() {
        float RESULT;
        try {
            RESULT = (float) gsk_radial_gradient_node_get_hradius.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_n_color_stops = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_n_color_stops",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) gsk_radial_gradient_node_get_n_color_stops.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_start = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_start",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the start value for the gradient.
     */
    public float getStart() {
        float RESULT;
        try {
            RESULT = (float) gsk_radial_gradient_node_get_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_radial_gradient_node_get_vradius = Interop.downcallHandle(
        "gsk_radial_gradient_node_get_vradius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the vertical radius for the gradient.
     */
    public float getVradius() {
        float RESULT;
        try {
            RESULT = (float) gsk_radial_gradient_node_get_vradius.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
