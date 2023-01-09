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
     */
    protected RepeatingRadialGradientNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RepeatingRadialGradientNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RepeatingRadialGradientNode(input);
    
    private static MemoryAddress constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_repeating_radial_gradient_node_new.invokeExact(
                        bounds.handle(),
                        center.handle(),
                        hradius,
                        vradius,
                        start,
                        end,
                        Interop.allocateNativeArray(colorStops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nColorStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public RepeatingRadialGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_repeating_radial_gradient_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_repeating_radial_gradient_node_get_type != null;
    }
}
