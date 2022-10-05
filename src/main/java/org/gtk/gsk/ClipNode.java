package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle gsk_clip_node_new = Interop.downcallHandle(
        "gsk_clip_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(RenderNode child, org.gtk.graphene.Rect clip) {
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
    public ClipNode(RenderNode child, org.gtk.graphene.Rect clip) {
        super(constructNew(child, clip));
    }
    
    static final MethodHandle gsk_clip_node_get_child = Interop.downcallHandle(
        "gsk_clip_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     */
    public RenderNode getChild() {
        try {
            var RESULT = (MemoryAddress) gsk_clip_node_get_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_clip_node_get_clip = Interop.downcallHandle(
        "gsk_clip_node_get_clip",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the clip rectangle for {@code node}.
     */
    public org.gtk.graphene.Rect getClip() {
        try {
            var RESULT = (MemoryAddress) gsk_clip_node_get_clip.invokeExact(handle());
            return new org.gtk.graphene.Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
