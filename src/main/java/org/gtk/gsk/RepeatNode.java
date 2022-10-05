package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle gsk_repeat_node_new = Interop.downcallHandle(
        "gsk_repeat_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.graphene.Rect bounds, RenderNode child, org.gtk.graphene.Rect childBounds) {
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
    public RepeatNode(org.gtk.graphene.Rect bounds, RenderNode child, org.gtk.graphene.Rect childBounds) {
        super(constructNew(bounds, child, childBounds));
    }
    
    static final MethodHandle gsk_repeat_node_get_child = Interop.downcallHandle(
        "gsk_repeat_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the child of {@code node}.
     */
    public RenderNode getChild() {
        try {
            var RESULT = (MemoryAddress) gsk_repeat_node_get_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_repeat_node_get_child_bounds = Interop.downcallHandle(
        "gsk_repeat_node_get_child_bounds",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the bounding rectangle of the child of {@code node}.
     */
    public org.gtk.graphene.Rect getChildBounds() {
        try {
            var RESULT = (MemoryAddress) gsk_repeat_node_get_child_bounds.invokeExact(handle());
            return new org.gtk.graphene.Rect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
