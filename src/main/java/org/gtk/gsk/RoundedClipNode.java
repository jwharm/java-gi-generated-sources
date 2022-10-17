package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_rounded_clip_node_new = Interop.downcallHandle(
        "gsk_rounded_clip_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull RoundedRect clip) {
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
    public RoundedClipNode(@NotNull RenderNode child, @NotNull RoundedRect clip) {
        super(constructNew(child, clip));
    }
    
    private static final MethodHandle gsk_rounded_clip_node_get_child = Interop.downcallHandle(
        "gsk_rounded_clip_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_clip_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_rounded_clip_node_get_clip = Interop.downcallHandle(
        "gsk_rounded_clip_node_get_clip",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the {@code node}.
     */
    public @NotNull RoundedRect getClip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_rounded_clip_node_get_clip.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
}
