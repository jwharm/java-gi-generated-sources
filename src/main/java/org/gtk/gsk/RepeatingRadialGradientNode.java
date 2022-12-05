package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a repeating radial gradient.
 */
public class RepeatingRadialGradientNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRepeatingRadialGradientNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a RepeatingRadialGradientNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RepeatingRadialGradientNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to RepeatingRadialGradientNode if its GType is a (or inherits from) "GskRepeatingRadialGradientNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code RepeatingRadialGradientNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskRepeatingRadialGradientNode", a ClassCastException will be thrown.
     */
    public static RepeatingRadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), RepeatingRadialGradientNode.getType())) {
            return new RepeatingRadialGradientNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskRepeatingRadialGradientNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, @NotNull org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(center, "Parameter 'center' must not be null");
        java.util.Objects.requireNonNull(colorStops, "Parameter 'colorStops' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeating_radial_gradient_node_new.invokeExact(
                    bounds.handle(),
                    center.handle(),
                    hradius,
                    vradius,
                    start,
                    end,
                    Interop.allocateNativeArray(colorStops, org.gtk.gsk.ColorStop.getMemoryLayout(), false),
                    nColorStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that draws a repeating radial gradient.
     * <p>
     * The radial gradient starts around {@code center}. The size of the gradient
     * is dictated by {@code hradius} in horizontal orientation and by {@code vradius}
     * in vertial orientation.
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
    public RepeatingRadialGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, @NotNull org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_repeating_radial_gradient_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gsk.RenderNode.Build {
        
         /**
         * A {@link RepeatingRadialGradientNode.Build} object constructs a {@link RepeatingRadialGradientNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link RepeatingRadialGradientNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RepeatingRadialGradientNode} using {@link RepeatingRadialGradientNode#castFrom}.
         * @return A new instance of {@code RepeatingRadialGradientNode} with the properties 
         *         that were set in the Build object.
         */
        public RepeatingRadialGradientNode construct() {
            return RepeatingRadialGradientNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    RepeatingRadialGradientNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_repeating_radial_gradient_node_new = Interop.downcallHandle(
            "gsk_repeating_radial_gradient_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gsk_repeating_radial_gradient_node_get_type = Interop.downcallHandle(
            "gsk_repeating_radial_gradient_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
