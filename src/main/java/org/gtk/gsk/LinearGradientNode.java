package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a linear gradient.
 */
public class LinearGradientNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskLinearGradientNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public LinearGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to LinearGradientNode if its GType is a (or inherits from) "GskLinearGradientNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "LinearGradientNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskLinearGradientNode", a ClassCastException will be thrown.
     */
    public static LinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskLinearGradientNode"))) {
            return new LinearGradientNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskLinearGradientNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        java.util.Objects.requireNonNull(colorStops, "Parameter 'colorStops' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_linear_gradient_node_new.invokeExact(
                    bounds.handle(),
                    start.handle(),
                    end.handle(),
                    Interop.allocateNativeArray(colorStops, false),
                    nColorStops), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will create a linear gradient from the given
     * points and color stops, and render that into the area given by {@code bounds}.
     * @param bounds the rectangle to render the linear gradient into
     * @param start the point at which the linear gradient will begin
     * @param end the point at which the linear gradient will finish
     * @param colorStops a pointer to an array of
     *   {@code GskColorStop} defining the gradient. The offsets of all color stops
     *   must be increasing. The first stop's offset must be &gt;= 0 and the last
     *   stop's offset must be &lt;= 1.
     * @param nColorStops the number of elements in {@code color_stops}
     */
    public LinearGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
    /**
     * Retrieves the color stops in the gradient.
     * @param nStops the number of color stops in the returned array
     * @return the color stops in the gradient
     */
    public @NotNull org.gtk.gsk.ColorStop[] getColorStops(Out<Long> nStops) {
        java.util.Objects.requireNonNull(nStops, "Parameter 'nStops' must not be null");
        MemorySegment nStopsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_get_color_stops.invokeExact(
                    handle(),
                    (Addressable) nStopsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nStops.set(nStopsPOINTER.get(ValueLayout.JAVA_LONG, 0));
        org.gtk.gsk.ColorStop[] resultARRAY = new org.gtk.gsk.ColorStop[nStops.get().intValue()];
        for (int I = 0; I < nStops.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gsk.ColorStop(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    /**
     * Retrieves the final point of the linear gradient.
     * @return the final point
     */
    public @NotNull org.gtk.graphene.Point getEnd() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_get_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_linear_gradient_node_get_n_color_stops.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the initial point of the linear gradient.
     * @return the initial point
     */
    public @NotNull org.gtk.graphene.Point getStart() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_get_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_linear_gradient_node_new = Interop.downcallHandle(
            "gsk_linear_gradient_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_color_stops = Interop.downcallHandle(
            "gsk_linear_gradient_node_get_color_stops",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_end = Interop.downcallHandle(
            "gsk_linear_gradient_node_get_end",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_n_color_stops = Interop.downcallHandle(
            "gsk_linear_gradient_node_get_n_color_stops",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_start = Interop.downcallHandle(
            "gsk_linear_gradient_node_get_start",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
