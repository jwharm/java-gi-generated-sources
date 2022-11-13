package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a radial gradient.
 */
public class RadialGradientNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRadialGradientNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a RadialGradientNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RadialGradientNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to RadialGradientNode if its GType is a (or inherits from) "GskRadialGradientNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code RadialGradientNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskRadialGradientNode", a ClassCastException will be thrown.
     */
    public static RadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskRadialGradientNode"))) {
            return new RadialGradientNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskRadialGradientNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, @NotNull org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(center, "Parameter 'center' must not be null");
        java.util.Objects.requireNonNull(colorStops, "Parameter 'colorStops' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_radial_gradient_node_new.invokeExact(
                    bounds.handle(),
                    center.handle(),
                    hradius,
                    vradius,
                    start,
                    end,
                    Interop.allocateNativeArray(colorStops, false),
                    nColorStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that draws a radial gradient.
     * <p>
     * The radial gradient
     * starts around {@code center}. The size of the gradient is dictated by {@code hradius}
     * in horizontal orientation and by {@code vradius} in vertial orientation.
     * @param bounds the bounds of the node
     * @param center the center of the gradient
     * @param hradius the horizontal radius
     * @param vradius the vertical radius
     * @param start a percentage &gt;= 0 that defines the start of the gradient around {@code center}
     * @param end a percentage &gt;= 0 that defines the end of the gradient around {@code center}
     * @param colorStops a pointer to an array of
     *   {@code GskColorStop} defining the gradient. The offsets of all color stops
     *   must be increasing. The first stop's offset must be &gt;= 0 and the last
     *   stop's offset must be &lt;= 1.
     * @param nColorStops the number of elements in {@code color_stops}
     */
    public RadialGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, @NotNull org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops), Ownership.FULL);
    }
    
    /**
     * Retrieves the center pointer for the gradient.
     * @return the center point for the gradient
     */
    public @NotNull org.gtk.graphene.Point getCenter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_radial_gradient_node_get_center.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gsk_radial_gradient_node_get_color_stops.invokeExact(
                    handle(),
                    (Addressable) nStopsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nStops.set(nStopsPOINTER.get(ValueLayout.JAVA_LONG, 0));
        org.gtk.gsk.ColorStop[] resultARRAY = new org.gtk.gsk.ColorStop[nStops.get().intValue()];
        for (int I = 0; I < nStops.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gsk.ColorStop(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * Retrieves the end value for the gradient.
     * @return the end value for the gradient
     */
    public float getEnd() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_radial_gradient_node_get_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the horizonal radius for the gradient.
     * @return the horizontal radius for the gradient
     */
    public float getHradius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_radial_gradient_node_get_hradius.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
     */
    public long getNColorStops() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_radial_gradient_node_get_n_color_stops.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the start value for the gradient.
     * @return the start value for the gradient
     */
    public float getStart() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_radial_gradient_node_get_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the vertical radius for the gradient.
     * @return the vertical radius for the gradient
     */
    public float getVradius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_radial_gradient_node_get_vradius.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_radial_gradient_node_new = Interop.downcallHandle(
            "gsk_radial_gradient_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_center = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_center",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_color_stops = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_color_stops",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_end = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_end",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_hradius = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_hradius",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_n_color_stops = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_n_color_stops",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_start = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_start",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_radial_gradient_node_get_vradius = Interop.downcallHandle(
            "gsk_radial_gradient_node_get_vradius",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
    }
}
