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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a LinearGradientNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LinearGradientNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LinearGradientNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LinearGradientNode(input);
    
    private static MemoryAddress constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_new.invokeExact(
                        bounds.handle(),
                        start.handle(),
                        end.handle(),
                        Interop.allocateNativeArray(colorStops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nColorStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public LinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the color stops in the gradient.
     * @param nStops the number of color stops in the returned array
     * @return the color stops in the gradient
     */
    public org.gtk.gsk.ColorStop[] getColorStops(Out<Long> nStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nStopsPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_get_color_stops.invokeExact(
                        handle(),
                        (Addressable) (nStops == null ? MemoryAddress.NULL : (Addressable) nStopsPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (nStops != null) nStops.set(nStopsPOINTER.get(Interop.valueLayout.C_LONG, 0));
            org.gtk.gsk.ColorStop[] resultARRAY = new org.gtk.gsk.ColorStop[nStops.get().intValue()];
            for (int I = 0; I < nStops.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = org.gtk.gsk.ColorStop.fromAddress.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Retrieves the final point of the linear gradient.
     * @return the final point
     */
    public org.gtk.graphene.Point getEnd() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_get_end.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Point.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_linear_gradient_node_get_n_color_stops.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the initial point of the linear gradient.
     * @return the initial point
     */
    public org.gtk.graphene.Point getStart() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_linear_gradient_node_get_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Point.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_linear_gradient_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_linear_gradient_node_new = Interop.downcallHandle(
                "gsk_linear_gradient_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_color_stops = Interop.downcallHandle(
                "gsk_linear_gradient_node_get_color_stops",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_end = Interop.downcallHandle(
                "gsk_linear_gradient_node_get_end",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_n_color_stops = Interop.downcallHandle(
                "gsk_linear_gradient_node_get_n_color_stops",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_start = Interop.downcallHandle(
                "gsk_linear_gradient_node_get_start",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_linear_gradient_node_get_type = Interop.downcallHandle(
                "gsk_linear_gradient_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_linear_gradient_node_get_type != null;
    }
}
