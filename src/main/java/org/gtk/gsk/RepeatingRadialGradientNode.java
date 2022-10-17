package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a repeating radial gradient.
 */
public class RepeatingRadialGradientNode extends RenderNode {

    public RepeatingRadialGradientNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RepeatingRadialGradientNode */
    public static RepeatingRadialGradientNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatingRadialGradientNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_repeating_radial_gradient_node_new = Interop.downcallHandle(
        "gsk_repeating_radial_gradient_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, @NotNull float hradius, @NotNull float vradius, @NotNull float start, @NotNull float end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_repeating_radial_gradient_node_new.invokeExact(bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(colorStops), nColorStops), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that draws a repeating radial gradient.
     * <p>
     * The radial gradient starts around {@code center}. The size of the gradient
     * is dictated by {@code hradius} in horizontal orientation and by {@code vradius}
     * in vertial orientation.
     */
    public RepeatingRadialGradientNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.graphene.Point center, @NotNull float hradius, @NotNull float vradius, @NotNull float start, @NotNull float end, @NotNull ColorStop[] colorStops, @NotNull long nColorStops) {
        super(constructNew(bounds, center, hradius, vradius, start, end, colorStops, nColorStops));
    }
    
}
