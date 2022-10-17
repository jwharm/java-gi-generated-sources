package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_repeating_linear_gradient_node_new = Interop.downcallHandle(
        "gsk_repeating_linear_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_repeating_linear_gradient_node_new.invokeExact(bounds.handle(), start.handle(), end.handle(), Interop.allocateNativeArray(colorStops), nColorStops), true);
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
    public RepeatingLinearGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point start, @NotNull org.gtk.graphene.Point end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        super(constructNew(bounds, start, end, colorStops, nColorStops));
    }
    
}
