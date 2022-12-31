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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CairoNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CairoNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CairoNode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CairoNode(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.graphene.Rect bounds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_node_new.invokeExact(
                    bounds.handle());
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
    public CairoNode(org.gtk.graphene.Rect bounds) {
        super(constructNew(bounds), Ownership.FULL);
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
    public org.cairographics.Context getDrawContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_node_get_draw_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.Context.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the Cairo surface used by the render node.
     * @return a Cairo surface
     */
    public org.cairographics.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_node_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.Surface.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_cairo_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cairo_node_new = Interop.downcallHandle(
            "gsk_cairo_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cairo_node_get_draw_context = Interop.downcallHandle(
            "gsk_cairo_node_get_draw_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cairo_node_get_surface = Interop.downcallHandle(
            "gsk_cairo_node_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cairo_node_get_type = Interop.downcallHandle(
            "gsk_cairo_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
