package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for an inset shadow.
 */
public class InsetShadowNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskInsetShadowNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a InsetShadowNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InsetShadowNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InsetShadowNode if its GType is a (or inherits from) "GskInsetShadowNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InsetShadowNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskInsetShadowNode", a ClassCastException will be thrown.
     */
    public static InsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), InsetShadowNode.getType())) {
            return new InsetShadowNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskInsetShadowNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        java.util.Objects.requireNonNull(outline, "Parameter 'outline' must not be null");
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_inset_shadow_node_new.invokeExact(
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
     * Creates a {@code GskRenderNode} that will render an inset shadow
     * into the box given by {@code outline}.
     * @param outline outline of the region containing the shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blurRadius how much blur to apply to the shadow
     */
    public InsetShadowNode(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        super(constructNew(outline, color, dx, dy, spread, blurRadius), Ownership.FULL);
    }
    
    /**
     * Retrieves the blur radius to apply to the shadow.
     * @return the blur radius, in pixels
     */
    public float getBlurRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_blur_radius.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the color of the inset shadow.
     * @return the color of the shadow
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_inset_shadow_node_get_color.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the horizontal offset of the inset shadow.
     * @return an offset, in pixels
     */
    public float getDx() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_dx.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the vertical offset of the inset shadow.
     * @return an offset, in pixels
     */
    public float getDy() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_dy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the outline rectangle of the inset shadow.
     * @return a rounded rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect getOutline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_inset_shadow_node_get_outline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves how much the shadow spreads inwards.
     * @return the size of the shadow, in pixels
     */
    public float getSpread() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_spread.invokeExact(
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
            RESULT = (long) DowncallHandles.gsk_inset_shadow_node_get_type.invokeExact();
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
         * A {@link InsetShadowNode.Build} object constructs a {@link InsetShadowNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InsetShadowNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InsetShadowNode} using {@link InsetShadowNode#castFrom}.
         * @return A new instance of {@code InsetShadowNode} with the properties 
         *         that were set in the Build object.
         */
        public InsetShadowNode construct() {
            return InsetShadowNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InsetShadowNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_inset_shadow_node_new = Interop.downcallHandle(
            "gsk_inset_shadow_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_blur_radius = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_blur_radius",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_color = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_color",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_dx = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_dx",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_dy = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_dy",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_outline = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_outline",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_spread = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_spread",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_type = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
