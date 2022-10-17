package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a {@code GskTransform} to its single child node.
 */
public class TransformNode extends RenderNode {

    public TransformNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TransformNode */
    public static TransformNode castFrom(org.gtk.gobject.Object gobject) {
        return new TransformNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_transform_node_new = Interop.downcallHandle(
        "gsk_transform_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull Transform transform) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_transform_node_new.invokeExact(child.handle(), transform.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will transform the given {@code child}
     * with the given {@code transform}.
     */
    public TransformNode(@NotNull RenderNode child, @NotNull Transform transform) {
        super(constructNew(child, transform));
    }
    
    private static final MethodHandle gsk_transform_node_get_child = Interop.downcallHandle(
        "gsk_transform_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting transformed by the given {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_transform_node_get_transform = Interop.downcallHandle(
        "gsk_transform_node_get_transform",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GskTransform} used by the {@code node}.
     */
    public @NotNull Transform getTransform() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_node_get_transform.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, false));
    }
    
}
