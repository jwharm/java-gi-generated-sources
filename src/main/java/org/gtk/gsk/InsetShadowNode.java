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
     */
    protected InsetShadowNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InsetShadowNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InsetShadowNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        MemoryAddress RESULT;
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
    public InsetShadowNode(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        super(constructNew(outline, color, dx, dy, spread, blurRadius));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the blur radius to apply to the shadow.
     * @return the blur radius, in pixels
     */
    public float getBlurRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_blur_radius.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the color of the inset shadow.
     * @return the color of the shadow
     */
    public org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_inset_shadow_node_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.RGBA.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the horizontal offset of the inset shadow.
     * @return an offset, in pixels
     */
    public float getDx() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_dx.invokeExact(handle());
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
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_dy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the outline rectangle of the inset shadow.
     * @return a rounded rectangle
     */
    public org.gtk.gsk.RoundedRect getOutline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_inset_shadow_node_get_outline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves how much the shadow spreads inwards.
     * @return the size of the shadow, in pixels
     */
    public float getSpread() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_inset_shadow_node_get_spread.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_inset_shadow_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_inset_shadow_node_get_type != null;
    }
}
