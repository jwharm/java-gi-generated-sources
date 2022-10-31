package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a Cairo surface.
 */
public class CairoNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskCairoNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CairoNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CairoNode if its GType is a (or inherits from) "GskCairoNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CairoNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskCairoNode", a ClassCastException will be thrown.
     */
    public static CairoNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskCairoNode"))) {
            return new CairoNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskCairoNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_cairo_node_new.invokeExact(
                    bounds.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render a cairo surface
     * into the area given by {@code bounds}.
     * <p>
     * You can draw to the cairo surface using {@link CairoNode#getDrawContext}.
     * @param bounds the rectangle to render to
     */
    public CairoNode(@NotNull org.gtk.graphene.Rect bounds) {
        super(constructNew(bounds));
    }
    
    /**
     * Creates a Cairo context for drawing using the surface associated
     * to the render node.
     * <p>
     * If no surface exists yet, a surface will be created optimized for
     * rendering to {@code renderer}.
     * @return a Cairo context used for drawing; use
     *   cairo_destroy() when done drawing
     */
    public @NotNull org.cairographics.Context getDrawContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_node_get_draw_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Context(Refcounted.get(RESULT, true));
    }
    
    /**
     * Retrieves the Cairo surface used by the render node.
     * @return a Cairo surface
     */
    public @NotNull org.cairographics.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_node_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Surface(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cairo_node_new = Interop.downcallHandle(
            "gsk_cairo_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_cairo_node_get_draw_context = Interop.downcallHandle(
            "gsk_cairo_node_get_draw_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_cairo_node_get_surface = Interop.downcallHandle(
            "gsk_cairo_node_get_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
