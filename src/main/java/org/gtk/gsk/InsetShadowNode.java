package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_inset_shadow_node_new = Interop.downcallHandle(
        "gsk_inset_shadow_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(@NotNull RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, @NotNull float dx, @NotNull float dy, @NotNull float spread, @NotNull float blurRadius) {
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
    public InsetShadowNode(@NotNull RoundedRect outline, @NotNull org.gtk.gdk.RGBA color, @NotNull float dx, @NotNull float dy, @NotNull float spread, @NotNull float blurRadius) {
        super(constructNew(outline, color, dx, dy, spread, blurRadius));
    }
    
    private static final MethodHandle gsk_inset_shadow_node_get_blur_radius = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_blur_radius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the blur radius to apply to the shadow.
     */
    public float getBlurRadius() {
        float RESULT;
        try {
            RESULT = (float) gsk_inset_shadow_node_get_blur_radius.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_inset_shadow_node_get_color = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color of the inset shadow.
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_inset_shadow_node_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_inset_shadow_node_get_dx = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_dx",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the horizontal offset of the inset shadow.
     */
    public float getDx() {
        float RESULT;
        try {
            RESULT = (float) gsk_inset_shadow_node_get_dx.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_inset_shadow_node_get_dy = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_dy",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the vertical offset of the inset shadow.
     */
    public float getDy() {
        float RESULT;
        try {
            RESULT = (float) gsk_inset_shadow_node_get_dy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_inset_shadow_node_get_outline = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_outline",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the outline rectangle of the inset shadow.
     */
    public @NotNull RoundedRect getOutline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_inset_shadow_node_get_outline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_inset_shadow_node_get_spread = Interop.downcallHandle(
        "gsk_inset_shadow_node_get_spread",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves how much the shadow spreads inwards.
     */
    public float getSpread() {
        float RESULT;
        try {
            RESULT = (float) gsk_inset_shadow_node_get_spread.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
