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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public OutsetShadowNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to OutsetShadowNode */
    public static OutsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new OutsetShadowNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        java.util.Objects.requireNonNull(outline, "Parameter 'outline' must not be null");
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_outset_shadow_node_new.invokeExact(outline.handle(), color.handle(), dx, dy, spread, blurRadius), true);
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
        super(constructNew(outline, color, dx, dy, spread, blurRadius));
    }
    
    /**
     * Retrieves the blur radius of the shadow.
     * @return the blur radius, in pixels
     */
    public float getBlurRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_blur_radius.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gsk_outset_shadow_node_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the horizontal offset of the outset shadow.
     * @return an offset, in pixels
     */
    public float getDx() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_dx.invokeExact(handle());
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
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_dy.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gsk_outset_shadow_node_get_outline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves how much the shadow spreads outwards.
     * @return the size of the shadow, in pixels
     */
    public float getSpread() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_outset_shadow_node_get_spread.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_outset_shadow_node_new = Interop.downcallHandle(
            "gsk_outset_shadow_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_blur_radius = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_blur_radius",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_color = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_color",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_dx = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_dx",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_dy = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_dy",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_outline = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_outline",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_outset_shadow_node_get_spread = Interop.downcallHandle(
            "gsk_outset_shadow_node_get_spread",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
    }
}
