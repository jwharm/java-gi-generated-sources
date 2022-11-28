package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for an outset shadow.
 */
public class OutsetShadowNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskOutsetShadowNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a OutsetShadowNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OutsetShadowNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to OutsetShadowNode if its GType is a (or inherits from) "GskOutsetShadowNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code OutsetShadowNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskOutsetShadowNode", a ClassCastException will be thrown.
     */
    public static OutsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
            return new OutsetShadowNode(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        java.util.Objects.requireNonNull(outline, "Parameter 'outline' must not be null");
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_outset_shadow_node_new.invokeExact(
                    outline.handle(),
                    color.handle(),
                    dx,
                    dy,
                    spread,
                    blurRadius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render an outset shadow
     * around the box given by {@code outline}.
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blurRadius how much blur to apply to the shadow
     */
    public OutsetShadowNode(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        super(constructNew(outline, color, dx, dy, spread, blurRadius), Ownership.FULL);
    }
    
    /**
     * Retrieves the blur radius of the shadow.
     * @return the blur radius, in pixels
     */
    public float getBlurRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_blur_radius.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the color of the outset shadow.
     * @return a color
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_outset_shadow_node_get_color.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the horizontal offset of the outset shadow.
     * @return an offset, in pixels
     */
    public float getDx() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_dx.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the vertical offset of the outset shadow.
     * @return an offset, in pixels
     */
    public float getDy() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_dy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the outline rectangle of the outset shadow.
     * @return a rounded rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect getOutline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_outset_shadow_node_get_outline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves how much the shadow spreads outwards.
     * @return the size of the shadow, in pixels
     */
    public float getSpread() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_spread.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_outset_shadow_node_get_type.invokeExact();
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
         * A {@link OutsetShadowNode.Build} object constructs a {@link OutsetShadowNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link OutsetShadowNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link OutsetShadowNode} using {@link OutsetShadowNode#castFrom}.
         * @return A new instance of {@code OutsetShadowNode} with the properties 
         *         that were set in the Build object.
         */
        public OutsetShadowNode construct() {
            return OutsetShadowNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    OutsetShadowNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_outset_shadow_node_new = Interop.downcallHandle(
            "gsk_outset_shadow_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_blur_radius = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_blur_radius",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_color = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_color",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_dx = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_dx",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_dy = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_dy",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_outline = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_outline",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_spread = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_spread",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_type = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
