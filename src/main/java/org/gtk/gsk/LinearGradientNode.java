package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_linear_gradient_node_new = Interop.downcallHandle(
        "gsk_linear_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_linear_gradient_node_new.invokeExact(bounds.handle(), start.handle(), end.handle(), Interop.allocateNativeArray(colorStops), nColorStops), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will create a linear gradient from the given
     * points and color stops, and render that into the area given by {@code bounds}.
     */
    public LinearGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
    private static final MethodHandle gsk_linear_gradient_node_get_color_stops = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_color_stops",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color stops in the gradient.
     */
    public ColorStop[] getColorStops(@NotNull Out<Long> nStops) {
        MemorySegment nStopsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_linear_gradient_node_get_color_stops.invokeExact(handle(), (Addressable) nStopsPOINTER.address());
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
    
    private static final MethodHandle gsk_linear_gradient_node_get_end = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_end",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the final point of the linear gradient.
     */
    public @NotNull org.gtk.graphene.Point getEnd() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_linear_gradient_node_get_end.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_linear_gradient_node_get_n_color_stops = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_n_color_stops",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of color stops in the gradient.
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) gsk_linear_gradient_node_get_n_color_stops.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_linear_gradient_node_get_start = Interop.downcallHandle(
        "gsk_linear_gradient_node_get_start",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the initial point of the linear gradient.
     */
    public @NotNull org.gtk.graphene.Point getStart() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_linear_gradient_node_get_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
}
