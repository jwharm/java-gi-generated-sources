package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blur effect to its single child.
 */
public class BlurNode extends RenderNode {

    public BlurNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BlurNode */
    public static BlurNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlurNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_blur_node_new = Interop.downcallHandle(
        "gsk_blur_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(RenderNode child, float radius) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_blur_node_new.invokeExact(child.handle(), radius), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a render node that blurs the child.
     */
    public BlurNode(RenderNode child, float radius) {
        super(constructNew(child, radius));
    }
    
    static final MethodHandle gsk_blur_node_get_child = Interop.downcallHandle(
        "gsk_blur_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the child {@code GskRenderNode} of the blur {@code node}.
     */
    public RenderNode getChild() {
        try {
            var RESULT = (MemoryAddress) gsk_blur_node_get_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_blur_node_get_radius = Interop.downcallHandle(
        "gsk_blur_node_get_radius",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the blur radius of the {@code node}.
     */
    public float getRadius() {
        try {
            var RESULT = (float) gsk_blur_node_get_radius.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
