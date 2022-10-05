package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blending function between its two child nodes.
 */
public class BlendNode extends RenderNode {

    public BlendNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BlendNode */
    public static BlendNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlendNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_blend_node_new = Interop.downcallHandle(
        "gsk_blend_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(RenderNode bottom, RenderNode top, BlendMode blendMode) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_blend_node_new.invokeExact(bottom.handle(), top.handle(), blendMode.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will use {@code blend_mode} to blend the {@code top}
     * node onto the {@code bottom} node.
     */
    public BlendNode(RenderNode bottom, RenderNode top, BlendMode blendMode) {
        super(constructNew(bottom, top, blendMode));
    }
    
    static final MethodHandle gsk_blend_node_get_blend_mode = Interop.downcallHandle(
        "gsk_blend_node_get_blend_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the blend mode used by {@code node}.
     */
    public BlendMode getBlendMode() {
        try {
            var RESULT = (int) gsk_blend_node_get_blend_mode.invokeExact(handle());
            return new BlendMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_blend_node_get_bottom_child = Interop.downcallHandle(
        "gsk_blend_node_get_bottom_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the bottom {@code GskRenderNode} child of the {@code node}.
     */
    public RenderNode getBottomChild() {
        try {
            var RESULT = (MemoryAddress) gsk_blend_node_get_bottom_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_blend_node_get_top_child = Interop.downcallHandle(
        "gsk_blend_node_get_top_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the top {@code GskRenderNode} child of the {@code node}.
     */
    public RenderNode getTopChild() {
        try {
            var RESULT = (MemoryAddress) gsk_blend_node_get_top_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
