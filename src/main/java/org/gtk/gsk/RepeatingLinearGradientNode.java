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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a RepeatingLinearGradientNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RepeatingLinearGradientNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RepeatingLinearGradientNode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RepeatingLinearGradientNode(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeating_linear_gradient_node_new.invokeExact(
                    bounds.handle(),
                    start.handle(),
                    end.handle(),
                    Interop.allocateNativeArray(colorStops, org.gtk.gsk.ColorStop.getMemoryLayout(), false),
                    nColorStops);
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
    public RepeatingLinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_repeating_linear_gradient_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_repeating_linear_gradient_node_new = Interop.downcallHandle(
            "gsk_repeating_linear_gradient_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gsk_repeating_linear_gradient_node_get_type = Interop.downcallHandle(
            "gsk_repeating_linear_gradient_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
