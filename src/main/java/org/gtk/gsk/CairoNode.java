package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a Cairo surface.
 */
public class CairoNode extends RenderNode {

    public CairoNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CairoNode */
    public static CairoNode castFrom(org.gtk.gobject.Object gobject) {
        return new CairoNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_cairo_node_new = Interop.downcallHandle(
        "gsk_cairo_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_cairo_node_new.invokeExact(bounds.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render a cairo surface
     * into the area given by {@code bounds}.
     * <p>
     * You can draw to the cairo surface using {@link CairoNode#getDrawContext}.
     */
    public CairoNode(@NotNull org.gtk.graphene.Rect bounds) {
        super(constructNew(bounds));
    }
    
    private static final MethodHandle gsk_cairo_node_get_draw_context = Interop.downcallHandle(
        "gsk_cairo_node_get_draw_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a Cairo context for drawing using the surface associated
     * to the render node.
     * <p>
     * If no surface exists yet, a surface will be created optimized for
     * rendering to {@code renderer}.
     */
    public @NotNull org.cairographics.Context getDrawContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_cairo_node_get_draw_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Context(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_cairo_node_get_surface = Interop.downcallHandle(
        "gsk_cairo_node_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the Cairo surface used by the render node.
     */
    public @NotNull org.cairographics.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_cairo_node_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Surface(Refcounted.get(RESULT, false));
    }
    
}
