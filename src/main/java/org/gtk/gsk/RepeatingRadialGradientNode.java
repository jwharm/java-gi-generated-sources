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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public RepeatingRadialGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to RepeatingRadialGradientNode if its GType is a (or inherits from) "GskRepeatingRadialGradientNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "RepeatingRadialGradientNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskRepeatingRadialGradientNode", a ClassCastException will be thrown.
     */
    public static RepeatingRadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskRepeatingRadialGradientNode"))) {
            return new RepeatingRadialGradientNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskRepeatingRadialGradientNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(center, "Parameter 'center' must not be null");
        java.util.Objects.requireNonNull(colorStops, "Parameter 'colorStops' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_repeating_radial_gradient_node_new.invokeExact(
                    bounds.handle(),
                    center.handle(),
                    hradius,
                    vradius,
                    start,
                    end,
                    Interop.allocateNativeArray(colorStops, false),
                    nColorStops), true);
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
    public RepeatingRadialGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_repeating_radial_gradient_node_new = Interop.downcallHandle(
            "gsk_repeating_radial_gradient_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
