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
    @ApiStatus.Internal
    public CairoNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CairoNode if its GType is a (or inherits from) "GskCairoNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CairoNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskCairoNode", a ClassCastException will be thrown.
     */
    public static CairoNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CairoNode.getType())) {
            return new CairoNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskCairoNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.graphene.Rect bounds) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        Addressable RESULT;
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
    public CairoNode(@NotNull org.gtk.graphene.Rect bounds) {
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
    public @NotNull org.cairographics.Context getDrawContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cairo_node_get_draw_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Context(RESULT, Ownership.FULL);
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
        return new org.cairographics.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_cairo_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gsk.RenderNode.Build {
        
         /**
         * A {@link CairoNode.Build} object constructs a {@link CairoNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CairoNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CairoNode} using {@link CairoNode#castFrom}.
         * @return A new instance of {@code CairoNode} with the properties 
         *         that were set in the Build object.
         */
        public CairoNode construct() {
            return CairoNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CairoNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
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
