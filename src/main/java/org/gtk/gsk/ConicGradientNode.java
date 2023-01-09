package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a conic gradient.
 */
public class ConicGradientNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskConicGradientNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ConicGradientNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ConicGradientNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConicGradientNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ConicGradientNode(input);
    
    private static MemoryAddress constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_conic_gradient_node_new.invokeExact(
                        bounds.handle(),
                        center.handle(),
                        rotation,
                        Interop.allocateNativeArray(colorStops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nColorStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that draws a conic gradient.
     * <p>
     * The conic gradient
     * starts around {@code center} in the direction of {@code rotation}. A rotation of 0 means
     * that the gradient points up. Color stops are then added clockwise.
     * @param bounds the bounds of the node
     * @param center the center of the gradient
     * @param rotation the rotation of the gradient in degrees
     * @param colorStops a pointer to an array of
     *   {@code GskColorStop} defining the gradient. The offsets of all color stops
     *   must be increasing. The first stop's offset must be &gt;= 0 and the last
     *   stop's offset must be &lt;= 1.
     * @param nColorStops the number of elements in {@code color_stops}
     */
    public ConicGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, rotation, colorStops, nColorStops));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the angle for the gradient in radians, normalized in [0, 2 * PI].
     * <p>
     * The angle is starting at the top and going clockwise, as expressed
     * in the css specification:
     * <p>
     *     angle = 90 - gsk_conic_gradient_node_get_rotation()
     * @return the angle for the gradient
     */
    public float getAngle() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_conic_gradient_node_get_angle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     * @return the center point for the gradient
     */
    public org.gtk.graphene.Point getCenter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_conic_gradient_node_get_center.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Point.fromAddress.marshal(RESULT, null);
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
                RESULT = (MemoryAddress) DowncallHandles.gsk_conic_gradient_node_get_color_stops.invokeExact(
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
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_conic_gradient_node_get_n_color_stops.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the rotation for the gradient in degrees.
     * @return the rotation for the gradient
     */
    public float getRotation() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_conic_gradient_node_get_rotation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_conic_gradient_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_conic_gradient_node_new = Interop.downcallHandle(
                "gsk_conic_gradient_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_angle = Interop.downcallHandle(
                "gsk_conic_gradient_node_get_angle",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_center = Interop.downcallHandle(
                "gsk_conic_gradient_node_get_center",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_color_stops = Interop.downcallHandle(
                "gsk_conic_gradient_node_get_color_stops",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_n_color_stops = Interop.downcallHandle(
                "gsk_conic_gradient_node_get_n_color_stops",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_rotation = Interop.downcallHandle(
                "gsk_conic_gradient_node_get_rotation",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_type = Interop.downcallHandle(
                "gsk_conic_gradient_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_conic_gradient_node_get_type != null;
    }
}
