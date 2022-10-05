package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for an inset shadow.
 */
public class InsetShadowNode extends RenderNode {

    public InsetShadowNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InsetShadowNode */
    public static InsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new InsetShadowNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_inset_shadow_node_new = Interop.downcallHandle(
        "gsk_inset_shadow_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_inset_shadow_node_new.invokeExact(outline.handle(), color.handle(), dx, dy, spread, blurRadius), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render an inset shadow
     * into the box given by {@code outline}.
     */
    public InsetShadowNode(RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        super(constructNew(outline, color, dx, dy, spread, blurRadius));
    }
    
    static final MethodHandle gsk_inset_shadow_node_get_blur_radius = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_blur_radius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the blur radius to apply to the shadow.
     */
    public float getBlurRadius() {
        try {
            var RESULT = (float) gsk_inset_shadow_node_get_blur_radius.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_inset_shadow_node_get_color = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color of the inset shadow.
     */
    public org.gtk.gdk.RGBA getColor() {
        try {
            var RESULT = (MemoryAddress) gsk_inset_shadow_node_get_color.invokeExact(handle());
            return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_inset_shadow_node_get_dx = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_dx",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the horizontal offset of the inset shadow.
     */
    public float getDx() {
        try {
            var RESULT = (float) gsk_inset_shadow_node_get_dx.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_inset_shadow_node_get_dy = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_dy",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the vertical offset of the inset shadow.
     */
    public float getDy() {
        try {
            var RESULT = (float) gsk_inset_shadow_node_get_dy.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_inset_shadow_node_get_outline = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_outline",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the outline rectangle of the inset shadow.
     */
    public RoundedRect getOutline() {
        try {
            var RESULT = (MemoryAddress) gsk_inset_shadow_node_get_outline.invokeExact(handle());
            return new RoundedRect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_inset_shadow_node_get_spread = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_spread",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves how much the shadow spreads inwards.
     */
    public float getSpread() {
        try {
            var RESULT = (float) gsk_inset_shadow_node_get_spread.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
