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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ConicGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ConicGradientNode if its GType is a (or inherits from) "GskConicGradientNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ConicGradientNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskConicGradientNode", a ClassCastException will be thrown.
     */
    public static ConicGradientNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskConicGradientNode"))) {
            return new ConicGradientNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskConicGradientNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(center, "Parameter 'center' must not be null");
        java.util.Objects.requireNonNull(colorStops, "Parameter 'colorStops' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_conic_gradient_node_new.invokeExact(
                    bounds.handle(),
                    center.handle(),
                    rotation,
                    Interop.allocateNativeArray(colorStops, false),
                    nColorStops), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public ConicGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, rotation, colorStops, nColorStops));
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
            RESULT = (float) DowncallHandles.gsk_conic_gradient_node_get_angle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     * @return the center point for the gradient
     */
    public @NotNull org.gtk.graphene.Point getCenter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_conic_gradient_node_get_center.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
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
            RESULT = (MemoryAddress) DowncallHandles.gsk_conic_gradient_node_get_color_stops.invokeExact(
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
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_conic_gradient_node_get_n_color_stops.invokeExact(
                    handle());
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
            RESULT = (float) DowncallHandles.gsk_conic_gradient_node_get_rotation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_conic_gradient_node_new = Interop.downcallHandle(
            "gsk_conic_gradient_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_angle = Interop.downcallHandle(
            "gsk_conic_gradient_node_get_angle",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_center = Interop.downcallHandle(
            "gsk_conic_gradient_node_get_center",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_color_stops = Interop.downcallHandle(
            "gsk_conic_gradient_node_get_color_stops",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_n_color_stops = Interop.downcallHandle(
            "gsk_conic_gradient_node_get_n_color_stops",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_conic_gradient_node_get_rotation = Interop.downcallHandle(
            "gsk_conic_gradient_node_get_rotation",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
    }
}
