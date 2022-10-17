package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node repeating its single child node.
 */
public class RepeatNode extends RenderNode {

    public RepeatNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RepeatNode */
    public static RepeatNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_repeat_node_new = Interop.downcallHandle(
        "gsk_repeat_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull RenderNode child, @Nullable org.gtk.graphene.Rect childBounds) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_repeat_node_new.invokeExact(bounds.handle(), child.handle(), childBounds.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will repeat the drawing of {@code child} across
     * the given {@code bounds}.
     */
    public RepeatNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull RenderNode child, @Nullable org.gtk.graphene.Rect childBounds) {
        super(constructNew(bounds, child, childBounds));
    }
    
    private static final MethodHandle gsk_repeat_node_get_child = Interop.downcallHandle(
        "gsk_repeat_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the child of {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_repeat_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_repeat_node_get_child_bounds = Interop.downcallHandle(
        "gsk_repeat_node_get_child_bounds",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the bounding rectangle of the child of {@code node}.
     */
    public @NotNull org.gtk.graphene.Rect getChildBounds() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_repeat_node_get_child_bounds.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Rect(Refcounted.get(RESULT, false));
    }
    
}
