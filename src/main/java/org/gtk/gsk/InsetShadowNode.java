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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "InsetShadowNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskInsetShadowNode", a ClassCastException will be thrown.
     */
    public static InsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskInsetShadowNode"))) {
            return new InsetShadowNode(gobject.handle(), gobject.refcounted().getOwnership());
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_inset_shadow_node_new = Interop.downcallHandle(
            "gsk_inset_shadow_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_blur_radius = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_blur_radius",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_color = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_color",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_dx = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_dx",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_dy = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_dy",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_outline = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_outline",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_inset_shadow_node_get_spread = Interop.downcallHandle(
            "gsk_inset_shadow_node_get_spread",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
    }
}
