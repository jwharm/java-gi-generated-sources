package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rounded rectangle clip to its single child.
 */
public class RoundedClipNode extends RenderNode {

    public RoundedClipNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RoundedClipNode */
    public static RoundedClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new RoundedClipNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_rounded_clip_node_new = Interop.downcallHandle(
        "gsk_rounded_clip_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(RenderNode child, RoundedRect clip) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_rounded_clip_node_new.invokeExact(child.handle(), clip.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will clip the {@code child} to the area
     * given by {@code clip}.
     */
    public RoundedClipNode(RenderNode child, RoundedRect clip) {
        super(constructNew(child, clip));
    }
    
    static final MethodHandle gsk_rounded_clip_node_get_child = Interop.downcallHandle(
        "gsk_rounded_clip_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     */
    public RenderNode getChild() {
        try {
            var RESULT = (MemoryAddress) gsk_rounded_clip_node_get_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_rounded_clip_node_get_clip = Interop.downcallHandle(
        "gsk_rounded_clip_node_get_clip",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the {@code node}.
     */
    public RoundedRect getClip() {
        try {
            var RESULT = (MemoryAddress) gsk_rounded_clip_node_get_clip.invokeExact(handle());
            return new RoundedRect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
