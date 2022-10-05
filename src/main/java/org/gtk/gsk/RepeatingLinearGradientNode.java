package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a repeating linear gradient.
 */
public class RepeatingLinearGradientNode extends RenderNode {

    public RepeatingLinearGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RepeatingLinearGradientNode */
    public static RepeatingLinearGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatingLinearGradientNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_repeating_linear_gradient_node_new = Interop.downcallHandle(
        "gsk_repeating_linear_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_repeating_linear_gradient_node_new.invokeExact(bounds.handle(), start.handle(), end.handle(), Interop.allocateNativeArray(colorStops).handle(), nColorStops), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will create a repeating linear gradient
     * from the given points and color stops, and render that into the area
     * given by {@code bounds}.
     */
    public RepeatingLinearGradientNode(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point start, org.gtk.graphene.Point end, ColorStop[] colorStops, long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
}
