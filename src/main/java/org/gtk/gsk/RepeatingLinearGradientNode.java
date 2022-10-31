package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a repeating linear gradient.
 */
public class RepeatingLinearGradientNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRepeatingLinearGradientNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public RepeatingLinearGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to RepeatingLinearGradientNode if its GType is a (or inherits from) "GskRepeatingLinearGradientNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "RepeatingLinearGradientNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskRepeatingLinearGradientNode", a ClassCastException will be thrown.
     */
    public static RepeatingLinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskRepeatingLinearGradientNode"))) {
            return new RepeatingLinearGradientNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskRepeatingLinearGradientNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        java.util.Objects.requireNonNull(colorStops, "Parameter 'colorStops' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_repeating_linear_gradient_node_new.invokeExact(
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
     * Creates a {@code GskRenderNode} that will create a repeating linear gradient
     * from the given points and color stops, and render that into the area
     * given by {@code bounds}.
     * @param bounds the rectangle to render the linear gradient into
     * @param start the point at which the linear gradient will begin
     * @param end the point at which the linear gradient will finish
     * @param colorStops a pointer to an array of
     * {@code GskColorStop} defining the gradient. The offsets of all color stops
     *   must be increasing. The first stop's offset must be &gt;= 0 and the last
     *   stop's offset must be &lt;= 1.
     * @param nColorStops the number of elements in {@code color_stops}
     */
    public RepeatingLinearGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_repeating_linear_gradient_node_new = Interop.downcallHandle(
            "gsk_repeating_linear_gradient_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
