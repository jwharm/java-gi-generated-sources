package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a rectangular clip to its single child node.
 */
public class ClipNode extends RenderNode {

    public ClipNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ClipNode */
    public static ClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new ClipNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_clip_node_new = Interop.downcallHandle(
        "gsk_clip_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull org.gtk.graphene.Rect clip) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_clip_node_new.invokeExact(child.handle(), clip.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will clip the {@code child} to the area
     * given by {@code clip}.
     */
    public ClipNode(@NotNull RenderNode child, @NotNull org.gtk.graphene.Rect clip) {
        super(constructNew(child, clip));
    }
    
    private static final MethodHandle gsk_clip_node_get_child = Interop.downcallHandle(
        "gsk_clip_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_clip_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_clip_node_get_clip = Interop.downcallHandle(
        "gsk_clip_node_get_clip",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the clip rectangle for {@code node}.
     */
    public @NotNull org.gtk.graphene.Rect getClip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_clip_node_get_clip.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Rect(Refcounted.get(RESULT, false));
    }
    
}
